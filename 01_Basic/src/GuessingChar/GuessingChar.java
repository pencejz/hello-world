package GuessingChar;
//����ĸ��Ϸ
import java.util.Scanner;  //�û�����֧��

public class GuessingChar {
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("GuessingGame>��ӭ���Բ���ĸ��Ϸ��");
		int count=0;
		int score=0;
		char[] chs=generate(); //��������ַ�
		System.out.println(chs);
		System.out.println("��Ϸ��ʼ����������µ�5����ĸ���У���exit--�˳���");
		while(true){
			String str=scan.next().toUpperCase();
			if("EXIT".equals(str)){
			System.out.println("лл��ĳ��ԣ��ټ���");
			break;
			}
			char[] input=str.toCharArray();
			int[] result=check(chs,input);
			if(result[0]==chs.length){
				score=chs.length*100-count*10;
				System.out.println("��ϲ��¶��ˣ���ĵ÷��ǣ�"+score);
				break;
			}else{
				count++;
				System.out.println("��¶�"+result[1]+"���ַ�,����"+result[0]+"���ַ�λ����ȷ��(�ܴ���="+count+",exit--�˳�)");
			}
		}
		scan.close();
/*		
		//check��������
		char[] chs={'A','B','C','D','E'};        //�����ַ���
		char[] input={'B','Y','M','D','Z'};
		int[] result=check(chs,input);            //����check����
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		//����������鷽������
		char[] chs=generate();
		System.out.println(chs);
*/			
	}//main
	
	//��������ַ�����chs	
	public static char[] generate(){
		char[] chs=new char[5];
		char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//�����������--�����ظ�
		boolean[] flags=new boolean[letters.length];//boolean[]Ĭ��ֵFALSE
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index=(int)(Math.random()*26);//����0--25���������Math.random()--�����������
			}while(flags[index]);
			chs[i]=letters[index];
			flags[index]=true;			
	/*   
	    //�����������--���ظ�
		for(int i=0;i<chs.length;i++){
			int index=(int)(Math.random()*26);//����0--25���������Math.random()--�����������
			chs[i]=letters[index];
	*/	
		}
	return chs;
	}
	//��������ַ�����chs���û������ַ�����input��Աȵõ�result�ķ���check()
	/**
	 * @param chs ϵͳ����������ַ�����
	 * @param input �û�������ַ�����
	 * @return ��ĸ����ĸλ����ͬ�ĸ�����ɵ�check����
	 * BUG������ϵͳ�������ַ�����Ϊ��ASDFG
	 *     �û�����sssss
	 *     ������Ϊ���¶�1���ַ�������0��λ����ȷ
	 */
	public static int[] check(char[] chs,char[] input){
		int[] result=new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[1]++;//��ĸ��ͬ
					if(i==j){
						result[0]++;//λ����ͬ
					}
					break;
				}
			}
		}
		return result;
	}
	
}//class
