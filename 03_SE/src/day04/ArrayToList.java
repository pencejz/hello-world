package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����תList����
 * �����пɺ����ظ�Ԫ�أ���ֻ��ת��ΪList����
 * ����ת���ļ��ϲ�������ɾ����
 * �Լ���Ԫ�ص��޸ģ������޸�ԭ�����Ӧ��Ԫ��
 * @author Administrator
 *
 */
public class ArrayToList {

	public static void main(String[] args) {
		String[] ary = {"one","two","three","four"};
		List<String> list = Arrays.asList(ary);
		System.out.println(list);
		//�Լ���Ԫ�ص��޸ģ������޸�ԭ�����Ӧ��Ԫ��
		list.set(1, "2");
		System.out.println(list);
		for(String str : ary){
			System.out.println(str);
		}
		/*
		 * ���ܶԼ��������Ԫ�أ���Ϊ���������������ת�����ģ��Լ��ϵĲ������Ƕ�ԭ����Ĳ���
		 * ��ô�����Ԫ�ؾͻᵼ���������ݣ��ǾͲ��ܱ�ʾԭ���飬���Բ�֧�ָò���
		 */
		//list.add("five"); //�׳��쳣��UnsupportedOperationException();
		/**
		 * ���������ת���ļ��Ͻ������Ԫ�ز���
		 * ��ôֻ�������ڴ���һ�����ϣ�Ȼ��Ѱ���ԭ����Ԫ�أ����ܼ�������
		 * 
		 * ���еļ��϶�֧��һ������Collection�����Ĺ��췽��
		 * �����ڴ�����ǰ���ϵ�ͬʱ�����������е�����Ԫ�ذ�������
		 * ���ֹ��췽��Ҳ�������ƹ��취
		 */
		List<String> list1 = new ArrayList<String>(list);
		list1.add("five");
		System.out.println(list1);
		
		
		
		
	}
}
