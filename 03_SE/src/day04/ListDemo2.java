package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合提供了一对重载的add、remove方法
 * @author Administrator
 *
 */
public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * void add(int index,E e)
		 * 向指定位置插入元素
		 */
		list.add(2, "2");
		System.out.println("添加元素后的list："+list);
		/*
		 * E remove(int index)
		 * 删除指定位置上的元素并将其返回
		 */
		String old = list.remove(1);
		System.out.println("删除元素后的list："+list);
		System.out.println("被删除的元素："+old);
		
		
	}
}
