package day04;
/** ��+����ʹ�� */
public class ConactDeno {

	public static void main(String[] args) {
		/**
		 * + :���ֹ��ܣ����أ�
		 * 1).��ֵ���㹦��
		 * 2).�ַ������ӣ���+��һ�˳����ַ���ʱ���Ͳ������ӹ���
		 */
		int a = 100;
		String str = "a="+a;
		//���̣��Ƚ��ڶ���aת����100���ٽ�"a="��"100"����
		System.out.println(str); //a=100
		
		
		/**��������*/
		//�������
		String s1 = "a" + 1 + 2 + 3;
		String s2 = 1 + 2 + 3 + "a";
		String s3 = 'a' + 1 + 2 + 3 +"";
		//String s3 = 'a' + 1 + 2 + 3;---�������
		//ԭ���ַ�a�ڼ���ʱϵͳ��Ĭ��ת����int�ͣ���������Ϊint�ͣ��Ͳ���ֱ�Ӹ�ֵ��String��
		
		System.out.println("s1="+s1+",s2="+s2+",s3="+s3);
		
	}//main

}//class
