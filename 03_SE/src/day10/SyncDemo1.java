package day10;
/**
 * 多线程并发安全问题
 * 当多个线程访问同一个资源时就会出现“抢”的现象
 * 由于线程切换的不确定性，会导致程序出现逻辑的混乱，严重时可能导致系统瘫痪
 * @author sss
 *
 */
public class SyncDemo1 {

	public static void main(String[] args) {
		final Table table = new Table();
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
		
		
	} //main
}

class Table{
	private int beans = 20;
	/**
	 * 当一个方法被synchronized修饰后，那么该方法变为同步方法，即：
	 * 多个线程不可能同步进入到该方法内部执行
	 * 这就将多个线程执行该方法由“个执行个的”改为“排队执行”
	 * 由于不在形成抢的关系，所以就不会出现所线程并发的安全问题
	 * 
	 * 在方法上使用synchronized后，那么上锁的对象就是当前方法所述的对象，即：
	 * 方法内部看到的this
	 * 所以，只要多个线程调用的是同一个对象的该方法，就一定具有同步效果
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了！");
		}
		Thread.yield(); //模拟CPU发生线程切换
  		return beans--;
	}
}




















