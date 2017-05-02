package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean remove(E e)
 * 从集合中将给定元素删除，删除成功返回true
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
		 * remove方法只是删除一个元素，集合会用给定的参数与集合现有的元素顺序比较
		 * 删除第一个与集合元素equals方法比较为true的
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
		c2.remove(p); //删除了第一个(1,2)
		System.out.println(c2);
		
		
		
	}
}
