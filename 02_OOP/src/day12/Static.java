package day12;

public class Static {

	public static void main(String[] args) {
		
		/**静态变量*/
		//z是类的变量，同类的信息一起储在方法区中
		Hoo.z = 10;
		int n = Hoo.z;
		System.out.println(n); //10
		//创建对象
		Hoo h1 = new Hoo();
		Hoo h2 = new Hoo();
		//对象的属性
		h1.x = 5;
		h1.y = 6;
		
		System.out.println(h1); //5,6,10
		System.out.println(h2); //0,0,10
		/* h1有自己的属性(5,6)
		 * h2有自己的属性(0,0)
		 * h1、h2共享同一个属性z(10)
		 * 只有所有对象共享同一个变量，才能使用静态变量 */
		
		/**静态方法*/
		//计算两点间的距离
		Point p1 = new Point(3,0);
		Point p2 = new Point(0,4);
		double d = Point.distence(p1, p2);
		System.out.println(d); //5.0
		/**
		 * 静态方法与非静态方法的区别
		 *   静态方法是类的方法
		 */
		
		//在对象上调用非静态方法
		d = p1.distance(p2);
		System.out.println(d);
		
		//静态块---static代码块只加载一次，而普通代码块为对象级别，创建一个对象就会加载一次
		Noo n1 = new Noo();
		Noo n2 = new Noo();
		
		
		
		
	}//main
}


class Hoo{
	int x, y;
	static int z;
	public String toString(){
		return x+","+y+","+z;
	}
}
/**计算两点间的距离*/
class Point{
	double x,y;
	//构造方法
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	//计算两点间距离
	public static double distence(Point p1,Point p2){
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		double d = dx*dx + dy*dy;
		return Math.sqrt(d);
	}
	public double distance(/**Point this*/ Point p){
		/*
		 * 非静态方法中有一个隐含的引用this，引用调用方法当前对象，就可以使用这个对象的数据---数据来源1
		 * 方法参数传进来---数据来源2
		 * 静态方法只能通过外面的方法参数传进来
		 */
		double dx = this.x - p.x;
		double dy = this.x - p.y;
		double d = dx*dx + dy*dy;
		return Math.sqrt(d);
	}
	
}

/**
 * 静态块
 */
class Noo{
	//System.out.println("nihao"); //编译错误
	/* 类中不能直接写语句，但是可以通过创建代码块---功能类似于构造方法
	 * 工作中一般使用构造方法，不使用普通代码块 */
	//普通代码块
	{
		System.out.println("普通代码块");
	}
	//静态块---类级别代码块，在类加载期间执行一次，用于只初始化一次的数据。比如：图片
	static{
		System.out.println("静态块");
	}
}






/**
 * 程序中大多使用对象的方法(非静态方法)，工具方法和工厂方法使用静态较多
 * 
 * 常用的工具方法：
 *  -Math.sqrt(unm)
 *  -Math.sin()
 *  -Math.cos()
 *  ---Math类一般为与数学计算相关的方法
 *  -Arrays.toString()
 *  -Arrays.sort()
 *  -Arrays.fill()
 *  ---Arrays类一般保存数组相关的方法
 */












