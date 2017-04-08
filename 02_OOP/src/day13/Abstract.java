package day13;

//Բ������---�����������ײ����
public class Abstract {

	public static void main(String[] args) {
		/**�����಻�ɱ�ʵ����,���ǲ��ɱ��������󣬳������ǲ���������
		 * ��������Զ�����������Դ����̳е��������͵Ķ���
		 * �����ж����˳��󷽷�������ͱ���Ϊ��ʵ�֣�����ÿ�������ʵ�ֶ��в�ͬ
		 * �������󷽷�����һ���ǳ�����
		 * �����г��ַ�������ͬ��ʵ�ֲ�ͬ�ķ�����java�����ڸ����д������󷽷� */
		Shape a; //��������Զ������ñ���
		//����һ��Բ���
		Shape s = new Circle(3, 4, 5); //��������Դ����̳��������͵Ķ���
		double c = s.area();
		System.out.println("Բ���Ϊ��"+c);
		//�ж��Ƿ���Բ��ײ
		boolean b = s.duang(3, 3);
		System.out.println(b);
		b = s.duang(12, 12);
		System.out.println(b);
		//����������
		s = new Rect(5, 10, 5, 6);
		double r = s.area();
		System.out.println("�������Ϊ��"+r);
		//�ж��Ƿ��������ײ
		b = s.duang(2, 2);
		System.out.println(b);
		b = s.duang(6, 6);
		System.out.println(b);
		
		
		
	}

}

//��״����
abstract class Shape {
	int x, y;
	//�������
	public abstract double area();
	//��ײ�ж�
	public abstract boolean duang(int x,int y);
	
}

//Բ������
class Circle extends Shape{
	
	private int r;
	//���췽����ʼ��
	public Circle(int x,int y,int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	//����Բ���
	public double area() {
		return Math.PI*r*r;
	}
	//�ж��Ƿ���ײ
	public boolean duang(int x, int y) {
		int a = this.x -x;
		int b = this.y -y;
		return a*a + b*b < r*r;
	}
	
}

//����������
class Rect extends Shape{
	private int w,h;
	//���췽����ʼ��
	public Rect(int x,int y,int w,int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	//����������
	public double area() {
		return w*h;
	}
	//�ж��Ƿ��������ײ
	public boolean duang(int x, int y) {
		int x1 = this.x;
		int x2 = this.x+w;
		int y1 = this.y;
		int y2 = this.y-h;
		return x1<x&&x<x2 && y2<y&&y<y1;
	}
	
}
