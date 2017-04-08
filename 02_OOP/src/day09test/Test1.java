package day09test;
//俄罗斯方块
public class Test1 {

	public static void main(String[] args) {
		/**
		 * 1.创建俄罗斯方块案例中的Cell类
		 * 2.创建俄罗斯方块案例中的T型方块类。为T型方块设计合理的构造器初始化4个格子对象
		 *    为T型方块设计下落和左右移动方法
		 *    添加测试类，测试构造器，测试下落，测试左右移动方法。
		 * 3.创建俄罗斯方块案例中的I,S,Z,L,J,O型方块类, 并且测试
		 */
		T1 t = new T1();
		System.out.println("--------原始数据--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.drop();
		System.out.println("--------下落数据--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.moveLeft();
		System.out.println("--------左移数据--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);
		t.moveRight();
		System.out.println("--------右移数据--------");
		System.out.println("row = "+t.c1.row);
		System.out.println("col = "+t.c1.col);		
		


	}//main
	
	
}//class

class Cell1{
	int row; //行
	int col; //列
	Cell[] cells = new Cell[4];
	
	public Cell1(int row, int col){
		this.row = row;
		this.col = col;
	}
}

class T1{
	//创建组成T型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public T1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,4);
	}
	//T型方块的下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//T型方块的右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//T型方块的左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class O1{
	//创建组成O型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public O1(){
		c1 = new Cell(0,4);
		c2 = new Cell(0,5);
		c3 = new Cell(1,4);
		c3 = new Cell(1,5);
	}
	//O型方块的下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//O型方块的右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//O型方块的左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
	
}

class I1{
	//创建I型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public I1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(0,6);
	}
	//下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class S1{
	//创建I型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public S1(){
		c1 = new Cell(0,4);
		c2 = new Cell(0,5);
		c3 = new Cell(1,3);
		c4 = new Cell(1,4);
	}
	//下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class Z1{
	//创建Z型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public Z1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(1,4);
		c4 = new Cell(1,5);
	}
	//下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class L1{
	//创建I型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public L1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,3);
	}
	//下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}

class J1{
	//创建J型方块的格子对象
	Cell c1;
	Cell c2;
	Cell c3;
	Cell c4;
	//初始化格子对象的构造方法
	public J1(){
		c1 = new Cell(0,3);
		c2 = new Cell(0,4);
		c3 = new Cell(0,5);
		c4 = new Cell(1,5);
	}
	//下落方法
	public void drop(){
		c1.row++;
		c2.row++;
		c3.row++;
		c4.row++;
	}
	//右移方法
	public void moveRight(){
		c1.col++;
		c2.col++;
		c3.col++;
		c4.col++;
	}
	//左移方法
	public void moveLeft(){
		c1.col--;
		c2.col--;
		c3.col--;
		c4.col--;
	}
}














