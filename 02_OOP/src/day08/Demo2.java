package day08;

//���еķ���
public class Demo2 {
	
	public static void main(String[] args){
		/**
		 * ����˹������С������
		 * new ���ڷ���ռ�(�������)
		 * new Cell() ������һ��3��int����
		 * ��һ�������Ϊ����
		 */
		Cell c1 = new Cell();
		Cell c2 = new Cell();
		Cell c3 = new Cell();
		Cell c4 = new Cell();
		//��ʼ���������ݣ������ֵ
		//��������ԣ�����ÿ����������ݡ���������������ж��壬ֻ�������������������֣�������ֵ�����ڶ���ġ�
		c1.row = 6;
		c1.col = 3;
		
		c2.row = 6;
		c2.col = 4;
		
		c3.row = 6;
		c3.col = 5;
		
		c4.row = 7;
		c4.col = 5;
		//��������
		c1.drop();
		c2.drop();
		c3.drop();
		c4.drop();
		
		c1.moveRight();
		c1.moveLeft();
		
	}//main
	
}//class

/**
 * ����˹�����е�С����Cell��
 */
class Cell{
	
	int row; //��
	int col; //Column ��
	int color; //��ɫ(RGB)
	
	/**
	 * ʵ�ָ����������Ϊ�ķ���
	 * ��װ�˿��ԡ��ظ�ʹ�á��������㷨
	 */
	public void drop(){
		row ++;
		//����Ч��
		//����Ч��
	}
	//�����ƶ�
	public void moveRight(){
		col ++;
		System.out.println(col);
	}
	//�����ƶ�
	public void moveLeft(){
		col --;
		System.out.println(col);
	}
	
}









