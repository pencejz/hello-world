package day09;
/**
 * 线程提供了一个静态方法
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程
 * @author Administrator
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("main方法运行的线程是："+t);
		/*
		 * 运行结果：Thread[main,5,main]
		 */
		dosome();
		Thread m = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		m.start();
		/**
		 * 若希望获取某个方法的线程是什么
		 * 就可以在这个方法中使用Thread的静态方法currentThread来获取
		 */
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("dosome方法运行的线程是："+t);
	}
}
