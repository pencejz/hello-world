package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合批量操作
 * 
 * @author Administrator
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("c++");
		System.out.println("c1 = "+c1);
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println("c2 = "+c2);
		/**
		 * boolean addAll(Collection c)
		 * 将给定集合所有元素添加到当前集合中，添加完毕后，当前集合元素数量发生了变化之后就会返回true
		 * ArrayList中可以存放相同元素，可以有两个java---可以返回true
		 * HashSet中不可以存放相同元素---，只有一个java---可以返回true
		 */
		c1.addAll(c2);
		System.out.println("c1+c2 = "+c1);
		
		Collection c3 = new ArrayList();
		c3.add("c++");
		c3.add("java");
		System.out.println("c3 = "+c3);
		/**
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素，全部包含，返回true
		 * 判断标准使用equals比较的
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("c3全包含与c1："+contains);
		/**
		 * boolean removeAll(Collection c)
		 * 删除当前集合与给定集合的相同元素(交集)
		 */
		c1.removeAll(c3);
		System.out.println("c1-c3 = "+c1);
		
		
		
		
	}
}










