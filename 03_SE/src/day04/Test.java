package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1.创建一个集合c1，存放元素“one”,“two”,“three”
		 *   在创建一个集合c2，存放元素“four”,“five”,“six”
		 *   将c2的元素全部存入c1
		 *   创建集合c3，存放元素“one”，“five”
		 *   输出集合c1是否包含集合c3所有元素
		 *   删除c1中的元素two，再输出c1
		 */
		//test1();
		/**
		 * 创建一个集合存放元素“1”，“#”，“2”，“#”，“3”，“#”，“4”
		 * 使用迭代器(Iterator)遍历集合，并在迭代过程中删除“#”
		 * 使用新循环遍历输出每一个元素
		 */
		//taet2();
		/**
		 * 创建一个List集合,存放元素“one”,“two”,“three”，“four”
		 * 获取集合第2个元素输出
		 * 将集合第3个元素设置为“3”
		 * 在集合第2个位置插入元素“2”
		 */
		//test3();
		
		
		
		
	}
	
	public static void test3() {
		//创建一个List集合,存放元素“one”,“two”,“three”，“four”
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list = "+list);
		//获取集合第2个元素输出
		String str = list.get(1);
		System.out.println(str);
		//将集合第3个元素设置为“3”
		list.set(2, "3");
		System.out.println(list);
		//在集合第2个位置插入元素“2”
		list.add(1, "2");
		System.out.println(list);
		
	}

	public static void taet2() {
		//创建一个集合存放元素“1”，“#”，“2”，“#”，“3”，“#”，“4”
		Collection<String> c1 = new ArrayList<String>();
		c1.add("1");
		c1.add("#");
		c1.add("2");
		c1.add("#");
		c1.add("3");
		c1.add("#");
		c1.add("4");
		System.out.println("c1 = "+c1);
		//使用迭代器(Iterator)遍历集合，并在迭代过程中删除“#”
		Iterator it = c1.iterator();
		while(it.hasNext()){ //问
			String str = (String)it.next(); //取
			System.out.println(str);
			if("#".equals(str)){
				it.remove(); //删
			}
		}
		System.out.println(c1);
		//使用新循环遍历输出每一个元素
		for(String str : c1){
			System.out.println("新循环遍历输出："+str);
		}
		
		
		
		
		
	}

	public static void test1(){
		//创建集合c1
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		System.out.println("c1 = "+c1);
		//创建集合c2
		Collection<String> c2 = new ArrayList<String>();
		c2.add("four");
		c2.add("five");
		c2.add("six");
		System.out.println("c2 = "+c2);
		//将c2全部存入c1
		c1.addAll(c2);
		System.out.println("将c2存入c1 = "+c1);
		//创建集合c3
		Collection<String> c3 = new ArrayList<String>();
		c3.add("one");
		c3.add("five");
		System.out.println("c3 = "+c3);
		//判断c1是否包含c3的所有元素
		boolean contains = c1.containsAll(c3);
		System.out.println("c1是否包含c3："+contains);
		//删除c1中的two，输出c1
		boolean b = c1.remove("two");
		System.out.println("是否删除c1中的two："+b);
		System.out.println("c1 = "+c1);
		
		
	}
}
