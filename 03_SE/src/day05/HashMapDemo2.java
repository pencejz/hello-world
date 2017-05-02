package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map
 * 3�ַ�ʽ��
 * �������е�key��keySet()
 * �������е�key-value�ԣ�entrySet()
 * �������е�value��values()---������
 * @author Administrator
 *
 */
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		//Map<String,Integer> map = new LinkedHashMap<String,Integer>(); //����
		
		map.put("����", 99);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 94);
		System.out.println("Map = "+map);
		/**
		 * �������е�key
		 * Set keySet()
		 * �Ƚ���ǰMap�����е�key����һ��Set���Ϻ󷵻أ���ô����������Ͼ��൱�ڱ��������е�key
		 */
		Set<String> keySet = map.keySet();
		//����key
		for(String key : keySet){ //ȡ��key
			//ͨ��key��ȡ��value---ͨ������ʹ�����ַ�������ȡvalue
			Integer value = map.get(key);
			System.out.println(key+": "+value);
		}
		/**
		 * ����ÿһ���ֵ��
		 * Set<Entry> entrySet()
		 * Entry��Map���ڲ���
		 * Map��ÿһ���ֵ�Զ�����һ��Entry���ʵ�������
		 * Entry���������õķ�����getKey��getValue---�ֱ��������ֵ�Ե�key��value
		 * entrySet���ǽ���ǰMap�е�ÿһ���ֵ��(���ɵ�Entryʵ��)����һ��Set����Ȼ�󷵻�
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		//������ֵ��
		for(Entry<String,Integer> e : entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+"="+value);
		}
		/**
		 * �������е�value
		 * Collection values()
		 * ����ǰMap�����е�value����һ�����Ϻ󷵻�
		 * valueֵ�ǿ����ظ���
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value: "+value);
		}
		
		
		
		
	}
}
