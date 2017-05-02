package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转List集合
 * 数组中可含有重复元素，故只能转化为List集合
 * 数组转化的集合不能做增删操作
 * 对集合元素的修改，就是修改原数组对应的元素
 * @author Administrator
 *
 */
public class ArrayToList {

	public static void main(String[] args) {
		String[] ary = {"one","two","three","four"};
		List<String> list = Arrays.asList(ary);
		System.out.println(list);
		//对集合元素的修改，就是修改原数组对应的元素
		list.set(1, "2");
		System.out.println(list);
		for(String str : ary){
			System.out.println(str);
		}
		/*
		 * 不能对集合添加新元素，因为这个集合是由数组转换来的，对集合的操作就是对原数组的操作
		 * 那么添加新元素就会导致数组扩容，那就不能表示原数组，所以不支持该操作
		 */
		//list.add("five"); //抛出异常：UnsupportedOperationException();
		/**
		 * 若想对数组转换的集合进行添加元素操作
		 * 那么只能自行在创建一个集合，然后把包含原集合元素，才能继续进行
		 * 
		 * 所有的集合都支持一个带有Collection参数的构造方法
		 * 可以在创建当前集合的同时将给定集合中的所有元素包含进来
		 * 这种构造方法也叫作复制构造法
		 */
		List<String> list1 = new ArrayList<String>(list);
		list1.add("five");
		System.out.println(list1);
		
		
		
		
	}
}
