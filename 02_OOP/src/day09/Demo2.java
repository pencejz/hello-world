package day09;
//����ǩ��
public class Demo2 {

	public static void main(String[] args) {
		
		Foo foo = new Foo();
		//java ���ݷ���ǩ��ʶ�𷽷�---��������
		foo.test();
		foo.add();
		foo.add(5);
		foo.add(5.0);
		
		foo.add(5, 5);
		System.out.println(foo.add(1, 2));
		
		foo.add(5, 5L);
		foo.add(5L,5);
		//��������---ʵ�ַ����Ķ�̬����
		Person person = new Person();
		Dog dog = new Dog();
		System.out.println(person.love(dog));
		System.out.println(dog);
		
		
	}//main

}
class Foo{
	/**
	 * java���еķ��������в�ͬ�ķ���ǩ��---Ӧ��Ϊ��������
	 * ����ǩ��=������+�����б�
	 *            �����б�=��������+��������+����λ��
	 * ���أ���������ͬ�����������б�ͬ�ķ�����Ϊ���������ء�
	 * ���صķ�������ȫ��ͬ�ķ�����
	 */
	//����ǩ��
	public void test(){
		System.out.println("test()");
	}
	public void add(){
		System.out.println("add()");
	}
	public void add(int a){
		System.out.println("add(int)");
	}
	public int add(int a,int b){
		b=10;
		System.out.println("add(int,int)");
		return b;
	}
	public void add(int a, long b){
		System.out.println("add(int,long)");
	}
	public void add(long b,int a){
		System.out.println("add(long,int)");
	}
	public void add(double a){
		System.out.println("add(double)");
	}
}


/**
 * ��������
 */
class Person{
	public Person love(Person wife){
		System.out.println("�����ţ�����");
		return wife;
	}
	public Dog love(Dog dog){
		System.out.println("������������");
		return dog;
	}
}

class Dog{
	
}
/**
 * 
 */


