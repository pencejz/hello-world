package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转数组
 * Collection提供了转换为数组的方法，所以任何集合都可以转换为数组
 * @author Administrator
 *
 */
public class CollectionToArray {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		String[] ary = c.toArray(new String[c.size()]);
		for(String str:ary){
			System.out.println(str);
		}
		
	}
}
