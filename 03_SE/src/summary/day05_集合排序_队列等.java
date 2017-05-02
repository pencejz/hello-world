package summary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class day05_集合排序_队列等 {

	public static void main(String[] args) {
		/**
		 * 集合排序1
		 * static void sort(List list) 工具类Collections提供的静态方法，可以将一个集合中的元素从小到大排序
		 * 仅对List集合排序，因为list集合是有序的
		 */
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100)+1);
		}
		System.out.println("随机集合list = "+list);
		//将list集合元素从小到大排序
		Collections.sort(list);
		System.out.println("排序后的集合list = "+list);
		/**
		 * 集合排序2
		 * 对自定义元素集合排序
		 * sort方法要求集合元素必须实现Comparable接口，并定义表较规则(重写compareTo(参数1)方法/重写compare(参数1，参数2))
		 */
		//自定义集合排序实例1
		List<Point> list1 = new ArrayList<Point>();
		list1.add(new Point(3,5));
		list1.add(new Point(1,4));
		list1.add(new Point(6,7));
		list1.add(new Point(3,9));
		list1.add(new Point(8,5));
		System.out.println("list1 = "+list1);
		/*
		 * 在Point中实现Comparable接口
		 * sort方法虽然可以对集合排序，但也有不足：
		 * 1.要求集合必须实现接口Comparable，这样就对元素产生了侵入性
		 * 2.若元素已经实现了比较的方法，但是该方法比较大小规则不能满足排序需求时会很麻烦
		 */
		Collections.sort(list1);
		System.out.println("排序后的list1 = "+list1);
		
		//自定义集合排序实例2
		List<String> list2 = new ArrayList<String>();
		list2.add("老师");
		list2.add("小泽老师");
		list2.add("范老师");
		list2.add("君");
		System.out.println("list2 = "+list2);
		//匿名内部类实现Comparator接口
		Comparator<String> com = new Comparator<String>(){
			//按字符串长度由小到大排序
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		};
		Collections.sort(list2,com);
		System.out.println("排序后的list2 = "+list2);
		/**
		 * Queue 队列(先进先出，队尾进队首出)
		 * 常用实现类：linkedList链表实现类
		 * boolean offer(E e) 向队尾添加新元素(入队)
		 * E poll() 取出队首元素(出队)，取出后，该元素立即从队列中删除
		 * E peek() 引用队首元素，不会从队列中删除
		 * void size() 查看队列元素个数
		 */
		Queue<String> queue = new LinkedList<String>();
		//队尾添加元素
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println("queue = "+queue);
		//队首出栈
		System.out.println("出队元素为："+queue.poll());
		System.out.println("出队后的queue = "+queue);
		//引用队首元素
		System.out.println("引用队首元素："+queue.peek());
		//查看队列元素个数
		System.out.println("queue队列的元素个数   = "+queue.size());
		//队列遍历时，尽量不要使用for循环
		while(queue.size()>0){
			System.out.println("遍历输出queue元素："+queue.poll());
		}
		/**
		 * 栈(stack)，通过双端队列实现(先进后出)
		 * 双端队列(Deque)：两端都可以进出的队列
		 * void push(E e) 入栈，最后进入的元素在栈顶
		 * E pop() 出栈，获取栈顶元素，获取后该元素即从栈中被删除
		 * E peek() 栈同样支持栈首元素的引用，饮用后该元素不会被删除
		 * void size() 查看栈中的元素个数
		 */
		Deque<String> stack = new LinkedList<String>();
		//入栈
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println("stack = "+stack);
		//栈顶出栈
		System.out.println("出栈元素："+stack.pop());
		System.out.println("出栈后的stack = "+stack);
		/**
		 * Map类：查找表，以key-value对的形式存储元素
		 * Map的常用实现类hashMap(散列表)
		 * Map要求key不允许重复，判断重复的方法时通过key的equals方法来判断的
		 * V put(K key,V value) 向Map中存入一组键值对
		 *                      若存入的这组键值对中的key已经存在，则是执行替换value操作，返回值则是被提供的value
		 *                      若不是重复的key，那么返回值为null
		 * V get(K key) 根据给定key，获得对应的value值
		 *              若key不存在，则返回null
		 * boolean containsKey(K key) 查看map中是否包含给定key
		 * boolean containsValue(V value) 查看map中是否包含给定的value
		 * 
		 * 遍历map的三种方式：
		 * 1.遍历key：keySet()
		 * 2.遍历key-value键值对:entrySet()
		 * 3.遍历value:values()
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		//正常输出
//		Integer value = map.put("语文", 99);
//		System.out.println(value); //null
//		//出现空指针异常
//		int i = map.put("语文", 99);
//		System.out.println(map.put("语文", 99)); //null
		
		map.put("语文", 99);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 94);
		System.out.println("Map = "+map);
		
		System.out.println("语文的value值为："+map.get("语文"));
		System.out.println(map.containsKey("化学"));
		System.out.println(map.containsValue(96));
		
		System.out.println("遍历key：");
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("遍历key-value键值对：");
		Set<Entry<String,Integer>> entry = map.entrySet();
		for(Entry<String,Integer> en:entry){
			String key=en.getKey();
			Integer value=en.getValue();
			System.out.println(key+"="+value);
		}
		
		System.out.println("遍历vlaue：");
		Collection<Integer> values = map.values();
		for(Integer value:values){
			System.out.println("value="+value);
		}
		
	}//main
}

//Point类用于测试集合排序2
class Point implements Comparable<Point>{
	private int x;
	private int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	/*
	 * 当前方法的作用是使当前对象(调用方法的对象)与方法参数对象比较大小
	 * 返回值不关注具体值，只关注范围：
	 * 返回值>0  当前对象比参数对象大
	 * 返回值==0  相等
	 * 返回值<0  当前对象比参数对象小
	 */
	//点到原点的距离越大值就越大
	@Override
	public int compareTo(Point p) {
		int len = this.x*this.x + this.y*this.y;
		int plen = p.x*p.x + p.y*p.y;
		return len-plen;
	}
}