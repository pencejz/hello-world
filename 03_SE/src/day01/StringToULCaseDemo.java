package day01;
/**
 * String toUpperCase()---��һ���ַ�ȫ����Ϊ��д
 * String toLowerCase()---��һ���ַ�ȫ����ΪСд
 * @author Administrator
 *
 */
public class StringToULCaseDemo {

	public static void main(String[] args) {
		String str = "�Ұ�java";
		String upper = str.toUpperCase();
		System.out.println("upper = "+upper);
		
		String lower = upper.toLowerCase();
		System.out.println("lower = "+lower);
	}

}
