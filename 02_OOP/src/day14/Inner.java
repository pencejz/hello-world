package day14;

public class Inner {

	public static void main(String[] args) {
		/**
		 * 测试内部类
		 * 1.内部类可以共享外部类的属性和方法
		 * 2.外部类封装了内部类
		 * 3.当内部类与外部类属性或方法重名时，在内部类中使用外部类属性或方法时必须加前缀：外部类.this.
		 */
		Outer o = new Outer(5,10);
		o.test(); //6

	}//main

}

//外部类
class Outer {
	private int times;
	private int times1;
	private Inner inner; //内部类通常只在外部类内部使用
	//构造方法
	public Outer(int times,int times1){
		this.times = times;
		this.times1 = times1;
		inner = new Inner(); //创建内部类对象
		inner.timesInc(); //方法调用，实现times加1
	}
	//显示私有属性的方法
	public void test(){
		System.out.println("times = "+times);
		System.out.println("times1 = "+times1);
	}
	//内部类
	class Inner{
		int times1;
		public void timesInc(){
			times++; //内部类可以共享外部类的属性和方法
			times1++; //内部类中的times1加了1
			Outer.this.times1++; //外部类中的times1加了1
		}
		
	}
}