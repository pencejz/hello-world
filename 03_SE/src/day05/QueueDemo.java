package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列：存储一组元素，但是存取元素必须遵循先进先出规则
 * 常用实现类：java.util.LinkedList
 * 由于队列只能从队尾进，从队首出，所以队列总是首尾增删，并且可以存储一组元素
 * 而LinkedList是由链表实现，特点就是首尾增删元素快，并且可以存储一组元素
 * 所以java让LinkedList也实现了队列接口
 * 
 * @author Administrator
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/**
		 * boolean offer(E e)
		 * 向队尾添加新元素(入队操作)
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		/**
		 * E poll()
		 * 获取队首元素(出队操作)
		 * 获取后该元素即从队列中删除
		 */
		String str = queue.poll();
		System.out.println("调用poll方法："+str);
		System.out.println(queue);
		/**
		 * E peek()
		 * 引用队首元素
		 * 获取队首元素，但元素不会被队列删除
		 */
		str = queue.peek();
		System.out.println("调用peek:"+str);
		System.out.println(queue);
		/**
		 * void size()
		 * 获取元素个数
		 */
		System.out.println(queue.size());
		/**
		 * 队列遍历
		 * 最好不使用for循环
		 */
		//while实现
		System.out.println("---开始遍历---");
		while(queue.size()>0){
			str = queue.poll();
			System.out.println(str);
		}
		System.out.println("---结束遍历---");
		System.out.println(queue);
//		//for循环实现
//		for(int i=queue.size();i>0;i--){
//			str = queue.poll();
//			System.out.println(str);
//		}
		
		
		
	}
}
