package day14;

public class Inner {

	public static void main(String[] args) {
		/**
		 * �����ڲ���
		 * 1.�ڲ�����Թ����ⲿ������Ժͷ���
		 * 2.�ⲿ���װ���ڲ���
		 * 3.���ڲ������ⲿ�����Ի򷽷�����ʱ�����ڲ�����ʹ���ⲿ�����Ի򷽷�ʱ�����ǰ׺���ⲿ��.this.
		 */
		Outer o = new Outer(5,10);
		o.test(); //6

	}//main

}

//�ⲿ��
class Outer {
	private int times;
	private int times1;
	private Inner inner; //�ڲ���ͨ��ֻ���ⲿ���ڲ�ʹ��
	//���췽��
	public Outer(int times,int times1){
		this.times = times;
		this.times1 = times1;
		inner = new Inner(); //�����ڲ������
		inner.timesInc(); //�������ã�ʵ��times��1
	}
	//��ʾ˽�����Եķ���
	public void test(){
		System.out.println("times = "+times);
		System.out.println("times1 = "+times1);
	}
	//�ڲ���
	class Inner{
		int times1;
		public void timesInc(){
			times++; //�ڲ�����Թ����ⲿ������Ժͷ���
			times1++; //�ڲ����е�times1����1
			Outer.this.times1++; //�ⲿ���е�times1����1
		}
		
	}
}