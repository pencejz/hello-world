package day02;
/**
 * parseXXX��̬����
 * ���Խ��ַ���ת��Ϊ��Ӧ�Ļ�������
 * ����Ҫ����ַ������������ȷ����Ҫת���Ļ������Ϳ��Ա����ֵ�������׳��쳣
 * @author Administrator
 *
 */
public class IntegerDemo3 {
	
	public static void main(String[] args) {
		
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i+1); //124
		
		String str1 = "123.456";
		double d = Double.parseDouble(str1);
		System.out.println(d); //123.456
		
		i = Integer.parseInt(str1);
		System.out.println(i); //����ʱ�ͻ��׳��쳣
		
	}
}
