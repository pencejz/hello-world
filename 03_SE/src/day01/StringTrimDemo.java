package day01;
/**
 * String trim()
 * ȥ���ַ������ߵĿհ��ַ��������ַ����м���ַ�����ȥ��
 * @author Administrator
 *
 */
public class StringTrimDemo {
	public static void main(String[] args) {
		
		String str = "	hello      ";
		String trim = str.trim();
		System.out.println(trim);
		
		str = "	he  llo      ";
		trim = str.trim();
		System.out.println(trim);
	}
}
