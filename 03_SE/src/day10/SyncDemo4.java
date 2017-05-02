package day10;
/**
 * synchronized的互斥效果
 * 当synchronized括上了多段不同代码，而这些代码的同步监视器对象相同时，那么这些代码间就具有了互斥效果。即：
 * 多个线程不能同时访问这些方法
 * @author sss
 *
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		
		final Boo b = new Boo();
		
		Thread t1 = new Thread(){
			public void run(){
				b.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				b.methodB();
			}
		};
		t1.start();
		t2.start();
		
	}
}

class Boo{
	
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		System.out.println("正在执行A方法...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"执行A方法完毕！");
	}
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		System.out.println("正在执行B方法...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"执行B方法完毕！");
	}
	
	
}














