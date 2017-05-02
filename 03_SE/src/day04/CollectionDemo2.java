package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ������������
 * 
 * @author Administrator
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("c++");
		System.out.println("c1 = "+c1);
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println("c2 = "+c2);
		/**
		 * boolean addAll(Collection c)
		 * ��������������Ԫ����ӵ���ǰ�����У������Ϻ󣬵�ǰ����Ԫ�����������˱仯֮��ͻ᷵��true
		 * ArrayList�п��Դ����ͬԪ�أ�����������java---���Է���true
		 * HashSet�в����Դ����ͬԪ��---��ֻ��һ��java---���Է���true
		 */
		c1.addAll(c2);
		System.out.println("c1+c2 = "+c1);
		
		Collection c3 = new ArrayList();
		c3.add("c++");
		c3.add("java");
		System.out.println("c3 = "+c3);
		/**
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ�أ�ȫ������������true
		 * �жϱ�׼ʹ��equals�Ƚϵ�
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("c3ȫ������c1��"+contains);
		/**
		 * boolean removeAll(Collection c)
		 * ɾ����ǰ������������ϵ���ͬԪ��(����)
		 */
		c1.removeAll(c3);
		System.out.println("c1-c3 = "+c1);
		
		
		
		
	}
}










