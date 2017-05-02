package day10;
/**
 * synchronized�Ļ���Ч��
 * ��synchronized�����˶�β�ͬ���룬����Щ�����ͬ��������������ͬʱ����ô��Щ�����;����˻���Ч��������
 * ����̲߳���ͬʱ������Щ����
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
		System.out.println("����ִ��A����...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"ִ��A������ϣ�");
	}
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		System.out.println("����ִ��B����...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(t+"ִ��B������ϣ�");
	}
	
	
}














