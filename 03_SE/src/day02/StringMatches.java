package day02;
/**
 * �ַ���֧��������ʽ����1:
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ�����㷵��true
 * ע�⣺������ʽ�У����㲻��ӱ߽��(^,$)���ڸ÷�����Ҳ��ȫƥ����֤
 * @author Administrator
 *
 */
public class StringMatches {
	
	public static void main(String[] args) {
		/*
		 * pjz@qq.com
		 */
		String r = "\\\\"; //��ʾ\\
		String email = "pjz@qq.com.cn";
		//String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\.[a-zA-Z]+)+";
		//�˴���.��������ʽ�������⺬�壬��Ҫת���ַ�\����\.��ʾ.
		//������String�ַ����в�û�����⺬�壬����Ҫת�룬����\��������
		//�����ʹ��ת���ַ�\��֮ǰ��ת���ַ�\����ַ�\���������\\��ʾ\
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		System.out.println("0".matches(regex));
		
		boolean tf = email.matches(regex);
		if(tf){
			System.out.println("��һ�������ַ��");
		}else{
			System.out.println("����һ�������ַ��");
		}
		//Ӧ�ã�ͼƬ������
		String imgName = "123.jpg"; //�ҵ�ͼƬ��
		String[] names = imgName.split("\\.");
		System.out.println(names[0]+" "+names[1]);
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println(imgName); //�ϴ������ϱ����ͼƬ��
		
		
	} //main
}
