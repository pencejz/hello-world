package day14;

public class Inner {

	public static void main(String[] args) {
		/**
		 * 测试内部类
		 * 1.内部类可以共享外部类的属性和方法
		 * 2.外部类封装了内部类
		 * 3.当内部类与外部类属性或方法重名时，在内部类中使用外部类属性或方法时必须加前缀：外部类.this.
		 * 4.在方法体外面定义的内部类的访问类型可以是 public,protecte,默认的，private 等4种类型，这就好像类中定义的成员变量有4种访问类型一样
		 *   它们决定这个内部类的定义对其他类是否可见；此时，我们也可以在外面创建内部类的实例对象
		 *   创建内部类的实例对象时，一定要先创建外部类的实例对象，然后用这个外部类的实例对象去创建内部类的实例对象
		 */
		Outer outer = new Outer(5,10);
		outer.test(); //6,11
		System.out.println("Inner.times1 = "+outer.inner.times1);
		
		//创建内部类对象(此处的inner是一个新的对象，而不是外部类中的成员变量inner)
		Outer.Inner inner = outer.new Inner();
		inner.timesInc();
		System.out.println("Inner.times1 = "+inner.times1);
		

	}//main

}

//外部类
class Outer {
	private int times;
	private int times1;
	Inner inner; //内部类通常只在外部类内部使用
	//构造方法
	public Outer(int times,int times1){
		this.times = times;
		this.times1 = times1;
		inner = new Inner(); //创建内部类对象
		inner.timesInc(); //方法调用，实现times加1
	}
	//显示私有属性的方法
	public void test(){
		System.out.println("Outer.times = "+times);
		System.out.println("Outer.times1 = "+times1);
	}
	//内部类
	class Inner{
		int times1 = 1;
		public void timesInc(){
			times++; //内部类可以共享外部类的属性和方法
			times1++; //内部类中的times1加了1
			Outer.this.times1++; //外部类中的times1加了1
		}
		
	}
}