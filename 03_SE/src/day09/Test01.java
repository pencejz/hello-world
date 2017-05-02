package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 电子表
 * 没描述出一次当前系统时间时间
 * 格式：HH:mm:ss
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
//		clock();
		
		/**
		 * 课后练习：
		 * 1.使用线程方式一创建两个线程：分别输出1000次，你好和再见
		 * 2.使用线程方式二创建两个线程：分别输出1000次，你好和再见
		 * 3.使用Thread类匿名内部类方式创建两个线程：分别输出1000次，你好和再见
		 * 4.使用Runnable接口匿名内部类方式创建两个线程：分别输出1000次，你好和再见
		 * 5.创建一个线程，每秒输出一次当前系统时间：yyyy~MM~dd~HH~mm~ss
		 */
		
//		test1();
		
//		test2();
		
//		test3();
		
//		test4();
		
//		test5();
		
	}//main
	
	/**
	 * 电子表
	 * 每秒输出一次当前系统时间时间
	 * 格式：HH:mm:ss
	 */
	public static void clock(){
		//设置日期显示格式
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date date = new Date(); //1
			String str = sdf.format(date); //2
			System.out.println(str); //3
			//以上123行可以简写为：System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void test1(){
		//创建线程
		Thread t1 = new Test1Thread1();
		Thread t2 = new Test1Thread2();
		//启动线程
		t1.start();
		t2.start();
	}
	
	public static void test2(){
		//创建任务
		Runnable r1 = new Test2Runnable1();
		Runnable r2 = new test2Runnable2();
		//创建线程
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//启动线程
		t1.start();
		t2.start();
	}
	
	public static void test3(){
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你好！");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("再见！");
				}
			}
		};
		//启动线程
		t1.start();
		t2.start();
	}
	
	public static void test4(){
		//创建任务
		Runnable r1 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你好！");
				}
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("再见！");
				}
			}
		};
		//创建线程
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//启动线程
		t1.start();
		t2.start();
	}
	
	public static void test5(){
		//设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy~MM~dd~HH~mm~ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
class Test1Thread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你好！");
		}
	}
}
class Test1Thread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("再见！");
		}
	}
}

class Test2Runnable1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你好！");
		}
	}
}
class test2Runnable2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("再见！");
		}
	}
}
















