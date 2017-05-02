package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1.����һ������c1�����Ԫ�ء�one��,��two��,��three��
		 *   �ڴ���һ������c2�����Ԫ�ء�four��,��five��,��six��
		 *   ��c2��Ԫ��ȫ������c1
		 *   ��������c3�����Ԫ�ء�one������five��
		 *   �������c1�Ƿ��������c3����Ԫ��
		 *   ɾ��c1�е�Ԫ��two�������c1
		 */
		//test1();
		/**
		 * ����һ�����ϴ��Ԫ�ء�1������#������2������#������3������#������4��
		 * ʹ�õ�����(Iterator)�������ϣ����ڵ���������ɾ����#��
		 * ʹ����ѭ���������ÿһ��Ԫ��
		 */
		//taet2();
		/**
		 * ����һ��List����,���Ԫ�ء�one��,��two��,��three������four��
		 * ��ȡ���ϵ�2��Ԫ�����
		 * �����ϵ�3��Ԫ������Ϊ��3��
		 * �ڼ��ϵ�2��λ�ò���Ԫ�ء�2��
		 */
		//test3();
		
		
		
		
	}
	
	public static void test3() {
		//����һ��List����,���Ԫ�ء�one��,��two��,��three������four��
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list = "+list);
		//��ȡ���ϵ�2��Ԫ�����
		String str = list.get(1);
		System.out.println(str);
		//�����ϵ�3��Ԫ������Ϊ��3��
		list.set(2, "3");
		System.out.println(list);
		//�ڼ��ϵ�2��λ�ò���Ԫ�ء�2��
		list.add(1, "2");
		System.out.println(list);
		
	}

	public static void taet2() {
		//����һ�����ϴ��Ԫ�ء�1������#������2������#������3������#������4��
		Collection<String> c1 = new ArrayList<String>();
		c1.add("1");
		c1.add("#");
		c1.add("2");
		c1.add("#");
		c1.add("3");
		c1.add("#");
		c1.add("4");
		System.out.println("c1 = "+c1);
		//ʹ�õ�����(Iterator)�������ϣ����ڵ���������ɾ����#��
		Iterator it = c1.iterator();
		while(it.hasNext()){ //��
			String str = (String)it.next(); //ȡ
			System.out.println(str);
			if("#".equals(str)){
				it.remove(); //ɾ
			}
		}
		System.out.println(c1);
		//ʹ����ѭ���������ÿһ��Ԫ��
		for(String str : c1){
			System.out.println("��ѭ�����������"+str);
		}
		
		
		
		
		
	}

	public static void test1(){
		//��������c1
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		System.out.println("c1 = "+c1);
		//��������c2
		Collection<String> c2 = new ArrayList<String>();
		c2.add("four");
		c2.add("five");
		c2.add("six");
		System.out.println("c2 = "+c2);
		//��c2ȫ������c1
		c1.addAll(c2);
		System.out.println("��c2����c1 = "+c1);
		//��������c3
		Collection<String> c3 = new ArrayList<String>();
		c3.add("one");
		c3.add("five");
		System.out.println("c3 = "+c3);
		//�ж�c1�Ƿ����c3������Ԫ��
		boolean contains = c1.containsAll(c3);
		System.out.println("c1�Ƿ����c3��"+contains);
		//ɾ��c1�е�two�����c1
		boolean b = c1.remove("two");
		System.out.println("�Ƿ�ɾ��c1�е�two��"+b);
		System.out.println("c1 = "+c1);
		
		
	}
}
