package day08;

//null��NullPointerException
public class Null {

	public static void main(String[] args) {
		/**
		 * ���⣺
		 * �����ñ�����ֵ��nullʱ�������������ԣ�Ԫ�أ���������������ֿ�ָ���쳣
		 * �����ָ���쳣������������ֵΪnull��ʱ�����������Ժͷ���
		 * �����ָ���쳣��
		 * ����һ�������ñ�������ĸ�ֵ
		 * ��������if�жϱ���nullֵ���õ����Ժͷ���
		 */
		//������
		//Cell c = null;
		//int n = c.row; //���б���java.lang.NullPointerException
		//���1��
		Cell c = new Cell();
		int n = c.row;
		//���2��
		Cell c1 = null;
		if(c1!=null){
			c1 = new Cell();
		}
		
		
		
		
	}//main
	
}//class



