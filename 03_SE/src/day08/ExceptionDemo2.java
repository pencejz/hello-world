package day08;
/**
 * finally��
 * finally�鶨�����쳣������Ƶ����
 * finally���Ա�֤�ڲ�����һ��ִ�У�����try���еĴ����Ƿ�����쳣
 * finally���о���������ر����������ͷ���Դ����
 * @author Administrator
 *
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("����ʼ");
		try{
			String str = null;
			System.out.println(str.length());
		}catch(Exception e){
			System.out.println("������");
		}finally{
			System.out.println("����finally�б�ִ����");
		}
		System.out.println("�������");
	}
}
