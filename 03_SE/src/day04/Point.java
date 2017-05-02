package day04;
/**
 * JDK1.5֮���Ƴ��η���
 * �����ֳ�Ϊ���������ͣ����Խṹ���壬�������ԣ�������������������ֵ�����Ͳ����壬���ǽ���ʹ���߾���
 * ʹ�����ڴ�������ʵ��ʱ�������͵�ʵ�����ʹ���
 * 
 * ���͵�ԭ����Object�������x y��ʵ������ʱ��ʵ������Object���ͣ�����ֻ�Ǳ�������������������
 * �ڱ���ʱ������������֤ʵ�ʵ�ֵ�������뷺���Ƿ�һ�£���һ��ʱ������Ͳ���ͨ�������һ�ȡֵ��ʱ���Զ�������
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
