package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת����
 * Collection�ṩ��ת��Ϊ����ķ����������κμ��϶�����ת��Ϊ����
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
