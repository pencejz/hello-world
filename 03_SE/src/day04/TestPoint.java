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
		//传参时，会检查是参类型满足泛型
		p3.setX(2);
		//p3.setX(2.2); //不满足时，编译报错
		//还原时，自动造型---int x3 = (Integer)p1.getX();
		int x3 = p1.getX();
		System.out.println("x3 = "+x3);
		/*
		 * 不指定泛型的类型，默认看做Object
		 */
		Point p4 = p3;
		p4.setX("一");
		System.out.println("x4 = "+p4.getX());
		//类造型异常
		//x3 = p3.getX(); //报错java.lang.ClassCastException
		//System.out.println("x3 = "+x3);
		
		
	}
}
