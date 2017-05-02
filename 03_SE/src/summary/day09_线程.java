package summary;

public class day09_�߳� {
	
	public static boolean isFinish; //��ʾ�Ƿ��������(�����̲߳���)
	/* ���ﲻ�ʺϽ�isFinish��Ϊ�ֲ����������������Ϊ�ڷ����еľֲ��ڲ�����Ҫ��������
	 * ��ô�ñ��붨��Ϊfinal�ģ����Ǿֲ��ڲ�������Ҫ���丳ֵ�����Ե��³�ͻ��
	 * �����������������ֱ�Ӷ���Ϊ��̬����(��Ա����)  */
	public static void main(String[] args) {
		/**
		 * Thread��
		 * �̵߳Ĵ���ģʽ1���̳�Thread��
		 * �̵߳Ĵ���ģʽ2��ʵ��Runnable�ӿ�
		 */
//		MyThread1 t1 = new MyThread1(); //�����߳�
//		t1.start(); //�����߳�
//		Runnable r1 = new MyRunnable(); //��������
//		Thread t2 = new Thread(r1); //�����߳�
//		t2.start();
//		(new MyThread()).start();                 //�ɴ�������5��
//		(new Thread(new MyRunnable())).start();
		/**
		 * ʹ�������ഴ���߳�
		 */
//		t3.start();
//		Thread t4 = new Thread(r2);
//		t4.start();
		/**
		 * ���������ڲ��ഴ���̵߳ķ���
		 * MyTread()
		 * MyRunnable()
		 */
//		MyThread();
//		MyRunnable();
		/**
		 * ��ȡ�̵߳������Ϣ
		 * public static void Thread currentThread() ��ȡ���е�ǰ�������߳�
		 * String getName() �鿴�߳�����
		 * long getId() �鿴�߳�Id
		 * int getPriority() �鿴�߳����ȼ�
		 * boolean isAlive() �鿴�߳��Ƿ񻹻���
		 * boolean isDaemon() �����߳��Ƿ�Ϊ�ػ��߳�
		 * boolean isInterrupted() �鿴�߳��Ƿ��ж�
		 */
//		Thread t5 = Thread.currentThread();
//		System.out.println("��ǰ���������̣߳�"+t5);
//		System.out.println("�߳����֣�"+t5.getName());
//		System.out.println("�߳�Id��"+t5.getId());
//		System.out.println("�߳����ȼ���"+t5.getPriority());
//		System.out.println("�߳��Ƿ񻹻��ţ�"+t5.isAlive());
//		System.out.println("�Ƿ�Ϊ�ػ��̣߳�"+t5.isDaemon());
//		System.out.println("�߳��Ƿ��жϣ�"+t5.isInterrupted());
		/**
		 * void setPriority() �����߳����ȼ�
		 * ���ȼ��ӵ͵���(1~10)
		 * ���ȼ�����   MAX_PRIORITY == 10
		 *         NORM_PRIORITY == 5
		 *         MIN_PRIORITY == 1
		 */
//		t5.setPriority(Thread.MAX_PRIORITY);
//		System.out.println("���ĺ�����ȼ�:"+t5.getPriority());
		/**
		 * static void sleep(long ms) �õ�ǰ�߳�˯��ms����
		 */
//		sleepTest();
		/**
		 * void setDaemon() �����ػ��߳�
		 */
//		setDaemonTest();
		/**
		 * void join() ���������߳�
		 */
//		joinTest();
		
		
	}//main
	
	//ʹ�������ഴ���߳�(���������������淽�����洴��)
	static Thread t3 = new Thread(){
		public void run(){
			for(int i=0;i<1000;i++){
				System.out.println("��"+i+"�����У�����˭��������");
			}
		}
	};
	static Runnable r3= new Runnable(){
		public void run(){
			for(int i=0;i<1000;i++){
				System.out.println("��"+i+"�����У�����С��..........");
			}
		}
	};
	
	//ʹ�������ڲ��ഴ���߳�(�����ڲ���ʵ�ڷ������洴��)
	public static void MyThread(){
		Thread t = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("��"+i+"�����У�����˭��������");
				}
			}
		};
		t.start();
	}
	public static void MyRunnable(){
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println("��"+i+"�����У�����С��.......");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	//�����߳�˯��
	public static void sleepTest(){
		System.out.println("����ʼ");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("�ȴ�ʱ�䣺"+(end-start));
		System.out.println("�������");
	}
	
	//�����ػ��̵߳Ĳ���
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
		jack.setDaemon(true); //��̨�̱߳����ڵ���start����֮ǰ����
		rose.start();
		jack.start();
		/*
		 * ��main����ִ�еĹ����д�����3���̣߳�main rose jack(�ػ�)
		 * ͨ��main��������������ʾmain�߳̽�������rose�߳��ٽ�����û����ǰ̨�̣߳�jack��֮����
		 * while(true)��һ����ѭ��
		 * ʹ�õ�������main������Զ�������������ǰ̨�߳������У�jack�㲻�����
		 */
		while(true);
	}
	
	//�߳���������
	public static void joinTest(){
		final Thread downLoad = new Thread(){
			public void run(){
				System.out.println("��ʼ����...");
				for(int i=0;i<=10;i++){
					System.out.println("downLoad:����ɣ�"+i*10+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("downLoad:�������");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:�����������˶��ٿ�...");
				try {
					/* show��ִ����downLoad.join�����󣬽���ȴ�״̬��ֱ��downLoad�߳��������
					 * 
					 * ��һ�������ľֲ��ڲ�������������������������ֲ���������ô�ñ���������final��
					 * �����ڴ���downLoad�߳�ʱ��Ҫ����Ϊfinal */
					downLoad.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					System.out.println("show:����ʧ��");
				}
				System.out.println("show:���꿩");
			}
		};
		downLoad.start();
		show.start();
	}
}
//ͨ���̳�Thread�ഴ���߳�
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("��"+i+"�����У�����˭��������");
		}
	}
}

//ͨ��ʵ��Runnable�ӿڴ����߳�
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("��"+i+"�����У�����С��........");
		}
	}
}














