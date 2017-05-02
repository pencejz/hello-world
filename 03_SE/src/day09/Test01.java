package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ӱ�
 * û������һ�ε�ǰϵͳʱ��ʱ��
 * ��ʽ��HH:mm:ss
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
//		clock();
		
		/**
		 * �κ���ϰ��
		 * 1.ʹ���̷߳�ʽһ���������̣߳��ֱ����1000�Σ���ú��ټ�
		 * 2.ʹ���̷߳�ʽ�����������̣߳��ֱ����1000�Σ���ú��ټ�
		 * 3.ʹ��Thread�������ڲ��෽ʽ���������̣߳��ֱ����1000�Σ���ú��ټ�
		 * 4.ʹ��Runnable�ӿ������ڲ��෽ʽ���������̣߳��ֱ����1000�Σ���ú��ټ�
		 * 5.����һ���̣߳�ÿ�����һ�ε�ǰϵͳʱ�䣺yyyy~MM~dd~HH~mm~ss
		 */
		
//		test1();
		
//		test2();
		
//		test3();
		
//		test4();
		
//		test5();
		
	}//main
	
	/**
	 * ���ӱ�
	 * ÿ�����һ�ε�ǰϵͳʱ��ʱ��
	 * ��ʽ��HH:mm:ss
	 */
	public static void clock(){
		//����������ʾ��ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date date = new Date(); //1
			String str = sdf.format(date); //2
			System.out.println(str); //3
			//����123�п��Լ�дΪ��System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void test1(){
		//�����߳�
		Thread t1 = new Test1Thread1();
		Thread t2 = new Test1Thread2();
		//�����߳�
		t1.start();
		t2.start();
	}
	
	public static void test2(){
		//��������
		Runnable r1 = new Test2Runnable1();
		Runnable r2 = new test2Runnable2();
		//�����߳�
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//�����߳�
		t1.start();
		t2.start();
	}
	
	public static void test3(){
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("��ã�");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("�ټ���");
				}
			}
		};
		//�����߳�
		t1.start();
		t2.start();
	}
	
	public static void test4(){
		//��������
		Runnable r1 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("��ã�");
				}
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("�ټ���");
				}
			}
		};
		//�����߳�
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//�����߳�
		t1.start();
		t2.start();
	}
	
	public static void test5(){
		//�������ڸ�ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy~MM~dd~HH~mm~ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
class Test1Thread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("��ã�");
		}
	}
}
class Test1Thread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("�ټ���");
		}
	}
}

class Test2Runnable1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("��ã�");
		}
	}
}
class test2Runnable2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("�ټ���");
		}
	}
}
















