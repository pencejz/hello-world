package day04;
/**
 * JDK1.5之后推出课泛型
 * 泛型又称为参数化类型，仅对结构定义，具体属性，方法参数，方法返回值的类型不定义，而是交给使用者决定
 * 使用者在创建该类实例时，将泛型的实际类型传入
 * 
 * 泛型的原型是Object。下面的x y在实例化的时候实际上是Object类型，泛型只是编译器帮我们做了事情
 * 在编译时，编译器会验证实际的值的类型与泛型是否一致，不一致时，编译就不会通过，并且获取值得时候自动作造型
 * @author Administrator
 *
 */
public class Point<E> {

	private E x;
	private E y;
	
	public Point(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}
