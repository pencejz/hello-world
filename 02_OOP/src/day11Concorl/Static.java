package day11Concorl;

public class Static {
	public static void main(String[] args) {
		Cat c1 = new Cat(2);
		Cat c2 = new Cat(4);
		Cat c3 = new Cat(4);
		
		System.out.println(c1.age);
		System.out.println(c2.age);
		//��̬����numOfCat��ͬһ�ݱ���
		System.out.println(c1.numOfCat);
		System.out.println(c1.numOfCat);
		//java����ʹ��������д��̬����
		System.out.println(Cat.numOfCat);
		/**
		 * ʹ�ý��飺������Ψһ�ı���ʹ�þ�̬
		 */
		
	}
	
}


class Cat{
	int age;
	static int numOfCat;
	public Cat(int age){
		this.age = age;
		++numOfCat;
		System.out.println(numOfCat);
	}	
}