package day08;
/**
 * java�쳣�������
 * @author Administrator
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("����ʼ");
		try{ //�����쳣�Ĵ����
			String str = null; //��ָ���쳣
			String str1 = "a"; //�±�Խ��
			/**
			 * ��JVMִ�д���������ĳ���쳣ʱ����ʵ�������쳣
			 * Ȼ�󽫸ô���ִ�й��̷�װ��ȥ���������쳣ʵ���׳�
			 * ��try�г�������֮���ʣ����������������ٱ�ִ��
			 */
			System.out.println(str.length());
			System.out.println(str1.charAt(0));
			System.out.println(Integer.parseInt(str1));
			/**
			 * catch���Զ����������ݲ�ͬ���쳣�в�ͬ�Ĵ�������Ӧ���ֱ�ȥ������Щ�쳣
			 * ����Ӧ�������һ��catch�ϲ���Exception
			 * �������Ա�����Ϊ���ָ���һ��δ������쳣���³����ж�
			 * ��������쳣֮����ڸ��Ӽ��ļ̳й�ϵʱ����ôһ�����Ȳ��������쳣���󲶻����쳣
			 * �����ȶ��������쳣�����常���쳣
			 */
		}catch(NullPointerException e){ //�����쳣���ͣ���ʵ����
			System.out.println("�����˿�ָ���쳣"); //����쳣
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�±�Խ��");
		}catch(Exception e){
			System.out.println("�����и�����");
		}
	
		
		System.out.println("�������");
	}
}
