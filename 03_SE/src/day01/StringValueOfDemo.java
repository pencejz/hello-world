package day01;
/**
 * String�ṩ���������صľ�̬��valueOf����
 * ���ÿ��Խ�java������������ת��Ϊ�ַ���
 * @author Administrator
 *
 */
public class StringValueOfDemo {
	
	public static void main(String[] args) {
		
		int i = 123;
		String iStr = String.valueOf(i);
		System.out.println(iStr+4); //1234
		
		String dStr = String.valueOf(123.456);
		System.out.println(dStr+7); //123.4567
		
		iStr = 123 + "";
		System.out.println(iStr+4); //1234
	}
}
