package day12;

public class Static {

	public static void main(String[] args) {
		
		/**��̬����*/
		//z����ı�����ͬ�����Ϣһ���ڷ�������
		Hoo.z = 10;
		int n = Hoo.z;
		System.out.println(n); //10
		//��������
		Hoo h1 = new Hoo();
		Hoo h2 = new Hoo();
		//���������
		h1.x = 5;
		h1.y = 6;
		
		System.out.println(h1); //5,6,10
		System.out.println(h2); //0,0,10
		/* h1���Լ�������(5,6)
		 * h2���Լ�������(0,0)
		 * h1��h2����ͬһ������z(10)
		 * ֻ�����ж�����ͬһ������������ʹ�þ�̬���� */
		
		/**��̬����*/
		//���������ľ���
		Point p1 = new Point(3,0);
		Point p2 = new Point(0,4);
		double d = Point.distence(p1, p2);
		System.out.println(d); //5.0
		/**
		 * ��̬������Ǿ�̬����������
		 *   ��̬��������ķ���
		 */
		
		//�ڶ����ϵ��÷Ǿ�̬����
		d = p1.distance(p2);
		System.out.println(d);
		
		//��̬��---static�����ֻ����һ�Σ�����ͨ�����Ϊ���󼶱𣬴���һ������ͻ����һ��
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
/**���������ľ���*/
class Point{
	double x,y;
	//���췽��
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	//������������
	public static double distence(Point p1,Point p2){
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		double d = dx*dx + dy*dy;
		return Math.sqrt(d);
	}
	public double distance(/**Point this*/ Point p){
		/*
		 * �Ǿ�̬��������һ������������this�����õ��÷�����ǰ���󣬾Ϳ���ʹ��������������---������Դ1
		 * ��������������---������Դ2
		 * ��̬����ֻ��ͨ������ķ�������������
		 */
		double dx = this.x - p.x;
		double dy = this.x - p.y;
		double d = dx*dx + dy*dy;
		return Math.sqrt(d);
	}
	
}

/**
 * ��̬��
 */
class Noo{
	//System.out.println("nihao"); //�������
	/* ���в���ֱ��д��䣬���ǿ���ͨ�����������---���������ڹ��췽��
	 * ������һ��ʹ�ù��췽������ʹ����ͨ����� */
	//��ͨ�����
	{
		System.out.println("��ͨ�����");
	}
	//��̬��---�༶�����飬��������ڼ�ִ��һ�Σ�����ֻ��ʼ��һ�ε����ݡ����磺ͼƬ
	static{
		System.out.println("��̬��");
	}
}






/**
 * �����д��ʹ�ö���ķ���(�Ǿ�̬����)�����߷����͹�������ʹ�þ�̬�϶�
 * 
 * ���õĹ��߷�����
 *  -Math.sqrt(unm)
 *  -Math.sin()
 *  -Math.cos()
 *  ---Math��һ��Ϊ����ѧ������صķ���
 *  -Arrays.toString()
 *  -Arrays.sort()
 *  -Arrays.fill()
 *  ---Arrays��һ�㱣��������صķ���
 */












