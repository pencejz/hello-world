package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean remove(E e)
 * �Ӽ����н�����Ԫ��ɾ����ɾ���ɹ�����true
 * @author Administrator
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		/*
		 * remove����ֻ��ɾ��һ��Ԫ�أ����ϻ��ø����Ĳ����뼯�����е�Ԫ��˳��Ƚ�
		 * ɾ����һ���뼯��Ԫ��equals�����Ƚ�Ϊtrue��
		 */
		c.remove("one");
		System.out.println(c);
		
		Collection c2 = new ArrayList();
		c2.add(new Point(1,2));
		c2.add(new Point(3,4));
		c2.add(new Point(5,6));
		c2.add(new Point(1,2));
		System.out.println(c2);
		Point p = new Point(1,2);
		c2.remove(p); //ɾ���˵�һ��(1,2)
		System.out.println(c2);
		
		
		
	}
}
