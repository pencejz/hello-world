package day09;
/**
 * 线程提供了一个静态方法sleep
 * static void sleep(long ms)
 * 该方法可以让运行该方法的线程进入阻塞指定毫秒
 * 超时后，该线程会再次回到Runnable状态，一旦获取了时间片会再次开始运行
 * @author Administrator
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		
		System.out.println("程序开始");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("等待时间："+(end-start));
		System.out.println("程序结束");
		
		
		
	}//main
}
