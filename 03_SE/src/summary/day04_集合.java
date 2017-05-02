package summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class day04_集合 {

	public static void main(String[] args) {
		
		/**
		 * Collection类
		 * boolean remove() 删除元素
		 * boolean addAll(Collection c) 将集合c全部添加到当前集合的前面
		 * boolean containsAll(Collection c) 判断当前集合是否包含集合c中的所有元素
		 * boolean removeAll(Collection c) 删除交集
		 * 迭代器   boolean hasNext() 判断集合是否还有元素可以被取出
		 *      E next() 取出当前元素
		 */
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		System.out.println("c1 = "+c1);
		//删除元素
		System.out.println("删除后的c1 = "+c1.remove("two"));
		
		Collection<String> c2 = new ArrayList<String>();
		c2.add("java");
		c2.add("c++");
		c2.add("android");
		System.out.println("c2 = "+c2);
		//把集合c1添加到集合c2中
		System.out.println("c2=c1+c2 = "+c2.addAll(c1));
		//判断c1是不是全部在在c2中
		System.out.println("c2是否包含c1中的所有元素："+c2.containsAll(c1));
		//删除交集
		System.out.println("c2=c2-c1 = "+c2.removeAll(c1));
		
		Collection<String> c3 = new ArrayList<String>();
		c3.add("one");
		c3.add("#");
		c3.add("two");
		c3.add("#");
		c3.add("three");
		c3.add("#");
		c3.add("four");
		System.out.println("c3 = "+c3);
		//迭代器
		Iterator<String> it = c3.iterator();
		while(it.hasNext()){ //判断集合是否还有元素可以被取出
			String str = (String)it.next(); //取出当前元素
			System.out.println("遍历集合的结果："+str);
			if("#".equals(str)){
				it.remove();
			}
		}
		System.out.println("删除元素后的c3 = "+c3);
		/**
		 * 新循环
		 * 用于遍历数组和集合
		 * 新循环的最底层原理就是迭代器
		 * 新循环中可以直接使用元素类型来接收遍历的结果
		 * 迭代器也可以指定泛型，只要与遍历的集合类型一致即可
		 */
		for(Object each : c3){
			String str = (String)each;
			System.out.println("新循环遍历结果："+str);
		}
		/**
		 * 集合与数组的互转
		 * Object[] toArray() 集合转数组一(无参)
		 * arr[] toArray(new arr[int n]) 集合转换数组二(有参)
		 * Arrays.asList(arr[] arr) 数组转换成集合
		 */
		Collection<String> c4 = new ArrayList<String>();
		c4.add("张三");
		c4.add("李四");
		c4.add("王五");
		System.out.println("集合c4 = "+c4);
		//集合转数组
//		Object[] str = new String[c4.size()];
//		str = c4.toArray();//无参
		String[] str = c4.toArray(new String[c4.size()]);//有参
		System.out.println("集合转数组str = "+Arrays.toString(str));//直接输出一个数组的方法
		//数组转集合
		String[] ary = {"one","two","three","four"};
		List<String> list = Arrays.asList(ary);
		System.out.println("数组转集合list = "+list);
		//对集合元素的修改，就是修改原数组对应的元素
		list.set(1, "2");//修改集合元素
		System.out.println("修改后的list = "+list);
		for(String each : ary){
			System.out.println("遍历数组元素："+each);
		}		
		/*
		 * 不能对集合添加新元素，因为这个集合是由数组转换来的，对集合的操作就是对原数组的操作
		 * 那么添加新元素就会导致数组扩容，那就不能表示原数组，所以不支持该操作
		 * 若想对数组转换的集合进行添加元素操作，只能自行在创建一个集合，然后包含原集合元素
		 * 
		 * 所有的集合都支持一个带有Collection参数的构造方法可以在创建当前集合的同时将给定集合中的所有元素包含进来
		 * 这种构造方法也叫作复制构造法
		 */
		//list.add("five"); //抛出异常：UnsupportedOperationException();
		list = new ArrayList<String>(list); //原list集合对象失去引用将会被GC回收
		list.add("five");
		System.out.println(list);		
		/**
		 * List集合
		 * 常用实现类 ： ArrayList 数组实现，查询快
		 *          LinkedLIst 链表实现，增删快
		 * E get(int index) 获取给定下标对应的元素
		 * E set(int index) 将给定元素添加到指定位置
		 * void add(int index,E e) 向指定位置插入指定元素
		 * E remove(int index) 删除指定位置的元素，并返回被删除的元素
		 * List subList(int startIndex,int endList) 截取子集
		 */
		List<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		System.out.println("list1 = "+list1);
		//获取下标为2的元素
		System.out.println("下标为2的元素："+list1.get(2));
		//将下标为1的元素替换为2
		System.out.println("被替换的元素为："+list1.set(1, "2"));
		//在3的位置添加元素3
		System.out.println("替换后的list1 = "+list1);		
		list1.add(3,"4");
		System.out.println("添加后的list1 = "+list1);
		//删除下标为5的元素
		System.out.println("被删除的元素为："+list1.remove(2));
		System.out.println("删除后的list1 = "+list1);
		//截取下标为2到3的元素
		List<String> subList = list1.subList(1, 3);
		System.out.println(subList);
		//将子集扩大10倍
		for(int i=0;i<subList.size();i++){
			int d = Integer.parseInt(subList.get(i))*10;
			String str1 = String.valueOf(d);
			subList.set(i, str1);
		}
		System.out.println("扩大后的subList = "+subList);
		System.out.println("子集扩大后的list1 = "+list1); //对子集的操作就是对原集合中对应元素进行操作
		//利用subList删除多个连续的元素
		list1.subList(1, 3).clear();
		System.out.println("删除元素后的list1 = "+list1);
		
	}//main
	
}










