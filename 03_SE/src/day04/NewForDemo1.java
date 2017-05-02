package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK1.5之后推出一个新特性：
 * 增强型for循环，也称 新循环，for each
 * 只用于遍历数组和集合，故并完全不能取代传统for循环的工作
 * @author Administrator
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {
		
		String[] ary = {"one","two","three","four"};
		
		for(int i=0;i<ary.length;i++){
			String str = ary[i];
			System.out.println(str);
		}
		
		for(String str:ary){
			System.out.println(str);
		}
		
		//遍历集合
		/*
		 * 新循环不是新语法，JVM并不认可新循环，而是编译器
		 * 编译器在编译时，若发现使用了新循环的遍历集合时，会将代码自动改为迭代器
		 * 所以新循环遍历就是迭代器遍历，在使用新循环时，也不要通过集合的方法增删元素
		 */
		System.out.println("--------遍历集合----------");
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
		
		
	}
}
