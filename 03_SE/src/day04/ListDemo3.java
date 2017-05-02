package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * subList
 * 截取List集合
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
		 * 截取子集
		 * [start,end)含前不含后
		 */
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);
		//将子集扩大10倍
		for(int i=0;i<subList.size();i++){
			int d = subList.get(i)*10;
			subList.set(i, d);
		}
		System.out.println(subList);
		/**
		 * 对子集的操作就是对原集合中对应元素进行操作
		 */
		System.out.println(list);
		//删除2-8的元素
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
		
		
		
	}
}
