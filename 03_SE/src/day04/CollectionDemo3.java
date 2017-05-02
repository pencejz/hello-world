package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������Ԫ�ط���
 * Iterator iterator()
 * �÷����᷵��һ�����ڱ�����ǰ���ϵĵ�����
 * Iterator��һ���ӿڣ������˱�������Ԫ�ص���ط�������ͬ�������������ʵ����
 * ���������ס�����������ʵ���ֻ࣬�轫�䵱����ڿ�����ֱ�ӵ������еı�����������
 * 
 * @author Administrator
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println("c = "+c);
		/**
		 * ��������������Ӧ����ѭ����---ȡ---ɾ(�Ǳ������)
		 * boolean hasNext()  �жϼ����Ƿ���Ԫ�ؿ��Ա�ȡ��
		 * E next()  ȡ����һ��Ԫ��
		 * 
		 * ��ʹ�õ�������������ʱ����Ҫͨ����������ķ�����ɾ����Ԫ�أ�������׳��쳣
		 * ɾ������ʹ�õ������ṩ��remove����������ɾ��ͨ��next������������Ԫ��
		 */
		Iterator it = c.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println("���ϱ��������"+str);
			if("#".equals(str)){
				//c.remove(str); //�����ڵ������в�Ҫ���ü��ϵķ��������в���
				it.remove(); //���õ������ṩ��remove������ֱ��ɾ����ǰnext������������Ԫ��
			}
		}
		System.out.println("c = "+c);
	}
}
