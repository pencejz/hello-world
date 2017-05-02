package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题：
 * 1.控制线程数量
 * 2.重用线程
 * 线程数量不能随着任务的增多而无止境的创建，这会导致内存开销大，CPU过度切换，严重拖慢系统性能，甚至崩溃
 * 并且线程频繁的创建与销毁也hi给系统带来不小的负担
 * 因此，我们需要控制线程数量，并重用已经创建的线程
 * @author sss
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		/**
		 * 创建一个固定大小的线程池
		 */
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		//创建任务
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					System.out.println(t+"开始执行任务...");
					try {
						Thread.sleep(2000);
						System.out.println(t+"任务执行完毕！");
					} catch (InterruptedException e) {
//						e.printStackTrace(); //输出具体出错的行数位置
						System.out.println(t+"执行任务出错！");
					}
				}
			};
			//将任务指派给线程池
			threadPool.execute(runn);
			System.out.println("将任务"+i+"指派给线程池");
		}
		/**
		 * 停止线程池的方法有两个：
		 * shutdown方法和shutdownNow方法的区别：
		 * shutdown方法关闭线程池后，要等到线程池将所有的任务运行完毕才会停止
		 * shutdownNow方法会强制将线程池中所有线程中断来立刻停止线程
		 */
		threadPool.shutdownNow();
		System.out.println("停止线程池！");
		
		
		
	} //main
	
}














