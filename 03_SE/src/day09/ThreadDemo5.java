package day09;
/**
 * 获取线程的相关信息
 * @author Administrator
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//获取运行mian方法的线程
		Thread main = Thread.currentThread();
		//查看线程名字---String getName()
		System.out.println("name："+main.getName());
		//查看线程的id---long getId()
		System.out.println("id："+main.getId());
		//查看线程的优先级---int getPriority()
		System.out.println("priority："+main.getPriority());
		//查看线程是否还活着---boolean isAlive()
		System.out.println("isAlive："+main.isAlive());
		//查看线程是否为守护线程---boolean isDaemon()
		System.out.println("isDaemon："+main.isDaemon());
		//查看线程是否被中断---boolean isInterrupted()
		System.out.println("isInterrupted："+main.isInterrupted());
		
		
	}
}
