package day09;
/**
 * 线程提供了静态方法
 * void join()
 * 该方法允许运行这个方法的线程进入阻塞状态，至到其等待的线程结束
 * @author Administrator
 *
 */
public class ThreadDemo9 {

	//表示图片是否下载完成
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		/*
		 * 这里不适合将isFinish作为局部变量定义出来，因为当前方法(main)中的局部内部类需要引用它。
		 * 那么久必须定义为final的，但是局部内部类又需要对其赋值，所以导致冲突。
		 * 遇到这种情况，可以直接定义为静态属性(成员变量)
		 */
		/**
		 * 当一个方法的局部内部类中想引用这个方法的其他局部变量，那么该变量必须是final的
		 */
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片...");
				for(int i=0;i<=10;i++){
					System.out.println("download:已完成"+i*10+"%");
					try {
						sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("download:下载图片完成!");
				isFinish = true;
			}
		};
		Thread show =new Thread(){
			public void run(){
				System.out.println("show:开始显示图片下载！");
				/**
				 * 先等待下载线程将图片下载完毕
				 * show线程在执行了download.join方法后，就进入了阻塞状态
				 * 直到download线程结束为止
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片没有下载完成！");
				}
				System.out.println("显示图片下载完毕！");
				
			}
		};
		download.start();
		show.start();
	}
}
