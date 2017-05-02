package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素方法
 * Iterator iterator()
 * 该方法会返回一个用于遍历当前集合的迭代器
 * Iterator是一个接口，定义了遍历集合元素的相关方法，不同集合有其自身的实现类
 * 我们无需记住迭代器具体的实现类，只需将其当做借口看待，直接调用其中的遍历方法即可
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
		 * 迭代器遍历集合应当遵循：问---取---删(非必须操作)
		 * boolean hasNext()  判断集合是否还有元素可以被取出
		 * E next()  取出下一个元素
		 * 
		 * 在使用迭代器遍历集合时，不要通过集合自身的方法增删集合元素，否则会抛出异常
		 * 删除可以使用迭代器提供的remove方法，它会删除通过next方法迭代出的元素
		 */
		Iterator it = c.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println("集合遍历结果："+str);
			if("#".equals(str)){
				//c.remove(str); //报错，在迭代器中不要调用集合的方法来进行操作
				it.remove(); //调用迭代器提供的remove方法，直接删除当前next方法迭代出的元素
			}
		}
		System.out.println("c = "+c);
	}
}
