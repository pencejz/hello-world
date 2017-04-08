package day08test;

import java.util.Scanner;

/**为Cell类添加右移功能的方法*/
public class Test {

	public static void main(String[] args) {
		
		
//		//创建格子对象，并初始化*的位置(15,3)
//		Cell cell = new Cell(15,3);
//		//绘制格子平面
//		System.out.println("绘制格子平面：");
//		printCell(cell);
//		//*右移一格
//		System.out.println("*右移一格：");
//		cell.moveRight();
//		printCell(cell);
//		//*y右移多格
//		int n;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入右移的格子数：");
//		n = scan.nextInt();
//		System.out.println("*右移"+n+"格：");
//		cell.moveRight(n);
//		printCell(cell);
//		scan.close();
		
		
		/**
		 * 实现功能模块选择：
		 * 1表示下落一行
		 * 2表示左移一列
		 * 3表示右移一列
		 * 0表示退出。
		 */
		
		//创建格子对象，并初始化*位置(3,3)
		Cell cell = new Cell(3,3);
		//绘制格子平面
		System.out.println("绘制格子平面：");
		printCell(cell);
		//功能模块的选择
		System.out.println("功能模块选择：1表示下落一行，2表示左移一列，3表示右移一列，0表示退出");
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
				System.out.println("请重新输入：");
				n = scan.nextInt();
			}
			printCell(cell);
			System.out.println("功能模块选择：1表示下落一行，2表示左移一列，3表示右移一列，0表示退出");
			n = scan.nextInt();
		}
		
		System.out.println("游戏结束！");
		scan.close();
		

	}//main
	
	
	
	//打印格子平面的方法(10,20)
	public static void printCell(Cell cell){
		int totalRow = 20;
		int totalCol = 10;
		for(int row=0;row<totalRow;row++){ //行
			for(int col=0;col<totalCol;col++){ //列
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
	//构造方法
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	/**
	 * 功能1：调用右移方法，不需要传入任何参数，则*向右移动一列
	 * 功能2：调用右移方法，并传入需要移动的列数，则*将向右移动相应的列数
	 */
	public void moveRight(){
		col++;
	}
	
	public void moveRight(int d){
		col+=d;
	}
	
	
	
	
	
}