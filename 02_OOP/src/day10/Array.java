package day10;

import java.util.Arrays;

//����Ҳ��һ������
public class Array {

	public static void main(String[] args) {
		/**
		 * �����Ƕ���
		 * ����������������ͱ���
		 * �����������
		 * java�ϸ������Ͻ�û�ж�ά���飬���԰�ÿһ��Ԫ�س�Ϊ�����һά����
		 */
		int[] ary = new int[5];
		System.out.println("ary[0] = "+ary[0]);
		ary = null;
		System.out.println("ary = "+ary); //null
		//ary[0] = 0; //��ָ���쳣
		//int n = ary.length; //��ָ���쳣
		
		//�������ͱ���ary�����ٴ������������
		ary = new int[3];
		ary[0] = 10;
		System.out.println("ary[0] = "+ary[0]); //10
		//���ݸ������飺�������������
		ary = Arrays.copyOf(ary, ary.length+1);
		System.out.println("ary.length = "+ary.length); //4
		//�����ñ�������ͬһ���������
		int[] ary1 = ary;
		ary[1] = 5;
		System.out.println("ary1[1] = "+ary1[1]); //5
		
		//��ά����
		System.out.println("----------��ά����----------");
		int[][] arr =new int[3][];
		System.out.println("ary[0] = "+arr[0]); //null
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		System.out.println("ary[0][0] = "+arr[0][0]); //0
		arr[1][1] = 100;
		System.out.println("ary[1][1] = "+arr[1][1]); //100
	}

}
