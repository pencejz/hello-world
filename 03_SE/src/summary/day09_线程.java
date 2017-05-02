package summary;

public class day09_线程 {
	
	public static boolean isFinish; //表示是否下载完成(阻塞线程测试)
	/* 这里不适合将isFinish作为局部变量定义出来，因为在方法中的局部内部类需要引用它。
	 * 那么久必须定义为final的，但是局部内部类又需要对其赋值，所以导致冲突。
	 * 遇到这种情况，可以直接定义为静态属性(成员变量)  */
	public static void main(String[] args) {
		/**
		 * Thread类
		 * 线程的创建模式1：继承Thread类
		 * 线程的创建模式2：实现Runnable接口
		 */
//		MyThread1 t1 = new MyThread1(); //创建线程
//		t1.start(); //启动线程
//		Runnable r1 = new MyRunnable(); //创建任务
//		Thread t2 = new Thread(r1); //创建线程
//		t2.start();
//		(new MyThread()).start();                 //可代替以上5行
//		(new Thread(new MyRunnable())).start();
		/**
		 * 使用匿名类创建线程
		 */
//		t3.start();
//		Thread t4 = new Thread(r2);
//		t4.start();
		/**
		 * 调用匿名内部类创建线程的方法
		 * MyTread()
		 * MyRunnable()
		 */
//		MyThread();
//		MyRunnable();
		/**
		 * 获取线程的相关信息
		 * public static void Thread currentThread() 获取运行当前方法的线程
		 * String getName() 查看线程名字
		 * long getId() 查看线程Id
		 * int getPriority() 查看线程优先级
		 * boolean isAlive() 查看线程是否还活着
		 * boolean isDaemon() 产看线程是否为守护线程
		 * boolean isInterrupted() 查看线程是否被中断
		 */
//		Thread t5 = Thread.currentThread();
//		System.out.println("当前方法运行线程："+t5);
//		System.out.println("线程名字："+t5.getName());
//		System.out.println("线程Id："+t5.getId());
//		System.out.println("线程优先级："+t5.getPriority());
//		System.out.println("线程是否还活着："+t5.isAlive());
//		System.out.println("是否为守护线程："+t5.isDaemon());
//		System.out.println("线程是否被中断："+t5.isInterrupted());
		/**
		 * void setPriority() 设置线程优先级
		 * 优先级从低到高(1~10)
		 * 优先级常量   MAX_PRIORITY == 10
		 *         NORM_PRIORITY == 5
		 *         MIN_PRIORITY == 1
		 */
//		t5.setPriority(Thread.MAX_PRIORITY);
//		System.out.println("更改后的优先级:"+t5.getPriority());
		/**
		 * static void sleep(long ms) 让当前线程睡眠ms毫秒
		 */
//		sleepTest();
		/**
		 * void setDaemon() 设置守护线程
		 */
//		setDaemonTest();
		/**
		 * void join() 设置阻塞线程
		 */
//		joinTest();
		
		
	}//main
	
	//使用匿名类创建线程(匿名类是在类里面方法外面创建)
	static Thread t3 = new Thread(){
		public void run(){
			for(int i=0;i<1000;i++){
				System.out.println("第"+i+"次运行：你是谁啊？？？");
			}
		}
	};
	static Runnable r3= new Runnable(){
		public void run(){
			for(int i=0;i<1000;i++){
				System.out.println("第"+i+"次运行：我是小明..........");
			}
		}
	};
	
	//使用匿名内部类创建线程(匿名内部类实在方法里面创建)
	public static void MyThread(){
		Thread t = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("第"+i+"次运行：你是谁啊？？？");
				}
			}
		};
		t.start();
	}
	public static void MyRunnable(){
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println("第"+i+"次运行：我是小明.......");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	//设置线程睡眠
	public static void sleepTest(){
		System.out.println("程序开始");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("等待时间："+(end-start));
		System.out.println("程序结束");
	}
	
	//设置守护线程的测试
	public static void setDaemonTest(){
		
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("aaaaaaaaaaaa");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump! i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		jack.setDaemon(true); //后台线程必须在调用start方法之前设置
		rose.start();
		jack.start();
		/*
		 * 在main方法执行的过程中存在着3个线程：main rose jack(守护)
		 * 通常main方法结束，即表示main线程结束，当rose线程再结束后，没有了前台线程，jack随之结束
		 * while(true)是一个死循环
		 * 使得调用它的main方法永远不会结束，还有前台线程在运行，jack便不会结束
		 */
		while(true);
	}
	
	//线程阻塞测试
	public static void joinTest(){
		final Thread downLoad = new Thread(){
			public void run(){
				System.out.println("开始下载...");
				for(int i=0;i<=10;i++){
					System.out.println("downLoad:已完成："+i*10+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("downLoad:下载完成");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:我来看看下了多少咯...");
				try {
					/* show在执行了downLoad.join方法后，进入等待状态，直至downLoad线程运行完毕
					 * 
					 * 当一个方法的局部内部类中想引用这个方法的其他局部变量，那么该变量必须是final的
					 * 所以在创建downLoad线程时，要定义为final */
					downLoad.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					System.out.println("show:下载失败");
				}
				System.out.println("show:下完咯");
			}
		};
		downLoad.start();
		show.start();
	}
}
//通过继承Thread类创建线程
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("第"+i+"次运行：你是谁啊？？？");
		}
	}
}

//通过实现Runnable接口创建线程
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("第"+i+"次运行：我是小明........");
		}
	}
}














