package day01;
/**
 * �жϵ�ǰ�ַ����Ƿ��Ը����ַ�����ͷ���β
 * boolean startWith(String str)
 * boolean endWith(String str)
 * @author Administrator
 *
 */
public class StringSWEW {
	
	public static void main(String[] args) {
		String str = "thinking in java";
		//�ж�str�Ƿ���thi��ͷ
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		//�ж�str�Ƿ���ava����
		boolean ends = str.endsWith("ava");
		System.out.println(ends);
		
		
	}
}
