package day10;
/**
 * ��Ч����Сͬ����Χ�������ڱ�֤��ȫ��ǰ������߲�����Ч��
 * @author sss
 *
 */
public class SyncDemo2 {

	public static void main(String[] args) {
		final Shop shop = new Shop();
		
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
		
	}
}

class Shop{
	
//	public synchronized void buy(){
//		try{
//			Thread t = Thread.currentThread();
//			System.out.println(t+"�������·�...");
//			Thread.sleep(1000);
//			System.out.println(t+"�������·�...");
//			Thread.sleep(1000);
//			System.out.println(t+"�����뿪��");
//		}catch(Exception e){
//			e.getStackTrace();
//		}
//	}
	
	public void buy(){
		try{
			Thread t = Thread.currentThread();
			System.out.println(t+"�������·�...");
			Thread.sleep(2000);
			/**
			 * ͬ����
			 * ͬ���������Сͬ���ķ�Χ����׼ȷ�İ���ס��ҪͬU�ҵĴ���Ƭ��
			 * ͬ������Ҫָ����ͬ�����������������Ķ���
			 * �������߳���Ҫ�Ŷ�Ч������ô��Ҫ��֤������ͬ��������������ͬһ�����ڷ�����ͨ��ʹ��this��ʾ
			 */
			synchronized (this) {
				System.out.println(t+"�������·�...");
				Thread.sleep(2000);
			}
			System.out.println(t+"�����뿪��");
		}catch(Exception e){
			e.getStackTrace();
		}
	}
	
	
	
}























