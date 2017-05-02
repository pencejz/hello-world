package day01;
/**
 * StringBuilder�������༭�ַ������ݵ�API
 * �ṩ�ķ�����
 * 		����append
 * 		ɾ��delete
 * 		�ģ�replace
 * 		�壺insert
 * 		��ת��reverse
 * StringBuilder�ڲ�ά��һ���ɱ䳤�ȵ��ַ����飬�����޸����ݶ����ڸ������Ͻ��еġ�����ÿ�޸�һ�ξʹ���һ������
 * @author Administrator
 *
 */
public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		String str = "�ú�ѧϰ����������";
		StringBuilder builder = new StringBuilder(str); //����һ������	
		//StringBuilder builder = new StringBuilder(); //����һ���յ��ַ���
		//StringBuilder builder = new StringBuilder("�ú�ѧϰ����������"); //ֱ�Ӵ���һ���ַ���
		System.out.println(builder);
		/**
		 * ĩβ����---��Ϊ�˿��Ϻô�ѧ��
		 * StringBuilder append(String str)
		 */
		builder.append("��Ϊ�˿��Ϻô�ѧ��");
		str = builder.toString();
		System.out.println("��Ӻ��bulider = "+str);
		/**
		 * �޸�
		 * 1.�ú�ѧϰ���������ϣ�Ϊ�˿��Ϻô�ѧ��
		 * 2.�ú�ѧϰ���������ϣ�����Ϊ�˸ı����磡
		 * ��1����2
		 * StringBuilder replace(int startIndex,int endIndex,String str)
		 */
		builder.replace(10, 19, "����Ϊ�˸ı����磡");
		System.out.println("�ı���builder = "+builder.toString());
		/**
		 * ɾ��---�ú�ѧϰ���������ϣ�
		 * StringBuilder delete(int startIndex, int endIndex)
		 *                         [startIndex,  endIndex) ---��ͷ����β
		 */
		builder.delete(0, 10);
		System.out.println("ɾ�����bulider = "+builder.toString());
		/**
		 * ����
		 * 1.����Ϊ�˸ı����磡
		 * 2.���ţ�����Ϊ�˸ı����磡
		 * ��1�Ļ����ϲ���---���ţ����2
		 * StringBuilder insert(int index,String str)
		 */
		builder.insert(0, "����,");
		System.out.println("������builder = "+builder.toString());
		
		/**
		 * ��ת�ַ���
		 * StringBuilder reverse()
		 */
		builder.reverse();
		System.out.println("��ת���builder = "+builder.toString());
		
	}//main
	
}










