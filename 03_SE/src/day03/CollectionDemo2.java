package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * @author Administrator
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		Point p = new Point(1,2);		
		boolean contains = c.contains(p); //ʹ��Point������д��equals���������Ƚ�
		/**
		 * contains���ж������ǿ�����Ԫ���뼯�����е�Ԫ����û��equals�Ƚ�Ϊtrue�ģ�������Ϊ����
		 * ����Ԫ��equals���������⼯�ϰ���Ԫ�ص��жϽ��
		 */
		System.out.println("������"+contains);
		
	}
	
	
}



