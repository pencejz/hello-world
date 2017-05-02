package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map
 * 3种方式：
 * 遍历所有的key：keySet()
 * 遍历所有的key-value对：entrySet()
 * 遍历所有的value：values()---不常用
 * @author Administrator
 *
 */
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		//Map<String,Integer> map = new LinkedHashMap<String,Integer>(); //有序
		
		map.put("语文", 99);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 94);
		System.out.println("Map = "+map);
		/**
		 * 遍历所有的key
		 * Set keySet()
		 * 先将当前Map中所有的key存入一个Set集合后返回，那么遍历这个集合就相当于遍历了所有的key
		 */
		Set<String> keySet = map.keySet();
		//遍历key
		for(String key : keySet){ //取出key
			//通过key，取出value---通常不会使用这种方法来获取value
			Integer value = map.get(key);
			System.out.println(key+": "+value);
		}
		/**
		 * 遍历每一组键值对
		 * Set<Entry> entrySet()
		 * Entry是Map的内部类
		 * Map中每一组键值对都是有一个Entry类的实例保存的
		 * Entry有两个常用的方法：getKey、getValue---分别获得这组键值对的key、value
		 * entrySet就是将当前Map中的每一组键值对(若干的Entry实例)存入一个Set集合然后返回
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		//遍历键值对
		for(Entry<String,Integer> e : entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+"="+value);
		}
		/**
		 * 遍历所有的value
		 * Collection values()
		 * 将当前Map中所有的value存入一个集合后返回
		 * value值是可以重复的
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value: "+value);
		}
		
		
		
		
	}
}
