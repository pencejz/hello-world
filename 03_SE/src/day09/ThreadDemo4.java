package day09;
/**
 * �߳��ṩ��һ����̬����
 * static Thread currentThread()
 * �÷������Ի�ȡ��������������߳�
 * @author Administrator
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("main�������е��߳��ǣ�"+t);
		/*
		 * ���н����Thread[main,5,main]
		 */
		dosome();
		Thread m = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		m.start();
		/**
		 * ��ϣ����ȡĳ���������߳���ʲô
		 * �Ϳ��������������ʹ��Thread�ľ�̬����currentThread����ȡ
		 */
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("dosome�������е��߳��ǣ�"+t);
	}
}
