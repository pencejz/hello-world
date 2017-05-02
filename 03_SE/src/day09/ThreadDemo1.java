package day09;
/**
 * 线程有两种创建模式：
 * 第1种.继承Thread类并重写run方法
 * 第2种.实现Runnable接口并重写run方法
 * @author Administrator
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/**
		 * 启动线程要调用start方法，而不是调用run方法
		 * 
		 * 线程不能干涉线程调度的工作，所以有几个不可控的因素：
		 * 1.CPU时间片分配给那个线程
		 * 2.分配时间的长短
		 * 
		 * 线程只能被动的被分配CPU时间，不能主动索取
		 * 线程调度尽可能均匀地将时间片的几率分配给所有线程。但是不保证每个线程在一次轮训只执行一次
		 */
		t1.start();
		t2.start();
	}
}
/**
 * 第一种创建线程的返回格式有两个不足：
 * 1.由于java是单继承的，这就导致了当前类若继承了Thread就不能继承其他类了，这在实际开发中不灵活
 * 2.当继承了Thread还需要重写其中的run方法来定义线程任务，这就导致了线程与线程要执行的任务有一个强耦合关系
 * 导致线程的重要性变得很差
 * @author Administrator
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的！");
		}
	}
}