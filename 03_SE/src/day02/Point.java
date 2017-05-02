package day02;
/**
 * ����Object��������д
 * Point��ÿһ��ʵ�����ڱ�ʾֱ������ϵ�е�һ����
 * @author Administrator
 *
 */
public class Point {
	
	private int x;
	private int y;
	//�����x�ķ���
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
	//�޲ι��췽��
	public Point() {
		super();
	}
	//�вι��췽��
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * ��дObject��toString����
	 * ͨ��������Ҫʹ��һ�����toString��������Ҫ��д�÷���
	 * java�ṩ���������Ҳ����д��toString������ҲҪ��д
	 * toString����ֵ���ַ�û�о���ĸ�ʽҪ��ԭ���ϸ��ַ���Ӧ����ǰ�����������Ϣ��
	 * ��ʽ����ʵ�ʿ���������д
	 * ������д����ʹ��Object�ṩ��toString�����÷����ķ���ֵ��û��ʵ������(��ʽ������@��ַ)
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * equals������Object�ṩ�ġ�Ŀ���ǱȽ�ͬһ���͵���������������Ƿ�һ��
	 * Object�����ʵ����ʹ��==�����Բ�û��ʵ������
	 * ����Ҫ�Ƚ�����ʵ����������Ƿ�һ��������Ҫ�Լ���д�÷���������ȽϹ���
	 * �Ƚ�����ʱ�����ʵ�ʿ���������������ѡ�����е�����
	 * 
	 * �Ƚ��ַ�����Ҫʹ��equals����
	 * �����������ͱ�������ϣ���Ƚϵ��Ƕ������ݶ�Ӧ��ʹ��equals
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
