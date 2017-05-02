package day05;
/**
 * ����������Ϊ����Ԫ�ؽ�������
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
	 * ��ǰ������������ʹ��ǰ����(���÷����Ķ���)�뷽����������Ƚϴ�С
	 * ����ֵ����ע����ֵ��ֻ��ע��Χ��
	 * ����ֵ>0  ��ǰ����Ȳ��������
	 * ����ֵ==0  ���
	 * ����ֵ<0  ��ǰ����Ȳ�������С
	 */
	//�㵽ԭ��ľ���Խ��ֵ��Խ��
	@Override
	public int compareTo(Point p) {
		int len = this.x*this.x + this.y*this.y;
		int plen = p.x*p.x + p.y*p.y;
		return len-plen;
	}
	
}
