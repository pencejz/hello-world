package day01;
/**
 * int indexOf(String str)
 * �鿴�������ַ����ڵ�ǰ�ַ����е�λ��
 * @author Administrator
 *
 */
public class StringIndexOfDemo {

	public static void main(String[] args) {
		/**
		 *int indexOf(String str)
		 */
		//            0123456789012345
		String str = "thinking in java"; //thinking in java---java���˼�� 
		int index = str.indexOf("in");
		System.out.println(index); //2
		//���ص��ǵ�һ�γ������ַ����е�λ�á���û��ƥ�䵽���򷵻�-1
		//             012345678901234567
		String str1 = "thiankiang in java";
		index = str1.indexOf("in");
		System.out.println(index); //11
		
		/**
		 * int indexOf(String str, int a)
		 * ���ط��������ָ��λ�ÿ�ʼ�����ַ�����һ�γ��ֵ�λ��
		 */
		index = str.indexOf("in", 3);
		System.out.println(index); //5
		
		/**
		 * int lastIndexOf(Sting str)
		 * �������һ�γ��ֵ�λ��
		 */
		index = str.lastIndexOf("in");
		System.out.println(index); //9
	}

}











