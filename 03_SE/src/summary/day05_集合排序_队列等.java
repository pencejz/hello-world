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

public class day05_��������_���е� {

	public static void main(String[] args) {
		/**
		 * ��������1
		 * static void sort(List list) ������Collections�ṩ�ľ�̬���������Խ�һ�������е�Ԫ�ش�С��������
		 * ����List����������Ϊlist�����������
		 */
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100)+1);
		}
		System.out.println("�������list = "+list);
		//��list����Ԫ�ش�С��������
		Collections.sort(list);
		System.out.println("�����ļ���list = "+list);
		/**
		 * ��������2
		 * ���Զ���Ԫ�ؼ�������
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڣ��������Ϲ���(��дcompareTo(����1)����/��дcompare(����1������2))
		 */
		//�Զ��弯������ʵ��1
		List<Point> list1 = new ArrayList<Point>();
		list1.add(new Point(3,5));
		list1.add(new Point(1,4));
		list1.add(new Point(6,7));
		list1.add(new Point(3,9));
		list1.add(new Point(8,5));
		System.out.println("list1 = "+list1);
		/*
		 * ��Point��ʵ��Comparable�ӿ�
		 * sort������Ȼ���ԶԼ������򣬵�Ҳ�в��㣺
		 * 1.Ҫ�󼯺ϱ���ʵ�ֽӿ�Comparable�������Ͷ�Ԫ�ز�����������
		 * 2.��Ԫ���Ѿ�ʵ���˱Ƚϵķ��������Ǹ÷����Ƚϴ�С������������������ʱ����鷳
		 */
		Collections.sort(list1);
		System.out.println("������list1 = "+list1);
		
		//�Զ��弯������ʵ��2
		List<String> list2 = new ArrayList<String>();
		list2.add("��ʦ");
		list2.add("С����ʦ");
		list2.add("����ʦ");
		list2.add("��");
		System.out.println("list2 = "+list2);
		//�����ڲ���ʵ��Comparator�ӿ�
		Comparator<String> com = new Comparator<String>(){
			//���ַ���������С��������
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		};
		Collections.sort(list2,com);
		System.out.println("������list2 = "+list2);
		/**
		 * Queue ����(�Ƚ��ȳ�����β�����׳�)
		 * ����ʵ���ࣺlinkedList����ʵ����
		 * boolean offer(E e) ���β�����Ԫ��(���)
		 * E poll() ȡ������Ԫ��(����)��ȡ���󣬸�Ԫ�������Ӷ�����ɾ��
		 * E peek() ���ö���Ԫ�أ�����Ӷ�����ɾ��
		 * void size() �鿴����Ԫ�ظ���
		 */
		Queue<String> queue = new LinkedList<String>();
		//��β���Ԫ��
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println("queue = "+queue);
		//���׳�ջ
		System.out.println("����Ԫ��Ϊ��"+queue.poll());
		System.out.println("���Ӻ��queue = "+queue);
		//���ö���Ԫ��
		System.out.println("���ö���Ԫ�أ�"+queue.peek());
		//�鿴����Ԫ�ظ���
		System.out.println("queue���е�Ԫ�ظ���   = "+queue.size());
		//���б���ʱ��������Ҫʹ��forѭ��
		while(queue.size()>0){
			System.out.println("�������queueԪ�أ�"+queue.poll());
		}
		/**
		 * ջ(stack)��ͨ��˫�˶���ʵ��(�Ƚ����)
		 * ˫�˶���(Deque)�����˶����Խ����Ķ���
		 * void push(E e) ��ջ���������Ԫ����ջ��
		 * E pop() ��ջ����ȡջ��Ԫ�أ���ȡ���Ԫ�ؼ���ջ�б�ɾ��
		 * E peek() ջͬ��֧��ջ��Ԫ�ص����ã����ú��Ԫ�ز��ᱻɾ��
		 * void size() �鿴ջ�е�Ԫ�ظ���
		 */
		Deque<String> stack = new LinkedList<String>();
		//��ջ
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println("stack = "+stack);
		//ջ����ջ
		System.out.println("��ջԪ�أ�"+stack.pop());
		System.out.println("��ջ���stack = "+stack);
		/**
		 * Map�ࣺ���ұ���key-value�Ե���ʽ�洢Ԫ��
		 * Map�ĳ���ʵ����hashMap(ɢ�б�)
		 * MapҪ��key�������ظ����ж��ظ��ķ���ʱͨ��key��equals�������жϵ�
		 * V put(K key,V value) ��Map�д���һ���ֵ��
		 *                      ������������ֵ���е�key�Ѿ����ڣ�����ִ���滻value����������ֵ���Ǳ��ṩ��value
		 *                      �������ظ���key����ô����ֵΪnull
		 * V get(K key) ���ݸ���key����ö�Ӧ��valueֵ
		 *              ��key�����ڣ��򷵻�null
		 * boolean containsKey(K key) �鿴map���Ƿ��������key
		 * boolean containsValue(V value) �鿴map���Ƿ����������value
		 * 
		 * ����map�����ַ�ʽ��
		 * 1.����key��keySet()
		 * 2.����key-value��ֵ��:entrySet()
		 * 3.����value:values()
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		//�������
//		Integer value = map.put("����", 99);
//		System.out.println(value); //null
//		//���ֿ�ָ���쳣
//		int i = map.put("����", 99);
//		System.out.println(map.put("����", 99)); //null
		
		map.put("����", 99);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 94);
		System.out.println("Map = "+map);
		
		System.out.println("���ĵ�valueֵΪ��"+map.get("����"));
		System.out.println(map.containsKey("��ѧ"));
		System.out.println(map.containsValue(96));
		
		System.out.println("����key��");
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("����key-value��ֵ�ԣ�");
		Set<Entry<String,Integer>> entry = map.entrySet();
		for(Entry<String,Integer> en:entry){
			String key=en.getKey();
			Integer value=en.getValue();
			System.out.println(key+"="+value);
		}
		
		System.out.println("����vlaue��");
		Collection<Integer> values = map.values();
		for(Integer value:values){
			System.out.println("value="+value);
		}
		
	}//main
}

//Point�����ڲ��Լ�������2
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
	 * ��ǰ������������ʹ��ǰ����(���÷����Ķ���)�뷽����������Ƚϴ�С
	 * ����ֵ����ע����ֵ��ֻ��ע��Χ��
	 * ����ֵ>0  ��ǰ����Ȳ��������
	 * ����ֵ==0  ���
	 * ����ֵ<0  ��ǰ����Ȳ�������С
	 */
	//�㵽ԭ��ľ���Խ��ֵ��Խ��
	@Override
	public int compareTo(Point p) {
		int len = this.x*this.x + this.y*this.y;
		int plen = p.x*p.x + p.y*p.y;
		return len-plen;
	}
}