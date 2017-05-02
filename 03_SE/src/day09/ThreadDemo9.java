package day09;
/**
 * �߳��ṩ�˾�̬����
 * void join()
 * �÷���������������������߳̽�������״̬��������ȴ����߳̽���
 * @author Administrator
 *
 */
public class ThreadDemo9 {

	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		/*
		 * ���ﲻ�ʺϽ�isFinish��Ϊ�ֲ����������������Ϊ��ǰ����(main)�еľֲ��ڲ�����Ҫ��������
		 * ��ô�ñ��붨��Ϊfinal�ģ����Ǿֲ��ڲ�������Ҫ���丳ֵ�����Ե��³�ͻ��
		 * �����������������ֱ�Ӷ���Ϊ��̬����(��Ա����)
		 */
		/**
		 * ��һ�������ľֲ��ڲ�������������������������ֲ���������ô�ñ���������final��
		 */
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ...");
				for(int i=0;i<=10;i++){
					System.out.println("download:�����"+i*10+"%");
					try {
						sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("download:����ͼƬ���!");
				isFinish = true;
			}
		};
		Thread show =new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ���أ�");
				/**
				 * �ȵȴ������߳̽�ͼƬ�������
				 * show�߳���ִ����download.join�����󣬾ͽ���������״̬
				 * ֱ��download�߳̽���Ϊֹ
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬû��������ɣ�");
				}
				System.out.println("��ʾͼƬ������ϣ�");
				
			}
		};
		download.start();
		show.start();
	}
}
