package day13;

public class Demo01 {

	public static void main(String[] args) {
		
		//Super s = new Super(); //abstract限制父类创建对象
		Super s = new Sub();
		/**在堆中先创建一个父类型对象(包含2个属性x，y)，然后还会在创建一个子类型对象(包含3个属性x,y,z)
		 * 此时的父类型对象包含在子类型内部，共有5个属性(父类型x,父类型y,子类型x,子类型y,子类型z)
		 * 导致x,y的值混淆不清---工作中应当注意避免，就是说在父类型中定义属性后，不要再在子类中重复定义 */
		//父类型变量s访问父类型属性x,y
		System.out.println(s.x+","+s.y); //3,4
		//子类型变量ss访问子类型属性x,y
		Sub ss = (Sub)s;
		System.out.println(ss.x+","+ss.y); //5,6
		int z = ((Sub)s).z;
		System.out.println(z); //7
		/**子类与父类属性或方法重名时，使用super.(属性名/方法名)调用父类型属性或方法 */
		Sub1 sss= new Sub1();
		sss.testSu();
		//super对方法的测试
		s.test();

	}//main
}

abstract class Super{
	int x,y;
	public Super(){
		x=3; y=4;
	}
	public void test(){
		System.out.println("Super.test()");
	}
}

//Sub错误定义
class Sub extends Super{
	int x, y, z;
	public Sub(){
		super();
		x=5; y=6; z=7;
	}
}
//Sub正确定义---使用super.调用
class Sub1 extends Super{
	int x, y, z;
	
	public Sub1(){
		super();
		x=5; y=6; z=7;	
	}
	public void test(){
		System.out.println("Sub1.test()");
	}
	//测试super.
	public void testSu(){
		System.out.println("x = "+x);
		System.out.println("super.x = "+super.x);
	}
	
}

