package day01;
/**
 * String substring[int startIndex,int lastIndex)
 * ��ȡһ���ַ���
 * @author Administrator
 *
 */
public class StringsubStringDemo {

	public static void main(String[] args) {
		//            0123456789
		String str = "thinking in java";
		/**
		 * java�е�APIʹ���������ֱ�ʾ��Χʱ��ͨ���Ǻ�ͷ����β[)
		 */
		String sub = str.substring(5,8); //ȡ�����±�Ϊ567
		System.out.println(sub); //ing
		
		/*
		 * ���ط�����ֻ��һ������
		 * ��ĳһλ�ÿ�ʼ��ȡ��ĩβ
		 */
		sub = str.substring(9);
		System.out.println(sub); //in java
	}

}
