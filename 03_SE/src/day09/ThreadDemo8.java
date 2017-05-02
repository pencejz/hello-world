package day09;
/**
 * 守护线程
 * 守护线程又叫做后台线程
 * 正常创建出来的线程都是前台线程，后台线程需要通过setDeamon方法来设置
 * 当一个进程的所有前台线程都结束，该进程就会结束，那么这个进程中的所有后台线程会被强制中断
 * @author Administrator
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("aaaaaaaaaaaaa");
				System.out.println("噗通！");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		/*
		 * 设置后台线程
		 * 该操作一定要在调用start方法之前
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
		System.out.println("mian方法结束");
		
	}//main
	
}
