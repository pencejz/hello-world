package day10;
/**
 * ��̬������ʹ��ͬ����
 * ���ھ�̬���������࣬����ȫ��ֻ��һ�ݡ���ô�ھ�̬��������ʹ��Synchronized���÷���һ������ͬ��Ч����������޹�
 * ʵ���ϣ���̬��������������Ϊ��ǰ��������
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
				//Foo.dosome(); //��̬��������ʹ������ֱ�ӵ��á�f1��f2���õ���ͬһ����̬����
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
		System.out.println(t+"����ִ��dosome����...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"ִ��dosome������ɣ�");
	}
}

















