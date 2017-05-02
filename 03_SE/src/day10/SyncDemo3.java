package day10;
/**
 * 静态方法上使用同步锁
 * 由于静态方法所属类，所以全局只有一份。那么在静态方法上若使用Synchronized，该方法一定具有同步效果，与对象无关
 * 实际上，静态方法的上锁对象为当前类的类对象
 * @author sss
 *
 */
public class SyncDemo3 {

	public static void main(String[] args) {
		
		final Foo f1 = new Foo();
		final Foo f2 = new Foo();
		
		Thread t1 = new Thread(){
			public void run(){
				f1.dosome();
				//Foo.dosome(); //静态方法可以使用类名直接调用。f1、f2调用的是同一个静态方法
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				f2.dosome();
				//Foo.dosome();
			}
		};
		
		t1.start();
		t2.start();
		
	}//main
}
class Foo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t+"正在执行dosome方法...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"执行dosome方法完成！");
	}
}

















