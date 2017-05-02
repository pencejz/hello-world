package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * Collection的子接口：特点是  重复集、有序
 * List提供了一系列的独有的方法，特点是都可以根据下标操作元素
 * @author Administrator
 *
 */

public class ListDemo1 {

	public static void main(String[] args) {
		
		/**
		 * List有两个常用实现类：
		 * ArrayList:数组实现，查询快
		 * LinkedList:链表实现，增删块（首尾效果明显）
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取给定下标对应的元素
		 */
		String str = list.get(1); //获取第2个元素
		System.out.println(str);
		
		for(int i=0;i<list.size();i++){ //遍历集合，获取所有元素
			System.out.println(list.get(i));
		}
		/*
		 * E set(int index,E e)
		 * 将给定的元素设置到集合的指定位置处，返回值是原位置元素
		 * 仅用于替换当前已有的操作
		 */
		String old = list.set(2, "3");
		System.out.println(list);
		System.out.println("old = "+old); //three
		
	}
}




