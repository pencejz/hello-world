package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map：查找表
 * 以key-value对的形式存储元素
 * Map要求key不允许重复，重复是依靠key的equals方法来判定的
 * 常用实现类：HashMap(散列表)
 * @author Administrator
 *
 */
public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/**
		 * V put(K key,V value)
		 * 向Map中存入一组键值对
		 * 由于Map不允许存放重复的key
		 * 若存入的这组键值对中的key若存在，则是替换value操作，返回值则是被提供的value
		 * 若不是重复的key，那么返回值为null
		 */
		Integer value = map.put("语文", 99);
		System.out.println(value);
//		int i = map.put("语文", 99); //出现空指针异常
//		System.out.println(map.put("语文", 99)); //null
		map.put("语文", 99);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 94);
		System.out.println("Map = "+map);
		/*
		 * 使用map已有的key。存入value，则是替换value的操作
		 * 若获取put方法的返回值，需要注意
		 * 若value是包装类，那么就一定要用包装类来接收，而不要使用基本类型接收，避免自动拆箱
		 * 因为若返回值为null，自动拆箱会引起空指针异常
		 */
		Integer num = map.put("语文", 100);
		System.out.println("num = "+num);
		System.out.println("Map = "+map);
		/*
		 * V get(K k)
		 * 根据给定的key，获取对应的value值
		 * 若给定的key在map中不存在，则返回null
		 */
		num = map.get("数学");
		System.out.println("数学 = "+num);
		System.out.println("体育 = "+map.get("体育"));
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 * 查看map是否包含给定的key、value
		 */
		boolean bk = map.containsKey("语文");
		System.out.println("是否包含语文："+bk);
		System.out.println("是否有200分："+map.containsValue(200));
		System.out.println("是否包含体育："+map.containsKey("体育"));
		
	}
}
