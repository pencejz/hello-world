package day01;
/**
 * �ַ����ڴ�������ʱ���Ƽ�ʹ����������ʽֱ�Ӵ���
 * ��Ϊ��ʹ������������ʱ��������������ͬ���ַ���ʱ�����ö��󣬼����ڴ�Ŀ���
 * ����������ͬ���ַ��������ö�������Ҫ���ַ��������ǲ������
 * �����ַ�������һ�����������ݽ����ɱ��ı䡣��Ҫ�ı䣬��ᴴ���µĶ���
 * Ϊ�˽����һ���⣬javaר���ṩ��StringBuilder��
 */
public class StringDemo {

	public static void main(String[] args) {
		//�ַ���һ�����壬�Ͳ����ٸ���
		String s = "��ã�";
		String s1 = "��ã�";
		System.out.println(s==s1); //true---��������ͬ�Ķ��󣬵�ַ���
		System.out.println(s.equals(s1)); //true---ֵ���
		s = s+"����"; //s���õ����´����Ķ���ĵ�ַ
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1); //false
		
		String s2 = new String("��ã�"); //new��ǿ�ƴ����µĶ���
		System.out.println(s1==s2); //false
		
		String s3 = "���"+"��"; //û�б����������ھͻ�õ���������ᴴ���µĶ���
		System.out.println(s1==s3); //true
		
		String s4 = "���";
		String s5 = s4 + "��"; //�б����������ڲŻ�õ�������ᴴ���µĶ���
		System.out.println(s5==s1); //false
		
	}
}
