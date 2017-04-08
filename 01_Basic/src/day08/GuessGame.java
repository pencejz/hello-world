package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//���ַ���Ϸ
public class GuessGame {
	
	/**
	 * 1.����5�����ظ����ַ�---generate()����
	 * 2.��ȡ�û������һ���ַ�
	 * 3.�´���ظ�ִ��do{}while();ʵ��
	 * 4.����Աȣ�������
	 * 5.�÷ּ��㣬�ܷ�10000���´�һ�ο�10�֣���������0�˳����򣨽�����֣�����������������
	 */
	public static void main(String[] args) {
		//����5�����ظ����ַ�
		char[] answer = generate(5);
		//��ȡ�û������һ���ַ�
		System.out.println("\n�°ɣ�����\n��������²���ַ���");
		Scanner scan = new Scanner(System.in);
		int num = 0,loc = 0,score = 1000; //num��ʾ�¶Եĸ�����loc��ʾ�¶Ե�λ�ø�����score��ʾ�÷�
		do{
			String str = scan.nextLine(); //�����ַ���
			char[] input = str.toCharArray(); //��������ַ���ת��Ϊ�ַ�����
			int[] val = check(input,answer); //����ȽϷ�������
			//��ȡ�����
			num = val[0];
			loc = val[1];
			//����������ʾ�û��Ƿ�����²�
			System.out.println("�������"+num+"���ַ�������"+loc+"��λ����ȷ��");
			//�÷ּ���
			score -= 10;
			if(score==0){
				System.out.println("�´������ɣ�����");
				break;
			}
		}while(num!=5 || loc!=5); //û�в��м���ѭ��
		scan.close();
		System.out.println("��ĵ÷��ǣ�"+score);
	}//main
	
	/**
	 * ��������ַ�����ķ���
	 * @param n ��������ַ��ĸ���
	 * @return n�����ظ��Ĵ�д��ĸ
	 */
	/*
	 * 1.���������Χ����scopeChars
	 * 2.���������index
	 * 3.����randomChar�������������ַ�
	 * 4.����n������ַ�---forѭ��ʵ��
	 * 5.���屣�����������ַ�������randomChars
	 * 6.����boolean��������used---ʵ�ֲ��ظ�������ͬ�ַ�---do{}while();ʵ��
	 */
	public static char[] generate(int n){
		char[] scopeChars = { //���������Χ����scopeChars
				'A','B','C','D','E','F','G','H','I',
				'J','K','L','M','N','O','P','Q','R',
				'S','T','U','V','W','X','Y','Z'};
		Random random = new Random(); 
		char[] randomChars = new char[n]; //���屣�����n������ַ�������
		boolean[] used = new boolean[scopeChars.length]; //����boolean��������used
		for(int i=0;i<n;i++){ //����n������ַ�
			int index; //���������index
			do{ //ʵ�ֲ��ظ�������ͬ���ַ�
				index = random.nextInt(scopeChars.length); //scopeChars.length==26--->index��ΧΪ0~25
			}while(used[index]); //used[index]ֵΪtrueʱ��˵�����ַ��Ѿ���������Ҫ������������ַ��±�index
			//int n = random.nextInt(scopeChars.length); //�˴�n�뷽��generate(int n)��n�ظ�---�����ط���n��Ϊ�ֲ��������������Ϊ��������
			boolean b = used[index];
			
			char randomChar = scopeChars[index]; //����randomChar�������������ַ�
			randomChars[i] = randomChar; //������ַ����浽���������
			used[index] = true; //
		}
		System.out.print("������ɵ��ַ����飺 "+Arrays.toString(randomChars));
		
		return randomChars;
	}
	
	/**
	 * ���û�������ַ�����input��ϵͳ�����ַ�����answer���Ա�
	 * @param input �û�������ַ�����
	 * @param answer ϵͳ���ɵ��ַ�����
	 * @return �����(num,loc)������������num��ʾƥ����ַ��ĸ���
	 *                                loc��ʾ��ͬ�ַ���λ��ƥ��ĸ���
	 */
	public static int[] check(char[] input, char[] answer){
		int num = 0, loc = 0;
		for(int i=0;i<answer.length;i++){
			char an = answer[i];
			for(int j=0;j<input.length;j++){
				char in = input[j];
				if(an==in){ //�ַ���ͬ
					num++;
					if(i==j){ //λ����ͬ
						loc++;
					}
					break; //jѭ������---�ҵ���ͬ�ַ�
				}
			}
		}
		return new int[]{num,loc}; //����ʱ����һ��������
	}
	
}//class




