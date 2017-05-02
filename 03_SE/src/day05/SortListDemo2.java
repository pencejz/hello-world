package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �������Զ���Ԫ�صļ���
 * @author Administrator
 *
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3,5));
		list.add(new Point(1,4));
		list.add(new Point(6,7));
		list.add(new Point(3,9));
		list.add(new Point(8,5));
		System.out.println(list);
		/**
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڲ�����Ƚϴ�С�Ĺ���
		 * ��Point��ʵ��Comparable�ӿ�
		 * 
		 * sort������Ȼ���ԶԼ������򣬵�Ҳ�в��㣺
		 * 1.Ҫ�󼯺ϱ���ʵ�ֽӿ�Comparable�������Ͷ�Ԫ�ز�����������
		 * 2.��Ԫ���Ѿ�ʵ���˱Ƚϵķ��������Ǹ÷����Ƚϴ�С������������������ʱ����鷳
		 */
		Collections.sort(list);
		System.out.println(list);
		
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("����ʦ");
		list1.add("С����ʦ");
		list1.add("����ʦ");
		list1.add("�����");
		System.out.println(list1);
		
		Comparator<String> comm = new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		};
		Collections.sort(list1,comm);
		System.out.println(list1);
		
		
		
		
	}
}
