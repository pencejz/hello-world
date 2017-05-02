package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map�����ұ�
 * ��key-value�Ե���ʽ�洢Ԫ��
 * MapҪ��key�������ظ����ظ�������key��equals�������ж���
 * ����ʵ���ࣺHashMap(ɢ�б�)
 * @author Administrator
 *
 */
public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/**
		 * V put(K key,V value)
		 * ��Map�д���һ���ֵ��
		 * ����Map���������ظ���key
		 * ������������ֵ���е�key�����ڣ������滻value����������ֵ���Ǳ��ṩ��value
		 * �������ظ���key����ô����ֵΪnull
		 */
		Integer value = map.put("����", 99);
		System.out.println(value);
//		int i = map.put("����", 99); //���ֿ�ָ���쳣
//		System.out.println(map.put("����", 99)); //null
		map.put("����", 99);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 94);
		System.out.println("Map = "+map);
		/*
		 * ʹ��map���е�key������value�������滻value�Ĳ���
		 * ����ȡput�����ķ���ֵ����Ҫע��
		 * ��value�ǰ�װ�࣬��ô��һ��Ҫ�ð�װ�������գ�����Ҫʹ�û������ͽ��գ������Զ�����
		 * ��Ϊ������ֵΪnull���Զ�����������ָ���쳣
		 */
		Integer num = map.put("����", 100);
		System.out.println("num = "+num);
		System.out.println("Map = "+map);
		/*
		 * V get(K k)
		 * ���ݸ�����key����ȡ��Ӧ��valueֵ
		 * ��������key��map�в����ڣ��򷵻�null
		 */
		num = map.get("��ѧ");
		System.out.println("��ѧ = "+num);
		System.out.println("���� = "+map.get("����"));
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 * �鿴map�Ƿ����������key��value
		 */
		boolean bk = map.containsKey("����");
		System.out.println("�Ƿ�������ģ�"+bk);
		System.out.println("�Ƿ���200�֣�"+map.containsValue(200));
		System.out.println("�Ƿ����������"+map.containsKey("����"));
		
	}
}
