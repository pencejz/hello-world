package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection ���Ͻӿ�
 * ���ϣ����ڴ洢һ��Ԫ��
 * �����ṩ��ά������Ԫ�ص���ط���
 * @author Administrator
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		/**
		 * boolean add(E e)
		 * �򼯺������ָ��Ԫ�أ���ӳɹ�������true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/**
		 * int size()
		 * ���ص�ǰԪ�صĸ���---��������ĳ���
		 */
		System.out.println("size = "+c.size());
		/**
		 * boolean isEmpty()
		 * �鿴�����Ƿ�Ϊ��---�м��ϣ�û��Ԫ��
		 */
		System.out.println("isEmpty = "+c.isEmpty()); //false
		/**
		 * void clear()
		 * ��ռ���
		 */
		c.clear();
		System.out.println("�����Ѿ�����ˣ�");
		System.out.println("size = "+c.size());
		System.out.println("isEmpty = "+c.isEmpty());
		
		
		
		
		
	}
	
	
	
}





