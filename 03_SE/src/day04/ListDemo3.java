package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * subList
 * ��ȡList����
 * 
 * @author Administrator
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * List subList(int startIndex,int endIndex)
		 * ��ȡ�Ӽ�
		 * [start,end)��ǰ������
		 */
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);
		//���Ӽ�����10��
		for(int i=0;i<subList.size();i++){
			int d = subList.get(i)*10;
			subList.set(i, d);
		}
		System.out.println(subList);
		/**
		 * ���Ӽ��Ĳ������Ƕ�ԭ�����ж�ӦԪ�ؽ��в���
		 */
		System.out.println(list);
		//ɾ��2-8��Ԫ��
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
		
		
		
	}
}
