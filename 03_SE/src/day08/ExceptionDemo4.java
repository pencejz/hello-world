package day08;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		System.out.println("����ʼ");
		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			/**
			 * ��������ջ��Ϣ������ֱ�Ӷ�λ��������ֵĴ����У��Ա��������
			 */
			e.printStackTrace();
			/**
			 * ��ȡ�쳣��Ϣ
			 */
			String m = e.getMessage();
			System.out.println("������Ϣ��"+m);
		}
		
		System.out.println("�������");
	}
}
