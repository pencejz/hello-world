package day08;

public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * ��һ�������ڲ�ʹ��throw�׳��쳣ʱ����Ҫ�ڷ�����ʹ��turows������쳣���׳����Ա�֪ͨ�����߲�����쳣
	 * ֻ���׳�RuntimeException��������ʱ����ǿ��Ҫ��������
	 * ���������Ҫ��ǿ������������Ȼ���벻��ͨ��
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		
		if(age<0 || age>100){
			//throw new RuntimeException("���䲻�Ϸ���");
			throw new IllegalAgeException("���䲻�Ϸ���");
		}
		this.age = age;
	}
	
}
