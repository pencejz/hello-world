package day08test;

import java.util.Scanner;

/**ΪCell��������ƹ��ܵķ���*/
public class Test {

	public static void main(String[] args) {
		
		
//		//�������Ӷ��󣬲���ʼ��*��λ��(15,3)
//		Cell cell = new Cell(15,3);
//		//���Ƹ���ƽ��
//		System.out.println("���Ƹ���ƽ�棺");
//		printCell(cell);
//		//*����һ��
//		System.out.println("*����һ��");
//		cell.moveRight();
//		printCell(cell);
//		//*y���ƶ��
//		int n;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���������Ƶĸ�������");
//		n = scan.nextInt();
//		System.out.println("*����"+n+"��");
//		cell.moveRight(n);
//		printCell(cell);
//		scan.close();
		
		
		/**
		 * ʵ�ֹ���ģ��ѡ��
		 * 1��ʾ����һ��
		 * 2��ʾ����һ��
		 * 3��ʾ����һ��
		 * 0��ʾ�˳���
		 */
		
		//�������Ӷ��󣬲���ʼ��*λ��(3,3)
		Cell cell = new Cell(3,3);
		//���Ƹ���ƽ��
		System.out.println("���Ƹ���ƽ�棺");
		printCell(cell);
		//����ģ���ѡ��
		System.out.println("����ģ��ѡ��1��ʾ����һ�У�2��ʾ����һ�У�3��ʾ����һ�У�0��ʾ�˳�");
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		while(n!=0){
			
			switch(n){
			case 1:
				cell.row++;
				break;
			case 2:
				cell.col--;
				break;
			case 3:
				cell.col++;
				break;
			default:
				System.out.println("���������룺");
				n = scan.nextInt();
			}
			printCell(cell);
			System.out.println("����ģ��ѡ��1��ʾ����һ�У�2��ʾ����һ�У�3��ʾ����һ�У�0��ʾ�˳�");
			n = scan.nextInt();
		}
		
		System.out.println("��Ϸ������");
		scan.close();
		

	}//main
	
	
	
	//��ӡ����ƽ��ķ���(10,20)
	public static void printCell(Cell cell){
		int totalRow = 20;
		int totalCol = 10;
		for(int row=0;row<totalRow;row++){ //��
			for(int col=0;col<totalCol;col++){ //��
				if(cell.row==row && cell.col==col){
					System.out.print(" *");
				}else{
					System.out.print(" -");
				}
			}
			System.out.println();
		}
	}

}


class Cell{
	int row;
	int col;
	//���췽��
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	/**
	 * ����1���������Ʒ���������Ҫ�����κβ�������*�����ƶ�һ��
	 * ����2���������Ʒ�������������Ҫ�ƶ�����������*�������ƶ���Ӧ������
	 */
	public void moveRight(){
		col++;
	}
	
	public void moveRight(int d){
		col+=d;
	}
	
	
	
	
	
}