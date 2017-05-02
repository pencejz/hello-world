package summary;
//��װ��
public class day02_����_��װ���� {

	public static void main(String[] args) {
		
		/**
		 * ��������(���ͣ�char��boolean��float��double)ת���ɰ�װ��
		 * ��װ����  valueOf(��������/��������) ��װ�ำֵ��1.ֱ�Ӹ�ֵ��2.������ֵ
		 * ��������  parseXXX(��װ����) ��װ��ת��Ϊ��������
		 */
		//������װ�����
		Integer i1 = new Integer(1);
		System.out.println("i1 = "+i1);
		Character c1 = new Character('a');
		System.out.println("c1 = "+c1);
		Boolean b1 = new Boolean(true);
		System.out.println("b1 = "+b1);
		
		//��װ��ֱ�Ӹ�ֵ
		Integer i2 = Integer.valueOf(12);
		System.out.println("i2 = "+i2);
		Character c2 = Character.valueOf('A');
		System.out.println("c2 = "+c2);
		
		//��װ�������ֵ
		long l1 = 10L;
		Long l2 = Long.valueOf(l1);
		System.out.println("l3 = "+l2);
		
		//��װ��ת��Ϊ��������
		long l3 = i2.longValue();
		System.out.println("l3 = "+l3);
		double d1 = i2.doubleValue();
		System.out.println("d1 = "+d1);
		char c3 = c1.charValue();
		System.out.println("c3 = "+c3);
		boolean b2 = b1.booleanValue();
		System.out.println("b2 = "+b2);
		
		//�������ͣ�int,long,byte,short,double,float����װ֧������������MAX_VALUE MIN_VALUE
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
		//���ַ���ת��Ϊ��Ӧ�Ļ������ͣ��������ͣ�
		String str = "123";
		int i3 = Integer.parseInt(str);
		System.out.println("i3 = "+i3);
		String str1 = "123.456";
		double d2 = Double.parseDouble(str1);
		System.out.println("d2 = "+d2);
		//i3 = Double.parseDouble(str1); //���뱨��
		//i3 = Integer.parseInt(str1); //���б���
		
		//�Զ���װ��
		Integer i4 = 1; //Integer i4 = Integer.valueOf(i4);
		dosome(i4);
		int i5 = i4; //int i5 = i4.intValue();
		dosome(i5);
		
		/**
		 * ������ʽ
		 * boolean matches(String regex) �ø���������ʽ���鵱ǰ�ַ����Ƿ������ʽҪ��
		 * String split(String regex) ����ǰ�ַ�������������ʽ�ĵط����в�֣�����ֺ�������ַ�������
		 * String replaseAll(String regex,String str) ����ǰ����������ʽ�Ĳ����滻Ϊ�����ַ���
		 */
		//�ж�pjz@qq.com.cn�Ƿ���һ�������ַ
		String email = "pjz@qq.com.cn";
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		System.out.println("�Ƿ�Ϊ�����ַ��"+email.matches(regex));
		
		//��str2�������ֲ��ֲ��
		String str2 = "abc123def456ghi789jkl";
		String regex2 = "[0-9]+";
		String[] ary = str2.split(regex2);
		for(int i=0;i<ary.length;i++){
			System.out.println("ary["+i+"] = "+ary[i]);
		}
		
		//ͼƬ������
		String imgName = "123.jpg"; //�ҵ�ͼƬ��
		String[] names = imgName.split("\\.");
		System.out.println("names[0] = "+names[0]);
		System.out.println("names[1] = "+names[1]);
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println("�ϴ������ϱ����ͼƬ��:"+imgName);	
		
		//�����ֲ����滻Ϊ�� #NUMBER# ��
		String str3 = "abc123def456ghi789jkl";
		str = str3.replaceAll("\\d+", " #NUMBER# ");
		System.out.println("�滻���str3Ϊ��"+str3);
		
		//��г����
		String regex3 = "(wqnmlgb|nc|cnm|nmsl|mdzz|tmd|wtf|djb)";
		String str4 = "wtf!wqnmlgb!����ô��ô��nc�������djb��";
		str4 = str4.replaceAll(regex3, "****");
		System.out.println("�滻��str4 = "+str4);
		
	} //mian
	
	//�Զ���װ�����
	public static void dosome(Integer in){
		System.out.println("�Զ�װ��ɹ���");
	}
	public static void dosome(int in){
		System.out.println("�Զ�����ɹ���");
	}
}













