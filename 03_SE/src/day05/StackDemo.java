package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈：存储一组元素，存取必须遵循先进后出原则
 * 栈使用双端队列实现
 * 双端队列：两端都可以进出的队列
 * @author Administrator
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/**
		 * Deque:双端队列
		 */
		Deque<String> stack = new LinkedList<String>();
		/*
		 * void push(E e)
		 * 入栈操作
		 * 最后入栈的元素再栈首位置
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		/*
		 * E pop()
		 * 出栈操作
		 * 获取栈首元素，获取后该元素即从栈中被删除
		 */
		String str = stack.pop();
		System.out.println("str = "+str);
		System.out.println(stack);
		/*
		 * E peek()
		 * 引用队首元素
		 * 获取队首元素，但元素不会被队列删除
		 */
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		//遍历栈中所有元素并取出
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
		
	}
}
