package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ���洢һ��Ԫ�أ���ȡ������ѭ�Ƚ����ԭ��
 * ջʹ��˫�˶���ʵ��
 * ˫�˶��У����˶����Խ����Ķ���
 * @author Administrator
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/**
		 * Deque:˫�˶���
		 */
		Deque<String> stack = new LinkedList<String>();
		/*
		 * void push(E e)
		 * ��ջ����
		 * �����ջ��Ԫ����ջ��λ��
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		/*
		 * E pop()
		 * ��ջ����
		 * ��ȡջ��Ԫ�أ���ȡ���Ԫ�ؼ���ջ�б�ɾ��
		 */
		String str = stack.pop();
		System.out.println("str = "+str);
		System.out.println(stack);
		/*
		 * E peek()
		 * ���ö���Ԫ��
		 * ��ȡ����Ԫ�أ���Ԫ�ز��ᱻ����ɾ��
		 */
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		//����ջ������Ԫ�ز�ȡ��
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
		
	}
}
