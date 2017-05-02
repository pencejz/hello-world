package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中应用最广泛
 * 用来约束集合中的元素类型
 * @author Administrator
 *
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		//泛型要求只能传入String类型的实例
		c.add("one");
		c.add("two");
		c.add("three");
		//c.add(new Date()); //不是String编译报错
		
		//新循环可以直接使用String接收元素
		for(String str:c){
			System.out.println(str);
		}
		//迭代器也可以指定泛型，与其遍历的集合的泛型类型一致即可
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		
	}
}
