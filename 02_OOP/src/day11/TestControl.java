package day11;

import day11Concorl.Too;

public class TestControl {

	public static void main(String[] args) {
		
		/*
		 * ����ȫ��������Ķ���
		 * �������������о�����ͬ�ĵ����������ʱ��ʹ��
		 */
		day11Concorl.Goo goo1 = new day11Concorl.Goo();
		goo1.t();
		
		//����private ��   public������
		Point p1 =new Point(4,5);
		//x��private���Σ��ɼ���Χ����ڲ��������ⲻ�ܷ���
		//int x = p1.x; //�������
		int y = p1.y;
		p1.test();
		
		/*
		 * protected ��   Ĭ�Ͽ���
		 * �����������࣬�����÷�������ͬ
		 */
		Too t = new Too();
		//int a = t.a; //������󣬲��ɷ���
		Xoo x = new Xoo();
		int b = x.b; //������ȷ
		
		//protected�̳��е�ʹ��
		Son s = new Son();
		s.test(); //0
		//ͨ������Son���Է��ʸ���Father�е�����a
		
		
		
		
	}//main
	
}

class Point{
	private int x;
	public int y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void test(){
		System.out.println(x+","+y);
	}
	
}




/**
 * ���ʿ���
 * 1.import : �������
 *       ���а��е�������û���ظ�ʱ��ֱ��ʹ��import����(����.����)����
 *       �������������о�����ͬ�ĵ����������ʱ����Ҫʹ�ð���ȫ�����������󡣴�ʱ�Ͳ���ʹ��import(ʧЧ)
 *         ����Ҫ��day11����İ���ʹ���۷���Bee����д����day11.Bee b = new day11.Bee();
 *         
 * 2.public ��    private
 *         
 * 3.protected ��   Ĭ��
 *    �������ǵ�ǰ������Ч
 *    �ڲ�ͬ���У�Ĭ�ϵĲ��ɷ��ʡ����ǣ�����Ǹ���ʹ��protected�����ڲ�ͬ���е�������Է���
 * 4.static
 *    ���εĳ�Ա���������ڶ�������ݽṹ
 *    static������������ı�����ͨ������ͨ������������static��Ա
 *    static��Ա�����������Ϣһ��洢�ڷ������У�һ�����е�static��Ա����ֻ��һ�ݣ�ȫ�干��        
 */








