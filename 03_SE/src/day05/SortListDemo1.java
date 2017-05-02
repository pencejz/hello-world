package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序集合
 * 可以使用工具类Collections的静态方法：static void sort(List list)
 * 进行从小到大的自然排序
 * 
 * 仅仅对List集合排序(有序)，因为大部分Set集合实现时无序的
 * @author Administrator
 *
 */
public class SortListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		//从小到大排序
		Collections.sort(list);
		System.out.println(list);
		
	}
}
