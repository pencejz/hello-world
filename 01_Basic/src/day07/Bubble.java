package day07;
//ð������
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		/**
		 * ð�������㷨
		 */
		//�û�����10��0~100֮����������浽������
		Scanner scan = new Scanner(System.in);
		int[] bubbles = new int[10];
		System.out.println("������10��0~100֮���������ÿ����֮���ÿո������");
		for(int i=0;i<bubbles.length;i++){
			bubbles[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("�����������Ϊ��  "+Arrays.toString(bubbles));
		//ð������
		System.out.println("----------ð������ʼ------------");
		for(int i=0;i<bubbles.length-1;i++){
			/*
			 * i��ʾ�ܵ��ִ�
			 * ��n������Ҫ�����Ҫ�Ƚ�(n-1)��
			 * ÿһ�ֻ�ȷ��һ�����ֵ
			 * ÿȷ��һ��ֵ����һ�ֱȽ��У��Ƚϴ���j��ֵ�ͻ����1
			 */
			for(int j=0;j<bubbles.length-1-i;j++){ //j��ʾÿ���ִαȽϵĴ���
				if(bubbles[j]>bubbles[j+1]){
					int max = bubbles[j+1];
					bubbles[j+1] = bubbles[j];
					bubbles[j] = max;
				}
			}
			System.out.println("��"+(i+1)+"��������Ϊ�� "+Arrays.toString(bubbles));
		}
		System.out.println("----------ð���������------------");
		System.out.println("����������Ϊ�� "+Arrays.toString(bubbles));
		
		
		/**
		 * JDk�ṩ��������������㷨��sort()����---�������򲢱���
		 * ����������Խ
		 */		
		//ϵͳ�������10��0~100��������������浽����ksort��
		int[] ksort = new int[10];
		Random r = new Random();
		for(int i=0;i<ksort.length;i++){
			ksort[i] = r.nextInt(100)+1;
		}
		System.out.println("ksort= "+Arrays.toString(ksort));
		Arrays.sort(ksort);
		System.out.println("��������֮�������Ϊ�� "+Arrays.toString(ksort));
		
	}//main
	
}//class

/**
 * ���鹤����Arrays�г��÷���
 * 1.Arrays.toString()---�������
 * 2.Arrays.copyOf()---�������鸱��(���Ըı����鳤��)
 * 3.System.arraycopy()---��������
 * 4.Arrays.fill()---��һ��ֵ��ʼ������
 */
















