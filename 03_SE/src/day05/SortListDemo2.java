package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序含有自定义元素的集合
 * @author Administrator
 *
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3,5));
		list.add(new Point(1,4));
		list.add(new Point(6,7));
		list.add(new Point(3,9));
		list.add(new Point(8,5));
		System.out.println(list);
		/**
		 * sort方法要求集合元素必须实现Comparable接口并定义比较大小的规则
		 * 在Point中实现Comparable接口
		 * 
		 * sort方法虽然可以对集合排序，但也有不足：
		 * 1.要求集合必须实现接口Comparable，这样就对元素产生了侵入性
		 * 2.若元素已经实现了比较的方法，但是该方法比较大小规则不能满足排序需求时会很麻烦
		 */
		Collections.sort(list);
		System.out.println(list);
		
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("苍老师");
		list1.add("小泽老师");
		list1.add("范老师");
		list1.add("彭君照");
		System.out.println(list1);
		
		Comparator<String> comm = new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		};
		Collections.sort(list1,comm);
		System.out.println(list1);
		
		
		
		
	}
}
