package day02;
/**
 * 测试Object方法的重写
 * Point的每一个实例用于表示直角坐标系中的一个点
 * @author Administrator
 *
 */
public class Point {
	
	private int x;
	private int y;
	//外界获得x的方法
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//无参构造方法
	public Point() {
		super();
	}
	//有参构造方法
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * 重写Object的toString方法
	 * 通常我们需要使用一个类的toString方法就需要重写该方法
	 * java提供的类基本上也都重写了toString，我们也要重写
	 * toString返回值的字符没有具体的格式要求，原则上该字符串应当当前对象的属性信息。
	 * 格式根据实际开发需求来写
	 * 若不重写，则使用Object提供的toString。而该方法的返回值并没有实际意义(格式：类名@地址)
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * equals方法是Object提供的。目的是比较同一类型的两个对象的内容是否一致
	 * Object本身的实现是使用==，所以并没有实际意义
	 * 若需要比较两个实例间的内容是否一样，就需要自己重写该方法来定义比较规则
	 * 比较内容时，结合实际开发而定，并非是选择所有的属性
	 * 
	 * 比较字符串就要使用equals方法
	 * 所有引用类型变量，若希望比较的是对象内容都应当使用equals
	 * 
	 * @param o
	 * @return
	 */
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o==this){
			return true;
		}
		if(o instanceof Point){
			Point p = (Point)o;
			return this.x == x && this.y == y;
		}
		return false;
		
		
	}
	
	
	
	
	
	
	
	
	
}
