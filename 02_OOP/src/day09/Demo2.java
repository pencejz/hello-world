package day09;
//方法签名
public class Demo2 {

	public static void main(String[] args) {
		
		Foo foo = new Foo();
		//java 根据方法签名识别方法---方法重载
		foo.test();
		foo.add();
		foo.add(5);
		foo.add(5.0);
		
		foo.add(5, 5);
		System.out.println(foo.add(1, 2));
		
		foo.add(5, 5L);
		foo.add(5L,5);
		//方法重载---实现方法的动态调度
		Person person = new Person();
		Dog dog = new Dog();
		System.out.println(person.love(dog));
		System.out.println(dog);
		
		
	}//main

}
class Foo{
	/**
	 * java类中的方法必须有不同的方法签名---应用为方法重载
	 * 方法签名=方法名+参数列表
	 *            参数列表=参数类型+参数个数+参数位置
	 * 重载：方法名相同，方法参数列表不同的方法称为方法的重载。
	 * 重载的方法是完全不同的方法！
	 */
	//方法签名
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
 * 方法重载
 */
class Person{
	public Person love(Person wife){
		System.out.println("爱老婆！！！");
		return wife;
	}
	public Dog love(Dog dog){
		System.out.println("爱财旺！！！");
		return dog;
	}
}

class Dog{
	
}
/**
 * 
 */


