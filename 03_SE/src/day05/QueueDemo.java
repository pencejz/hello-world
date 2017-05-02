package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ���У��洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�����
 * ����ʵ���ࣺjava.util.LinkedList
 * ���ڶ���ֻ�ܴӶ�β�����Ӷ��׳������Զ���������β��ɾ�����ҿ��Դ洢һ��Ԫ��
 * ��LinkedList��������ʵ�֣��ص������β��ɾԪ�ؿ죬���ҿ��Դ洢һ��Ԫ��
 * ����java��LinkedListҲʵ���˶��нӿ�
 * 
 * @author Administrator
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/**
		 * boolean offer(E e)
		 * ���β�����Ԫ��(��Ӳ���)
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		/**
		 * E poll()
		 * ��ȡ����Ԫ��(���Ӳ���)
		 * ��ȡ���Ԫ�ؼ��Ӷ�����ɾ��
		 */
		String str = queue.poll();
		System.out.println("����poll������"+str);
		System.out.println(queue);
		/**
		 * E peek()
		 * ���ö���Ԫ��
		 * ��ȡ����Ԫ�أ���Ԫ�ز��ᱻ����ɾ��
		 */
		str = queue.peek();
		System.out.println("����peek:"+str);
		System.out.println(queue);
		/**
		 * void size()
		 * ��ȡԪ�ظ���
		 */
		System.out.println(queue.size());
		/**
		 * ���б���
		 * ��ò�ʹ��forѭ��
		 */
		//whileʵ��
		System.out.println("---��ʼ����---");
		while(queue.size()>0){
			str = queue.poll();
			System.out.println(str);
		}
		System.out.println("---��������---");
		System.out.println(queue);
//		//forѭ��ʵ��
//		for(int i=queue.size();i>0;i--){
//			str = queue.poll();
//			System.out.println(str);
//		}
		
		
		
	}
}
