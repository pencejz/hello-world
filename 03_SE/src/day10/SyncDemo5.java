package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ������ת��Ϊ�̰߳�ȫ��
 * @author sss
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		
		/**
		 * List����ʵ���ࣺ
		 * ArrayList��LinkedList�������̰߳�ȫ��
		 * ����ʹ�ü��Ϲ�����Collections�ṩ�ķ�����������List����ת��Ϊ�̰߳�ȫ��
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list��"+list);
		/**
		 * ��������List����ת��Ϊ�̰߳�ȫ�ģ����ص���һ���̰߳�ȫ�ļ��ϲ��һ�����ԭ�������е�����Ԫ��
		 */
		list = Collections.synchronizedList(list);
		System.out.println("�̰߳�ȫ��list��"+list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println("set��"+set);
		/**
		 * Set���ϵĳ���ʵ����ΪHashSet�����������̰߳�ȫ�ģ����ڶ��̵߳������ʹ����Ҫת��
		 */
		set = Collections.synchronizedSet(set);
		System.out.println("�̰߳�ȫ��set��"+set);
		
		/**
		 * HashMapҲ�����̰߳�ȫ�ģ���ϣ��ʹ���̰߳�ȫ�ģ�����ʹ��Collections����ת��
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		System.out.println("map��"+map);
		/**
		 * Integer remove(key)
		 * Map��remove�����ǽ�������key����Ӧ��key-value�Դ�Map��ɾ��������ֵΪ���key��Ӧ��value
		 */
		Integer value = map.remove("����");
		System.out.println(map);
		System.out.println("��ɾ����value��"+value);
		
		map = Collections.synchronizedMap(map);
		System.out.println("�̰߳�ȫ��map��"+map);
		
		
		
	} //mian
	
}








