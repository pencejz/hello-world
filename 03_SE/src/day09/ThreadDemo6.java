package day09;
/**
 * 线程优先级priority
 * @author Administrator
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("norm");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("max");
				}
			}
		};
		
		/**
		 * void setPriority(int p)
		 * 设置线程的优先级
		 * 优先级从1-10，1为最底，10为最高
		 * 理论上优先级越高的线程获取CPU的时间片的次数越多
		 */
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
		
		
		
	} //mian
}
