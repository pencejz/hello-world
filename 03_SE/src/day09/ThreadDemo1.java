package day09;
/**
 * �߳������ִ���ģʽ��
 * ��1��.�̳�Thread�ಢ��дrun����
 * ��2��.ʵ��Runnable�ӿڲ���дrun����
 * @author Administrator
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/**
		 * �����߳�Ҫ����start�����������ǵ���run����
		 * 
		 * �̲߳��ܸ����̵߳��ȵĹ����������м������ɿص����أ�
		 * 1.CPUʱ��Ƭ������Ǹ��߳�
		 * 2.����ʱ��ĳ���
		 * 
		 * �߳�ֻ�ܱ����ı�����CPUʱ�䣬����������ȡ
		 * �̵߳��Ⱦ����ܾ��ȵؽ�ʱ��Ƭ�ļ��ʷ���������̡߳����ǲ���֤ÿ���߳���һ����ѵִֻ��һ��
		 */
		t1.start();
		t2.start();
	}
}
/**
 * ��һ�ִ����̵߳ķ��ظ�ʽ���������㣺
 * 1.����java�ǵ��̳еģ���͵����˵�ǰ�����̳���Thread�Ͳ��ܼ̳��������ˣ�����ʵ�ʿ����в����
 * 2.���̳���Thread����Ҫ��д���е�run�����������߳�������͵������߳����߳�Ҫִ�е�������һ��ǿ��Ϲ�ϵ
 * �����̵߳���Ҫ�Ա�úܲ�
 * @author Administrator
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ��ģ�");
		}
	}
}