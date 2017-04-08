package day11Concorl;

public class Static {
	public static void main(String[] args) {
		Cat c1 = new Cat(2);
		Cat c2 = new Cat(4);
		Cat c3 = new Cat(4);
		
		System.out.println(c1.age);
		System.out.println(c2.age);
		//静态变量numOfCat是同一份变量
		System.out.println(c1.numOfCat);
		System.out.println(c1.numOfCat);
		//java建议使用类名读写静态变量
		System.out.println(Cat.numOfCat);
		/**
		 * 使用建议：程序中唯一的变量使用静态
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