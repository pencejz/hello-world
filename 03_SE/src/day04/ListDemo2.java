package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List�����ṩ��һ�����ص�add��remove����
 * @author Administrator
 *
 */
public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * void add(int index,E e)
		 * ��ָ��λ�ò���Ԫ��
		 */
		list.add(2, "2");
		System.out.println("���Ԫ�غ��list��"+list);
		/*
		 * E remove(int index)
		 * ɾ��ָ��λ���ϵ�Ԫ�ز����䷵��
		 */
		String old = list.remove(1);
		System.out.println("ɾ��Ԫ�غ��list��"+list);
		System.out.println("��ɾ����Ԫ�أ�"+old);
		
		
	}
}
