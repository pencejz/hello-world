package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection 集合接口
 * 集合，用于存储一组元素
 * 自身提供了维护集合元素的相关方法
 * @author Administrator
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		/**
		 * boolean add(E e)
		 * 向集合中添加指定元素，添加成功，返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/**
		 * int size()
		 * 返回当前元素的个数---不是数组的长度
		 */
		System.out.println("size = "+c.size());
		/**
		 * boolean isEmpty()
		 * 查看集合是否为空---有集合，没有元素
		 */
		System.out.println("isEmpty = "+c.isEmpty()); //false
		/**
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		System.out.println("集合已经清空了！");
		System.out.println("size = "+c.size());
		System.out.println("isEmpty = "+c.isEmpty());
		
		
		
		
		
	}
	
	
	
}





