package day02;
/**
 * JDK1.5֮���Ƴ���һ�������ԣ�
 * �Զ���װ�䣺
 * �����������ڱ���ʱ�������ɵ��ڻ����������Ӧ�İ�װ��֮���໥��ֵʹ��
 * �������ڹ�ע����֮���ת������
 * ���ǣ��Զ���װ�䣬������������Ͽɵģ�ֻ�Ǳ������Ͽɵ�
 * ���������Զ�������֮���ת�����벹�䵽������class�ļ���
 * 
 * @author Administrator
 *
 */
public class IntegerDemo4 {

	public static void main(String[] args) {
		
		Integer in = 1;//�Զ�װ����̣��Զ�����ΪInteger in = Integer.valueOf(1);
		int i = in; //�Զ�������̣��Զ�����Ϊint i = in.intValue();
		dosome(i); //dosome(Integer.valueOf(i));
		
		
		
	}
	
	public static void dosome(Object obj){}
}
