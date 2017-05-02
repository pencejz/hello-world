package day05;
/**
 * 测试用于作为集合元素进行排序
 * @author Administrator
 *
 */
public class Point implements Comparable<Point>{

	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
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
	
	public String toString(){
		return "("+x+","+y+")";
	}

	/**
	 * 当前方法的作用是使当前对象(调用方法的对象)与方法参数对象比较大小
	 * 返回值不关注具体值，只关注范围：
	 * 返回值>0  当前对象比参数对象大
	 * 返回值==0  相等
	 * 返回值<0  当前对象比参数对象小
	 */
	//点到原点的距离越大值就越大
	@Override
	public int compareTo(Point p) {
		int len = this.x*this.x + this.y*this.y;
		int plen = p.x*p.x + p.y*p.y;
		return len-plen;
	}
	
}
