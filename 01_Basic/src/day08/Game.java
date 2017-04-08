package day08;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("====================��ӭ��������ĸ��Ϸ====================");
		System.out.println(
				"��Ϸ����\n" 
						+ "1����Ϸ�е���ĸ��Ϊ��д��ĸ��\n" 
						+ "2����ĸ��λ����������ɵ���ĸλ��һһ��Ӧ������ȷ��\n" 
						+ "3����Ϸ�ܷ�1000�֣�ÿ��1�ο۳�10�֣�����Ϊ0���˳���Ϸ��\n"
						+ "4����Ϸ����ĸ�������û�ѡ��\n" 
						+ "5������EXIT0�˳���Ϸ��\n\n" 
						+ "----------��Ϸ��ʼ��Ready��Go��----------\n");
		System.out.print("������Ҫ�²����ĸ���ȣ�");
		int count = scan.nextInt(); // �Զ�����ĸ�ĸ���
		scan.nextLine(); // ��nextInt()�������Ļس���(�û���һ��������ɺ�Ļس���)���գ��Ա�֤����nextLine()��������������
		int score = 1000; // �ܷ�
		int chs, loc; // �����¶���ĸ�ĸ������¶�λ�õ���ĸ����
		char[] answer = generate(count); // �����������������
		//System.out.println(answer); //ϵͳ������ɵ���ĸ
		do {
			System.out.println("������" + count + "����ĸ��");
			String s = scan.nextLine();
			//����û�����EXIT0����exit0�˳���Ϸ
			if(s.equals("EXIT0")||s.equals("exit0")){
				System.out.println("----------�˳���Ϸ����ӭ�´μ���----------");
				break;
			}
			char[] input = s.toCharArray();
			int[] var = check(answer, input);	// ���ñȽϷ���������chs��loc��Ϣ������check
			chs = var[0];
			loc = var[1];
			System.out.println("��¶���" + chs + "����ĸ������" + loc + "���ַ�λ����ȷ��");
			score -= 10;
			if (score == 0) {
				System.out.println("��̫��ˣ�IQ�д�������");
				break;
			}
			if (chs == count && loc == count) {
				System.out.println("���񣡹�ϲ�㣡�¶��ˣ���ĵ÷֣�" + score);
			}
		} while (chs != count || loc != count);
		scan.close();	//�ر����

	}

	// ���������ĸ����
	public static char[] generate(int n) {
		//����һ����26����д��ĸ�ŵ�һ���������棬Ȼ������������������������±꣩��ͨ�������õ������ĸ
		//���������������26����д��ĸ����Ӧ��int�����֣�65~90��,��ת������ĸ����
		char[] allLetters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] isRep = new boolean[allLetters.length];	//����һ��boolean�����飬��allLetters����һ�£�����Ԫ��Ĭ��Ϊfalse
		char[] letter = new char[n];	//�����������������ɵ�n����ĸ
		int temp;	//���������������±꣩
		for (int i = 0; i < letter.length; i++) {
			do {
				Random ran=new Random();
				temp=ran.nextInt(allLetters.length);	//�������������һ��allLetters�����±�0~25��
				//temp = (int) (Math.random() * allLetters.length); // ���������������
				letter[i] = allLetters[temp];	//��allLetters�������±�Ϊtemp��Ԫ�ظ�ֵ��letter����������Ϊi��Ԫ��
			} while (isRep[temp]);	
			isRep[temp] = true;	//letterÿһ�θ�ֵ��ɺ󣬽���allLetters�����±��Ӧ��isRep�����±�����Ӧ��Ԫ��ֵ��Ϊtrue
		}
		return letter;
	}

	// �Ƚ�ϵͳ���ɵ���ĸ���û��������ĸ
	public static int[] check(char[] answer, char[] input) {
		int[] result = new int[2];
		int m = 0, n = 0;
		// �����������Ƚ�������ĸ��������ͬ��ĸ���������result����ĵ�һ��λ��
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (answer[i] == input[j]) {
					m++;
				}
			}
		}
		result[0] = m;
		// ����λ�ã��Ƚ�������ĸ��������ͬ��ĸ���������result����ĵڶ���λ��
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				n++;
			}
		}
		result[1] = n;
		return result;
	}
}
