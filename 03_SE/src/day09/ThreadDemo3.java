package day09;
/**
 * ʹ�������ڲ�����ʽ����ɷ�ʽ1�ͷ�ʽ2���̴߳���
 * @author Administrator
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//MyThread();
		MyRunnable();
		
	}//main
	
	//ʹ��Thread�ഴ���߳�
	public static void MyThread(){
		
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭����");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ��ģ�");
				}
			}
		};
		t1.start();
		t2.start();
	}
	
	//ʹ��Runnable�ӿڴ����߳�
	public static void MyRunnable(){
		Runnable r1 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭����");
				}
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ��ģ�");
				}
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
}

class A{
	public void print(){
		System.out.println("����A��");
	}
}

