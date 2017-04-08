package day09;
//引用变量测试
public class Demo1 {

	public static void main(String[] args) {
		
		Cell c1 = new Cell();
		
		//空指针异常
//		c1 = null;
//		c1.row = 5;
		
		/*c2、c1引用同一个对象，是同一个对象的句柄（把柄），他们可以操作同一个对象*/
		Cell c2 = c1;
		c2.row = 6;
		c1.col = 7;
		System.out.println("c1.row= "+c1.row);
		System.out.println("c2.col= "+c2.col);
		//方法调用
		c2.drop();
		System.out.println("c2.row= "+c2.row);
		

	}//main方法

}//Demo1类

class Cell{
	int row; // 行
	int col; //列
	
	/**
	 * 方法
	 * 重用：在类上声明方法，被全体对象重用！！
	 * 对象的方法：是属于每一个对象的方法。在类上定义的目的就是被全体对象重复使用。
	 * 方法实现的软件的功能，是一个计算过程。
	 */
	public void drop(){
		row++;
	}
	
	
}//Cell类




