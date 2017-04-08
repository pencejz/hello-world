package day07;

import java.util.Random;
import java.util.Scanner;

//���ַ���Ϸ
public class GuessChars {
	
	/**
	 * ���ַ���Ϸ
	 * 1.����5�����ظ�������ַ�---����Ϊ����
	 * 2.�ȴ��û�����
	 * 3.���û��������Ϣ��5���ַ���Ƚ�
	 * 4.��ʾ�ȽϵĽ��
	 * 5.����÷�
	 * 6.����Ϊ0 ����
	 * 7.���û�в��з���2
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//����5�����ظ��������д�ַ�
		char[] answer = generate(5);
		System.out.println(answer);
		int chs,loc,score = 1000;
		do{
			System.out.print("�°ɣ�");
			//��ȡ�û��������Ϣ
			String s = scan.nextLine(); //�û�������Ϣ
			char[] input = s.toCharArray(); //�����û�������Ϣ�������浽input������
			//�û������������ϵͳ�����������Ա�
			int[] val = check(input,answer);
			chs = val[0]; //�²���ȷ���ַ�����
			loc = val[1]; //�²���ȷ���ַ��ĸ�����λ�ø���
			System.out.println("��¶���"+chs+"���ַ�������"+loc+"���ַ���λ����ȷ��");
			score -=10;
			if(score==0){
				System.out.println("��Ҫ˼��������������");
				break;
			}
		}while(chs!=5 || loc!=5);
		
		System.out.println("����Ϊ�� "+score);
		scan.close();
		
	}//main
	
	/**
	 * ��������ַ�����answer[]
	 * letters[]Ϊ��Χ����
	 * used[]Ϊ�������飬����ʵ�����ʱ�������ظ����ַ�
	 * indexΪ��������������ַ����±�
	 */
	public static char[] generate(int n){
		char[] answer = new char[n]; //����ϵͳ������ɵ��ַ�������
	    char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' }; //����ַ���Χ--26����д��ĸ
		boolean[] used = new boolean[letters.length]; //usedΪ�������飬Ĭ��ֵΪfalse,��ʾû�б����
	    Random random = new Random();
	    for(int i=0;i<answer.length;i++){ //��������ַ�����
	    	int index;
	    	do{
	    		index = random.nextInt(letters.length); //������������±�
	    	}while(used[index]); //���±��Ӧ��used�����ֵΪtrueʱ����ʾ���ַ��Ѿ����������������index
	    	                     //���±��Ӧ��used�����ֵΪfalseʱ����ʾ���ַ�δ�������ѭ������
	    	answer[i] = letters[index]; //�����±�ȡ��letters�ж�Ӧ���ַ�����ֵ��answer����
	    	used[index] = true;
	    }
	    return answer;
	}
	
	/**����ַ��������û�������ַ��������Ա�
	 * intput---�û�������ַ���
	 * answer---ϵͳ������ɵ��ַ���
	 * chs---�¶Ե��ַ�����
	 * loc---�¶Ե��ַ���λ�õĸ���
	 * BUG������ϵͳ�������ַ�����Ϊ��ASDFG
	 *     �û�����sssss
	 *     ������Ϊ���¶�1���ַ�������0��λ����ȷ
	 * */
	public static int[] check(char[] input,char[] answer){
		int chs = 0; //�¶Ե��ַ�����
		int loc = 0; //�¶Ե��ַ���λ�ø���
		for(int i=0;i<answer.length;i++){ //�����û�������ַ�����
			for(int j=0;j<input.length;j++){ //����ϵͳ����������ַ�����
				if(input[i]==answer[j]){ //�ַ���ͬ
					chs++;
					if(i==j){ //λ����ͬ
					loc++;
					}
					break;
				}
			}
		}
	return new int[]{chs,loc};	
	}
	
}//class
