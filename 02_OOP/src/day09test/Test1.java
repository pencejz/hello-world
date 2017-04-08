package day09test;
//����˹����
public class Test1 {

	public static void main(String[] args) {
		/**
		 * 1.��������˹���鰸���е�Cell��
		 * 2.��������˹���鰸���е�T�ͷ����ࡣΪT�ͷ�����ƺ���Ĺ�������ʼ��4�����Ӷ���
		 *    ΪT�ͷ����������������ƶ�����
		 *    ��Ӳ����࣬���Թ��������������䣬���������ƶ�������
		 * 3.��������˹���鰸���е�I,S,Z,L,J,O�ͷ�����, ���Ҳ���
		 */
		T1 t = new T1();
		System.out.println("--------ԭʼ����--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.drop();
		System.out.println("--------��������--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.moveLeft();
		System.out.println("--------��������--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.moveRight();
		System.out.println("--------��������--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);		
		


	}//main
	
	
}//class

class Cell1{
	int row; //��
	int col; //��
	Cell[] cells = new Cell[4];
	
	public Cell1(int row, int col){
		this.row = row;
		this.col = col;
	}
}

class T1{
	//�������T�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public T1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,4);
	}
	//T�ͷ�������䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//T�ͷ�������Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//T�ͷ�������Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class O1{
	//�������O�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public O1(){
		c1 = new Cell(0,4);
		c2 = new Cell(0,5);
		c3 = new Cell(1,4);
		c3 = new Cell(1,5);
	}
	//O�ͷ�������䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//O�ͷ�������Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//O�ͷ�������Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
	
}

class I1{
	//����I�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public I1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(0,6);
	}
	//���䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//���Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//���Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class S1{
	//����I�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public S1(){
		c1 = new Cell(0,4);
		c2 = new Cell(0,5);
		c3 = new Cell(1,3);
		c4 = new Cell(1,4);
	}
	//���䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//���Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//���Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class Z1{
	//����Z�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public Z1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(1,4);
		c4 = new Cell(1,5);
	}
	//���䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//���Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//���Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class L1{
	//����I�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public L1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,3);
	}
	//���䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//���Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//���Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class J1{
	//����J�ͷ���ĸ��Ӷ���
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//��ʼ�����Ӷ���Ĺ��췽��
	public J1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,5);
	}
	//���䷽��
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//���Ʒ���
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//���Ʒ���
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}














