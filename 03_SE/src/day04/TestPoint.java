package day04;

public class TestPoint {

	public static void main(String[] args) {
		
		Point<Integer> p1 = new Point<Integer>(1,2);
		p1.setX(2);
		int x = p1.getX();
		System.out.println(p1+", "+x);
		
		Point<Double> p2 = new Point<Double>(1.1,2.2);
		p2.setX(2.2);
		double x2 = p2.getX();
		System.out.println(p2+", "+x2);
		
		
		Point<Integer> p3 = new Point<Integer>(1,2);
		//����ʱ�������ǲ��������㷺��
		p3.setX(2);
		//p3.setX(2.2); //������ʱ�����뱨��
		//��ԭʱ���Զ�����---int x3 = (Integer)p1.getX();
		int x3 = p1.getX();
		System.out.println("x3 = "+x3);
		/*
		 * ��ָ�����͵����ͣ�Ĭ�Ͽ���Object
		 */
		Point p4 = p3;
		p4.setX("һ");
		System.out.println("x4 = "+p4.getX());
		//�������쳣
		//x3 = p3.getX(); //����java.lang.ClassCastException
		//System.out.println("x3 = "+x3);
		
		
	}
}
