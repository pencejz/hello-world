package summary;

public class day01_�ַ��� {

	public static void main(String[] args) {
		/**
		 * StringBuilder��
		 * StringBuilder append(String str) ĩβ����
		 * StringBuilder delete(int indexStart, int indexEnd) ɾ��
		 * StringBuilder insert(int index, String str) ����
		 * StringBuilder replace(int indexStart, int indexEnd, String str) �޸�
		 * StringBuilder reverse() ��ת
		 * char charAt(int index) ��ȡָ���±��Ӧ���ַ�
		 * int length() ��ȡ�ַ����ĳ���
		 */
		StringBuilder builder = new StringBuilder("�ú�ѧϰ����������");
		//ĩβ����---������Ϊ�˱�Ч�����
		;
		System.out.println(builder.append("������Ϊ�˱�Ч�����"));
		//�޸�---�ú�ѧϰ����������---����
		System.out.println(builder.replace(0, 9, "����"));
		//����---�ڣ����ţ���������루Ŭ���ܶ���������
		System.out.println(builder.insert(3, "Ŭ���ܶ�������"));
		//ɾ��---���ţ�
		System.out.println(builder.delete(0, 3));
		//��ת�ַ���
		builder.reverse();
		System.out.println("��ת�ַ�����"+builder);
		//��ȡָ���±��Ӧ���ַ�
		char ch = builder.charAt(5);
		System.out.println(ch);
		//��ȡ�ַ����ĳ���
		int len = builder.length();
		System.out.println(len);
		/**
		 * String��
		 * boolean startsWith(String str) �жϵ�ǰ�ַ����Ƿ��Ը����ַ���str��ͷ
		 * boolean endsWith(String str) �жϵ�ǰ�ַ����Ƿ��Ը����ַ���str����
		 * String toUpperCase() ���ַ����е�����Ӣ����ĸȫ����Ϊ��д
		 * String toLowerCase() ���ַ����е�����Ӣ����ĸȫ����ΪСд
		 * int indexOf(String str) �鿴�����ַ����ڵ�ǰ�ַ����е�λ��
		 * int indexOf(String str, int index) �鿴�����ַ�����ָ��λ��index��ʼ������ң���һ�γ��ֵ�λ��
		 * int lastIndexOf(String str) �鿴�����ַ����ڵ�ǰ�ַ��������һ�γ��ֵ�λ��
		 * int lastIndexOf(String str, int index) �鿴�����ַ�����ָ��λ��index��ʼ��ǰ���ң����һ�γ��ֵ�λ��
		 * String substring(int index) ��ȡ�ַ�������index��ʼ���ַ�������
		 * String substring(int startIndex, int endIndex) ��ȡ�ַ���
		 * String trim() ȡ���ַ������ߵĿհף����ǲ���ȥ���м�Ŀհײ���
		 * String valueOf(��ֵ��    i) ����ֵ��ת����String
		 */
		//�ж�һ���ַ����Ƿ��Ը����ַ�����ͷ/��β
		            //0123456789012345
		String str = "thinking in java";
		boolean b = str.startsWith("th");
		System.out.println(b);
		System.out.println(str.endsWith("va"));
		//�Ƚ�Ӣ���ַ���Ϊ��д��Ȼ���ٸ�ΪСд
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//�鿴�����ַ����ڵ�ǰ�ַ����е�λ��
		System.out.println(str.indexOf("ia"));
		System.out.println(str.indexOf("in",3));
		System.out.println(str.lastIndexOf("in"));
		System.out.println(str.lastIndexOf("in",8));
		//��ȡ�ַ���
		str = "�ú�ѧϰ���������ϣ�����";
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,9));
		//ȥ���ַ������ߵĿհף����ǲ���ȥ���м�Ŀհײ���
		String str1 = "  ���    ";
		System.out.println(str1.trim());
		//����������ת��Ϊ�ַ�������
		int a = 123456;
		System.out.println(a+1);
		System.out.println(String.valueOf(a)+1);
		
		
		
	}//main
}



