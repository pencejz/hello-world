package day02;
/**
 * ��װ��
 * ���ڽ���������Ͳ��ܲμ�������󿪷�������
 * �������͵İ�װ�඼�̳��ڳ�����Number����������һϵ�з�����������������֮������໥ת��
 * @author Administrator
 *
 */
public class IntegerDemo1 {
	
	public static void main(String[] args) {
		//��������ת����װ��
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		//���ð�װ�ำֵ
		Integer i3 = Integer.valueOf(127);
		Integer i4 = Integer.valueOf(127);
		
		System.out.println(i1==i2); //false
		System.out.println(i1.equals(i2)); //true
		System.out.println(i3==i4); //true
		System.out.println(i3.equals(i4)); //true
		
		long l = 123;
		Long l1 = Long.valueOf(l); //������ֵ
		Long l2 = Long.valueOf(123); //ֱ�Ӹ�ֵ
		System.out.println(l1.equals(l2));
		//��װ��ת��Ϊ��������
		l = i3.longValue();
		int i = i3.intValue();
		double d = i3.doubleValue();
		System.out.println(d);
	}
	
}
