package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1.���ȫ���Ŀ��ð���
		 * 2.����10����ί�Ĵ�ֲ��洢��scores�����жԸ��������ͳ��
		 * 	   ȥ����߷ֺ���ͷ֣����ݣ�
		 * 	   ����ƽ���ֲ����ڣ����ݺ����һλ
		 */
		//average();
		
		/**
		 * �ҳ���2��ĳ�����ķ�Χ�ڵ����������������
		 * Ҫ����������ÿ�����10����
		 */
		//prime();
		
	}//main
	
	public static void average(){
		System.out.println("��ѡ������Ĳ�����ʽ��");
		System.out.println("\t1.ϵͳ�������10��0~100�����������");
		System.out.println("\t2.�û��������10��0~100��������");
		System.out.print("��ѡ��1����2�� ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] scores = new int[10];
		if(n==1){
			//ϵͳ�������10��0~100������������浽����scores��
			Random r = new Random();
			for(int i=0;i<scores.length;i++){
				scores[i] = r.nextInt(100)+1;
				//scores[i] = (int)Math.random()*100+1;
			}
		}else if(n==2){
			//�û�����10��������Ϊһ������
			System.out.println("������10������ÿ����֮���Կո������");
			for(int i=0;i<scores.length;i++){
				scores[i] = scan.nextInt();
			}
		}
		scan.close();
		//��ʾscores����
		System.out.println("scores = "+Arrays.toString(scores));
		//����߷ֱ��浽��������һ��
		for(int i=0;i<=scores.length-2;i++){
			if(scores[i]>scores[scores.length-1]){
				int max = scores[scores.length-1];
				scores[scores.length-1] = scores[i];
				scores[i] = max;
			}
		}
		//ͨ����������ݣ�ȥ����߷�
		scores = Arrays.copyOf(scores, 9);
		System.out.println("ȥ����߷ֺ�scores= "+Arrays.toString(scores));
		//����ͷֱ��浽�������һ��Ԫ��
		for(int i=0;i<=scores.length-2;i++){
			if(scores[i]<scores[scores.length-1]){
				int lit = scores[scores.length-1];
				scores[scores.length-1] = scores[i];
				scores[i] = lit;
			}
		}
		//ͨ���������ݣ�ȥ����ͷ�
		scores = Arrays.copyOf(scores, scores.length-1);
		System.out.println("ȥ����ͷֺ�scores= "+Arrays.toString(scores));
		//����ƽ����
		int sum = 0;
		for(int i=0;i<scores.length;i++){
			sum += scores[i];
		}
		int ave = sum/scores.length;
		//ͨ���������ݱ��浽scoresĩβ
		scores = Arrays.copyOf(scores, scores.length+1);
		scores[scores.length-1] = ave;
		System.out.println("ĩβ�����ƽ���ֵ�scores= "+Arrays.toString(scores));
		
	}//Average����
	
	public static void prime(){
		//����һ����
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ����С��2������");
		int input = scan.nextInt();
		if(input<2){
			System.out.println("����������ݲ��Ϸ�������������һ����С��2������");
			input = scan.nextInt();
		}
		scan.close();
		//�ҳ����е�����
		int[] primes = new int[1]; //��������������
		for(int i=2;i<=input;i++){ //i��ʾ������
			
			for(int j=2;j<=i;j++){ //j��ʾ����
				
				if(i%j!=0){
					Arrays.copyOf(primes, primes.length+1);
					primes[primes.length-1] = i;
				}
			}
		}
		//�������
		for(int i=0;i<primes.length;i++){ //i��ʾ�����±�
			System.out.print(primes[i]+"\t");
			if(i%9==0){
				System.out.println();
			}
		}
		
	}//Prime����
	
}//class
