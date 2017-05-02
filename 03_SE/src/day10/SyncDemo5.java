package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合转换为线程安全的
 * @author sss
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		
		/**
		 * List常用实现类：
		 * ArrayList与LinkedList均不是线程安全的
		 * 可以使用集合工具类Collections提供的方法，将现有List集合转换为线程安全的
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list："+list);
		/**
		 * 将给定的List集合转换为线程安全的，返回的是一个线程安全的集合并且还包含原来集合中的所有元素
		 */
		list = Collections.synchronizedList(list);
		System.out.println("线程安全的list："+list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println("set："+set);
		/**
		 * Set集合的常用实现类为HashSet。它并不是线程安全的，若在多线程的情况下使用需要转换
		 */
		set = Collections.synchronizedSet(set);
		System.out.println("线程安全的set："+set);
		
		/**
		 * HashMap也不是线程安全的，若希望使用线程安全的，可以使用Collections进行转换
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		System.out.println("map："+map);
		/**
		 * Integer remove(key)
		 * Map的remove方法是将给定的key所对应的key-value对从Map中删除，返回值为这个key对应的value
		 */
		Integer value = map.remove("语文");
		System.out.println(map);
		System.out.println("被删除的value："+value);
		
		map = Collections.synchronizedMap(map);
		System.out.println("线程安全的map："+map);
		
		
		
	} //mian
	
}








