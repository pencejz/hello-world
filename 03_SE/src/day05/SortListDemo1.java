package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���򼯺�
 * ����ʹ�ù�����Collections�ľ�̬������static void sort(List list)
 * ���д�С�������Ȼ����
 * 
 * ������List��������(����)����Ϊ�󲿷�Set����ʵ��ʱ�����
 * @author Administrator
 *
 */
public class SortListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		//��С��������
		Collections.sort(list);
		System.out.println(list);
		
	}
}