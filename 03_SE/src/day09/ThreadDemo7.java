package day09;
/**
 * �߳��ṩ��һ����̬����sleep
 * static void sleep(long ms)
 * �÷������������и÷������߳̽�������ָ������
 * ��ʱ�󣬸��̻߳��ٴλص�Runnable״̬��һ����ȡ��ʱ��Ƭ���ٴο�ʼ����
 * @author Administrator
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		
		System.out.println("����ʼ");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("�ȴ�ʱ�䣺"+(end-start));
		System.out.println("�������");
		
		
		
	}//main
}
