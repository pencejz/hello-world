package summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class day04_���� {

	public static void main(String[] args) {
		
		/**
		 * Collection��
		 * boolean remove() ɾ��Ԫ��
		 * boolean addAll(Collection c) ������cȫ����ӵ���ǰ���ϵ�ǰ��
		 * boolean containsAll(Collection c) �жϵ�ǰ�����Ƿ��������c�е�����Ԫ��
		 * boolean removeAll(Collection c) ɾ������
		 * ������   boolean hasNext() �жϼ����Ƿ���Ԫ�ؿ��Ա�ȡ��
		 *      E next() ȡ����ǰԪ��
		 */
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		System.out.println("c1 = "+c1);
		//ɾ��Ԫ��
		System.out.println("ɾ�����c1 = "+c1.remove("two"));
		
		Collection<String> c2 = new ArrayList<String>();
		c2.add("java");
		c2.add("c++");
		c2.add("android");
		System.out.println("c2 = "+c2);
		//�Ѽ���c1��ӵ�����c2��
		System.out.println("c2=c1+c2 = "+c2.addAll(c1));
		//�ж�c1�ǲ���ȫ������c2��
		System.out.println("c2�Ƿ����c1�е�����Ԫ�أ�"+c2.containsAll(c1));
		//ɾ������
		System.out.println("c2=c2-c1 = "+c2.removeAll(c1));
		
		Collection<String> c3 = new ArrayList<String>();
		c3.add("one");
		c3.add("#");
		c3.add("two");
		c3.add("#");
		c3.add("three");
		c3.add("#");
		c3.add("four");
		System.out.println("c3 = "+c3);
		//������
		Iterator<String> it = c3.iterator();
		while(it.hasNext()){ //�жϼ����Ƿ���Ԫ�ؿ��Ա�ȡ��
			String str = (String)it.next(); //ȡ����ǰԪ��
			System.out.println("�������ϵĽ����"+str);
			if("#".equals(str)){
				it.remove();
			}
		}
		System.out.println("ɾ��Ԫ�غ��c3 = "+c3);
		/**
		 * ��ѭ��
		 * ���ڱ�������ͼ���
		 * ��ѭ������ײ�ԭ����ǵ�����
		 * ��ѭ���п���ֱ��ʹ��Ԫ�����������ձ����Ľ��
		 * ������Ҳ����ָ�����ͣ�ֻҪ������ļ�������һ�¼���
		 */
		for(Object each : c3){
			String str = (String)each;
			System.out.println("��ѭ�����������"+str);
		}
		/**
		 * ����������Ļ�ת
		 * Object[] toArray() ����ת����һ(�޲�)
		 * arr[] toArray(new arr[int n]) ����ת�������(�в�)
		 * Arrays.asList(arr[] arr) ����ת���ɼ���
		 */
		Collection<String> c4 = new ArrayList<String>();
		c4.add("����");
		c4.add("����");
		c4.add("����");
		System.out.println("����c4 = "+c4);
		//����ת����
//		Object[] str = new String[c4.size()];
//		str = c4.toArray();//�޲�
		String[] str = c4.toArray(new String[c4.size()]);//�в�
		System.out.println("����ת����str = "+Arrays.toString(str));//ֱ�����һ������ķ���
		//����ת����
		String[] ary = {"one","two","three","four"};
		List<String> list = Arrays.asList(ary);
		System.out.println("����ת����list = "+list);
		//�Լ���Ԫ�ص��޸ģ������޸�ԭ�����Ӧ��Ԫ��
		list.set(1, "2");//�޸ļ���Ԫ��
		System.out.println("�޸ĺ��list = "+list);
		for(String each : ary){
			System.out.println("��������Ԫ�أ�"+each);
		}		
		/*
		 * ���ܶԼ��������Ԫ�أ���Ϊ���������������ת�����ģ��Լ��ϵĲ������Ƕ�ԭ����Ĳ���
		 * ��ô�����Ԫ�ؾͻᵼ���������ݣ��ǾͲ��ܱ�ʾԭ���飬���Բ�֧�ָò���
		 * ���������ת���ļ��Ͻ������Ԫ�ز�����ֻ�������ڴ���һ�����ϣ�Ȼ�����ԭ����Ԫ��
		 * 
		 * ���еļ��϶�֧��һ������Collection�����Ĺ��췽�������ڴ�����ǰ���ϵ�ͬʱ�����������е�����Ԫ�ذ�������
		 * ���ֹ��췽��Ҳ�������ƹ��취
		 */
		//list.add("five"); //�׳��쳣��UnsupportedOperationException();
		list = new ArrayList<String>(list); //ԭlist���϶���ʧȥ���ý��ᱻGC����
		list.add("five");
		System.out.println(list);		
		/**
		 * List����
		 * ����ʵ���� �� ArrayList ����ʵ�֣���ѯ��
		 *          LinkedLIst ����ʵ�֣���ɾ��
		 * E get(int index) ��ȡ�����±��Ӧ��Ԫ��
		 * E set(int index) ������Ԫ����ӵ�ָ��λ��
		 * void add(int index,E e) ��ָ��λ�ò���ָ��Ԫ��
		 * E remove(int index) ɾ��ָ��λ�õ�Ԫ�أ������ر�ɾ����Ԫ��
		 * List subList(int startIndex,int endList) ��ȡ�Ӽ�
		 */
		List<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		System.out.println("list1 = "+list1);
		//��ȡ�±�Ϊ2��Ԫ��
		System.out.println("�±�Ϊ2��Ԫ�أ�"+list1.get(2));
		//���±�Ϊ1��Ԫ���滻Ϊ2
		System.out.println("���滻��Ԫ��Ϊ��"+list1.set(1, "2"));
		//��3��λ�����Ԫ��3
		System.out.println("�滻���list1 = "+list1);		
		list1.add(3,"4");
		System.out.println("��Ӻ��list1 = "+list1);
		//ɾ���±�Ϊ5��Ԫ��
		System.out.println("��ɾ����Ԫ��Ϊ��"+list1.remove(2));
		System.out.println("ɾ�����list1 = "+list1);
		//��ȡ�±�Ϊ2��3��Ԫ��
		List<String> subList = list1.subList(1, 3);
		System.out.println(subList);
		//���Ӽ�����10��
		for(int i=0;i<subList.size();i++){
			int d = Integer.parseInt(subList.get(i))*10;
			String str1 = String.valueOf(d);
			subList.set(i, str1);
		}
		System.out.println("������subList = "+subList);
		System.out.println("�Ӽ�������list1 = "+list1); //���Ӽ��Ĳ������Ƕ�ԭ�����ж�ӦԪ�ؽ��в���
		//����subListɾ�����������Ԫ��
		list1.subList(1, 3).clear();
		System.out.println("ɾ��Ԫ�غ��list1 = "+list1);
		
	}//main
	
}










