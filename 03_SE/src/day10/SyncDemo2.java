package day10;
/**
 * 有效地缩小同步范围，可以在保证安全的前提下提高并发的效率
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
//			System.out.println(t+"正在挑衣服...");
//			Thread.sleep(1000);
//			System.out.println(t+"正在试衣服...");
//			Thread.sleep(1000);
//			System.out.println(t+"结账离开。");
//		}catch(Exception e){
//			e.getStackTrace();
//		}
//	}
	
	public void buy(){
		try{
			Thread t = Thread.currentThread();
			System.out.println(t+"正在挑衣服...");
			Thread.sleep(2000);
			/**
			 * 同步块
			 * 同步块可以缩小同步的范围，更准确的包含住需要同U币的代码片段
			 * 同步块需要指定“同步监视器”（上锁的对象）
			 * 若想多个线程需要排队效果，那么就要保证看到的同步监视器对象是同一个，在方法中通常使用this表示
			 */
			synchronized (this) {
				System.out.println(t+"正在试衣服...");
				Thread.sleep(2000);
			}
			System.out.println(t+"结账离开。");
		}catch(Exception e){
			e.getStackTrace();
		}
	}
	
	
	
}























