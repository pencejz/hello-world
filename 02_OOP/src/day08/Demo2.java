package day08;

//类中的方法
public class Demo2 {
	
	public static void main(String[] args){
		/**
		 * 俄罗斯方块中小格子类
		 * new 用于分配空间(分配变量)
		 * new Cell() 分配了一组3个int变量
		 * 这一组变量称为对象
		 */
		Cell c1 = new Cell();
		Cell c2 = new Cell();
		Cell c3 = new Cell();
		Cell c4 = new Cell();
		//初始化对象数据：向对象赋值
		//对象的属性：属于每个对象的数据。对象的属性在类中定义，只在类中声明变量的名字，变量的值是属于对象的。
		c1.row = 6;
		c1.col = 3;
		
		c2.row = 6;
		c2.col = 4;
		
		c3.row = 6;
		c3.col = 5;
		
		c4.row = 7;
		c4.col = 5;
		//方法调用
		c1.drop();
		c2.drop();
		c3.drop();
		c4.drop();
		
		c1.moveRight();
		c1.moveLeft();
		
	}//main
	
}//class

/**
 * 俄罗斯方块中的小格子Cell类
 */
class Cell{
	
	int row; //行
	int col; //Column 列
	int color; //颜色(RGB)
	
	/**
	 * 实现格子下落的行为的方法
	 * 封装了可以“重复使用”的下落算法
	 */
	public void drop(){
		row ++;
		//音响效果
		//动画效果
	}
	//向右移动
	public void moveRight(){
		col ++;
		System.out.println(col);
	}
	//向左移动
	public void moveLeft(){
		col --;
		System.out.println(col);
	}
	
}









