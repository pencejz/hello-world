package day09;
//���ñ�������
public class Demo1 {

	public static void main(String[] args) {
		
		Cell c1 = new Cell();
		
		//��ָ���쳣
//		c1 = null;
//		c1.row = 5;
		
		/*c2��c1����ͬһ��������ͬһ������ľ�����ѱ��������ǿ��Բ���ͬһ������*/
		Cell c2 = c1;
		c2.row = 6;
		c1.col = 7;
		System.out.println("c1.row= "+c1.row);
		System.out.println("c2.col= "+c2.col);
		//��������
		c2.drop();
		System.out.println("c2.row= "+c2.row);
		

	}//main����

}//Demo1��

class Cell{
	int row; // ��
	int col; //��
	
	/**
	 * ����
	 * ���ã�������������������ȫ��������ã���
	 * ����ķ�����������ÿһ������ķ����������϶����Ŀ�ľ��Ǳ�ȫ������ظ�ʹ�á�
	 * ����ʵ�ֵ�����Ĺ��ܣ���һ��������̡�
	 */
	public void drop(){
		row++;
	}
	
	
}//Cell��




