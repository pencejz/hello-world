package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ�����Ӧ����㷺
 * ����Լ�������е�Ԫ������
 * @author Administrator
 *
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		//����Ҫ��ֻ�ܴ���String���͵�ʵ��
		c.add("one");
		c.add("two");
		c.add("three");
		//c.add(new Date()); //����String���뱨��
		
		//��ѭ������ֱ��ʹ��String����Ԫ��
		for(String str:c){
			System.out.println(str);
		}
		//������Ҳ����ָ�����ͣ���������ļ��ϵķ�������һ�¼���
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		
	}
}
