package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK1.5֮���Ƴ�һ�������ԣ�
 * ��ǿ��forѭ����Ҳ�� ��ѭ����for each
 * ֻ���ڱ�������ͼ��ϣ��ʲ���ȫ����ȡ����ͳforѭ���Ĺ���
 * @author Administrator
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {
		
		String[] ary = {"one","two","three","four"};
		
		for(int i=0;i<ary.length;i++){
			String str = ary[i];
			System.out.println(str);
		}
		
		for(String str:ary){
			System.out.println(str);
		}
		
		//��������
		/*
		 * ��ѭ���������﷨��JVM�����Ͽ���ѭ�������Ǳ�����
		 * �������ڱ���ʱ��������ʹ������ѭ���ı�������ʱ���Ὣ�����Զ���Ϊ������
		 * ������ѭ���������ǵ�������������ʹ����ѭ��ʱ��Ҳ��Ҫͨ�����ϵķ�����ɾԪ��
		 */
		System.out.println("--------��������----------");
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
		
		
	}
}
