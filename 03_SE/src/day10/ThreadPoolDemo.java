package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ����������⣺
 * 1.�����߳�����
 * 2.�����߳�
 * �߳�������������������������ֹ���Ĵ�������ᵼ���ڴ濪����CPU�����л�����������ϵͳ���ܣ���������
 * �����߳�Ƶ���Ĵ���������Ҳhi��ϵͳ������С�ĸ���
 * ��ˣ�������Ҫ�����߳��������������Ѿ��������߳�
 * @author sss
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		/**
		 * ����һ���̶���С���̳߳�
		 */
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		//��������
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					System.out.println(t+"��ʼִ������...");
					try {
						Thread.sleep(2000);
						System.out.println(t+"����ִ����ϣ�");
					} catch (InterruptedException e) {
//						e.printStackTrace(); //���������������λ��
						System.out.println(t+"ִ���������");
					}
				}
			};
			//������ָ�ɸ��̳߳�
			threadPool.execute(runn);
			System.out.println("������"+i+"ָ�ɸ��̳߳�");
		}
		/**
		 * ֹͣ�̳߳صķ�����������
		 * shutdown������shutdownNow����������
		 * shutdown�����ر��̳߳غ�Ҫ�ȵ��̳߳ؽ����е�����������ϲŻ�ֹͣ
		 * shutdownNow������ǿ�ƽ��̳߳��������߳��ж�������ֹͣ�߳�
		 */
		threadPool.shutdownNow();
		System.out.println("ֹͣ�̳߳أ�");
		
		
		
	} //main
	
}














