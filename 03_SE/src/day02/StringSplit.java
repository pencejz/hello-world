package day02;
/**
 * �ַ���֧��������ʽ����2:
 * String split(String regex)
 * ����ǰ�ַ���������������ʽ�ĵط����в�֣�����ֺ�������ַ�������
 * @author Administrator
 *
 */
public class StringSplit {

	public static void main(String[] args) {
		
		String str = "abc123def456ghi789jkl";
		//�������ֲ��ֲ��
		String regex = "[0-9]+";
		String[] ary = str.split(regex);
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}

	}//main

}
