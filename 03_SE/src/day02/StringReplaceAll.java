package day02;
/**
 * �ַ���֧��������ʽ����3:
 * Srting replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�����ַ���
 * @author Administrator
 *
 */
public class StringReplaceAll {
	
	public static void main(String[] args) {
		
		String str = "abc123def456ghi789jkl";
		//�����ֲ����滻Ϊ�� #NUMBER# ��
		str = str.replaceAll("\\d+", " #NUMBER# ");
		System.out.println(str);
		//����ĸ���ֻ��ɡ� #WORD# ��
		str = str.replaceAll("[a-z]+", " #WORD# ");
		System.out.println(str);
		//��г����
		String regex = "(wqnmlgb|nc|cnm|nmsl|mdzz|tmd|wtf|djb)";
		String m = "wtf!wqnmlgb!����ô��ô��nc�������djb��";
		m = m.replaceAll(regex, "****");
		System.out.println(m);		
		
		
	}//main
}
