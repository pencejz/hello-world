package day02;
/**
 * ����Point��дObject����ط���
 * 1.���toString����
 * 2.�Ƚ�equals����
 * @author Administrator
 *
 */
public class TextPoint {
	
	public static void main(String[] args) {
		//toString����
		Point p = new Point(1,2);
		String str = p.toString();
		System.out.println(str);
		/*
		 * system.out.println(Object o);
		 * �÷����Ὣ��������toString�������ص��ַ������������̨
		 */
		System.out.println(p);
		//equals
		Point p1 = new Point(1,2);
		System.out.println(p==p1); //false---����ͬһ���󣬵�ַ��ͬ
		System.out.println(p.equals(p1)); //true
		/*
		 * �Ƚ��ַ�����Ҫʹ��equals����
		 * �����������ͱ�������ϣ���Ƚϵ��Ƕ������ݶ�Ӧ��ʹ��equals
		 */
		String str1 = "helloworld";
		String str2 = "helloworld";
		String str3 = new String("helloworld");
		System.out.println(str1==str2); //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); //true
		
	}//main
	
	
}
