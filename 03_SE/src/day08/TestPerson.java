package day08;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		/**
		 * ������һ��ʹ��throws�����쳣�׳��ķ���ʱ��������Ҫ����봦����쳣����ô����ķ�ʽ�����֣�
		 * 1.ʹ��try-catch�����쳣�����
		 * 2.�ڵ�ǰ�����ϼ���ʹ��throws�����쳣�����׳�
		 * ����ʹ�����֣�Ҫ������
		 */
		
			try {
				p.setAge(1000);//�����﷨���������߼�
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		System.out.println("����Ϊ��"+p.getAge());
		

	}

}
