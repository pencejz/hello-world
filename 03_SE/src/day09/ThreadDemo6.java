package day09;
/**
 * �߳����ȼ�priority
 * @author Administrator
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("norm");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<100000;i++){
					System.out.println("max");
				}
			}
		};
		
		/**
		 * void setPriority(int p)
		 * �����̵߳����ȼ�
		 * ���ȼ���1-10��1Ϊ��ף�10Ϊ���
		 * ���������ȼ�Խ�ߵ��̻߳�ȡCPU��ʱ��Ƭ�Ĵ���Խ��
		 */
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
		
		
		
	} //mian
}
