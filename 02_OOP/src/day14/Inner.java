package day14;

public class Inner {

	public static void main(String[] args) {
		/**
		 * �����ڲ���
		 * 1.�ڲ�����Թ����ⲿ������Ժͷ���
		 * 2.�ⲿ���װ���ڲ���
		 * 3.���ڲ������ⲿ�����Ի򷽷�����ʱ�����ڲ�����ʹ���ⲿ�����Ի򷽷�ʱ�����ǰ׺���ⲿ��.this.
		 * 4.�ڷ��������涨����ڲ���ķ������Ϳ����� public,protecte,Ĭ�ϵģ�private ��4�����ͣ���ͺ������ж���ĳ�Ա������4�ַ�������һ��
		 *   ���Ǿ�������ڲ���Ķ�����������Ƿ�ɼ�����ʱ������Ҳ���������洴���ڲ����ʵ������
		 *   �����ڲ����ʵ������ʱ��һ��Ҫ�ȴ����ⲿ���ʵ������Ȼ��������ⲿ���ʵ������ȥ�����ڲ����ʵ������
		 */
		Outer outer = new Outer(5,10);
		outer.test(); //6,11
		System.out.println("Inner.times1 = "+outer.inner.times1);
		
		//�����ڲ������(�˴���inner��һ���µĶ��󣬶������ⲿ���еĳ�Ա����inner)
		Outer.Inner inner = outer.new Inner();
		inner.timesInc();
		System.out.println("Inner.times1 = "+inner.times1);
		

	}//main

}

//�ⲿ��
class Outer {
	private int times;
	private int times1;
	Inner inner; //�ڲ���ͨ��ֻ���ⲿ���ڲ�ʹ��
	//���췽��
	public Outer(int times,int times1){
		this.times = times;
		this.times1 = times1;
		inner = new Inner(); //�����ڲ������
		inner.timesInc(); //�������ã�ʵ��times��1
	}
	//��ʾ˽�����Եķ���
	public void test(){
		System.out.println("Outer.times = "+times);
		System.out.println("Outer.times1 = "+times1);
	}
	//�ڲ���
	class Inner{
		int times1 = 1;
		public void timesInc(){
			times++; //�ڲ�����Թ����ⲿ������Ժͷ���
			times1++; //�ڲ����е�times1����1
			Outer.this.times1++; //�ⲿ���е�times1����1
		}
		
	}
}