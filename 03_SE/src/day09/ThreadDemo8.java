package day09;
/**
 * �ػ��߳�
 * �ػ��߳��ֽ�����̨�߳�
 * ���������������̶߳���ǰ̨�̣߳���̨�߳���Ҫͨ��setDeamon����������
 * ��һ�����̵�����ǰ̨�̶߳��������ý��̾ͻ��������ô��������е����к�̨�̻߳ᱻǿ���ж�
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
				System.out.println("��ͨ��");
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
		 * ���ú�̨�߳�
		 * �ò���һ��Ҫ�ڵ���start����֮ǰ
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
		System.out.println("mian��������");
		
	}//main
	
}
