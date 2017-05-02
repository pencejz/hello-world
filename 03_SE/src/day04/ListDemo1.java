package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * Collection���ӽӿڣ��ص���  �ظ���������
 * List�ṩ��һϵ�еĶ��еķ������ص��Ƕ����Ը����±����Ԫ��
 * @author Administrator
 *
 */

public class ListDemo1 {

	public static void main(String[] args) {
		
		/**
		 * List����������ʵ���ࣺ
		 * ArrayList:����ʵ�֣���ѯ��
		 * LinkedList:����ʵ�֣���ɾ�飨��βЧ�����ԣ�
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		/*
		 * E get(int index)
		 * ��ȡ�����±��Ӧ��Ԫ��
		 */
		String str = list.get(1); //��ȡ��2��Ԫ��
		System.out.println(str);
		
		for(int i=0;i<list.size();i++){ //�������ϣ���ȡ����Ԫ��
			System.out.println(list.get(i));
		}
		/*
		 * E set(int index,E e)
		 * ��������Ԫ�����õ����ϵ�ָ��λ�ô�������ֵ��ԭλ��Ԫ��
		 * �������滻��ǰ���еĲ���
		 */
		String old = list.set(2, "3");
		System.out.println(list);
		System.out.println("old = "+old); //three
		
	}
}




