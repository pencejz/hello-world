package day09;
//构造方法重载
public class Demo5 {

	public static void main(String[] args) {
		
		//使用new运算调用构造方法
		Circle c1 = new Circle(3,3,2); //调用有参构造方法
		Circle c2 = new Circle(); //调用无参构造方法
		
		System.out.println("圆c1坐标：("+c1.x+","+c1.y+") "+"圆c1半径： "+c1.r);
		System.out.println("圆c2坐标：("+c2.x+","+c2.y+") "+"圆c2半径： "+c2.r);
		
	}//main

}


class Circle{
	int x; //圆形坐标(x,y)
	int y;
	int r; //半径
	//定义构造方法
	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		//此处this.不可省略
	}
	//重载构造方法---创建单位圆
	public Circle(){
		//方法一：
//		x = 0;
//		y = 0;
//		r = 1;
		/*
		 * 在构造方法的第一行调用当前类的其他构造方法，使构造器之间实现了重用初始化逻辑代码
		 */
		//方法二：
		this(0,0,1);
	}
	
	
	
}