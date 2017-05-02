package day10;
/**
 * ���̲߳�����ȫ����
 * ������̷߳���ͬһ����Դʱ�ͻ���֡�����������
 * �����߳��л��Ĳ�ȷ���ԣ��ᵼ�³�������߼��Ļ��ң�����ʱ���ܵ���ϵͳ̱��
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
	 * ��һ��������synchronized���κ���ô�÷�����Ϊͬ������������
	 * ����̲߳�����ͬ�����뵽�÷����ڲ�ִ��
	 * ��ͽ�����߳�ִ�и÷����ɡ���ִ�и��ġ���Ϊ���Ŷ�ִ�С�
	 * ���ڲ����γ����Ĺ�ϵ�����ԾͲ���������̲߳����İ�ȫ����
	 * 
	 * �ڷ�����ʹ��synchronized����ô�����Ķ�����ǵ�ǰ���������Ķ��󣬼���
	 * �����ڲ�������this
	 * ���ԣ�ֻҪ����̵߳��õ���ͬһ������ĸ÷�������һ������ͬ��Ч��
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж����ˣ�");
		}
		Thread.yield(); //ģ��CPU�����߳��л�
  		return beans--;
	}
}




















