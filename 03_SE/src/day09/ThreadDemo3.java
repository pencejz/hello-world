package day09;
/**
 * 使用匿名内部类形式，完成方式1和方式2的线程创建
 * @author Administrator
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//MyThread();
		MyRunnable();
		
	}//main
	
	//使用Thread类创建线程
	public static void MyThread(){
		
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的！");
				}
			}
		};
		t1.start();
		t2.start();
	}
	
	//使用Runnable接口创建线程
	public static void MyRunnable(){
		Runnable r1 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的！");
				}
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
}

class A{
	public void print(){
		System.out.println("我是A类");
	}
}

