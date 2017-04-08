package day13;

//圆，矩形---面积方法，碰撞方法
public class Abstract {

	public static void main(String[] args) {
		/**抽象类不可被实例化,就是不可被创建对象，抽象类是不完整的类
		 * 抽象父类可以定义变量，可以创建继承的子类类型的对象
		 * 父类中定义了抽象方法，子类就必须为其实现，但是每个子类的实现都有不同
		 * 包含抽象方法的类一定是抽象类
		 * 子类中出现方法名相同，实现不同的方法，java建议在父类中创建抽象方法 */
		Shape a; //抽象父类可以定义引用变量
		//计算一个圆面积
		Shape s = new Circle(3, 4, 5); //抽象父类可以创建继承子类类型的对象
		double c = s.area();
		System.out.println("圆面积为："+c);
		//判断是否与圆碰撞
		boolean b = s.duang(3, 3);
		System.out.println(b);
		b = s.duang(12, 12);
		System.out.println(b);
		//计算矩形面积
		s = new Rect(5, 10, 5, 6);
		double r = s.area();
		System.out.println("矩形面积为："+r);
		//判断是否与矩形相撞
		b = s.duang(2, 2);
		System.out.println(b);
		b = s.duang(6, 6);
		System.out.println(b);
		
		
		
	}

}

//形状父类
abstract class Shape {
	int x, y;
	//面积计算
	public abstract double area();
	//碰撞判断
	public abstract boolean duang(int x,int y);
	
}

//圆类子类
class Circle extends Shape{
	
	private int r;
	//构造方法初始化
	public Circle(int x,int y,int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	//计算圆面积
	public double area() {
		return Math.PI*r*r;
	}
	//判断是否相撞
	public boolean duang(int x, int y) {
		int a = this.x -x;
		int b = this.y -y;
		return a*a + b*b < r*r;
	}
	
}

//矩形类子类
class Rect extends Shape{
	private int w,h;
	//构造方法初始化
	public Rect(int x,int y,int w,int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	//计算矩形面积
	public double area() {
		return w*h;
	}
	//判断是否与矩形相撞
	public boolean duang(int x, int y) {
		int x1 = this.x;
		int x2 = this.x+w;
		int y1 = this.y;
		int y2 = this.y-h;
		return x1<x&&x<x2 && y2<y&&y<y1;
	}
	
}
