package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ���ϴ�ŵ���Ԫ�ص�����
 * @author Administrator
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		c.add(p);
		System.out.println(p);
		System.out.println(c);
		
		p.setX(2);
		System.out.println(p);
		System.out.println(c);
		
		
	}
}
