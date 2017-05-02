package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
 * @author Administrator
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		Point p = new Point(1,2);		
		boolean contains = c.contains(p); //使用Point类中重写的equals方法来作比较
		/**
		 * contains的判断依据是看给定元素与集合现有的元素有没有equals比较为true的，有则认为包含
		 * 所以元素equals方法决定这集合包含元素的判断结果
		 */
		System.out.println("包含："+contains);
		
	}
	
	
}



