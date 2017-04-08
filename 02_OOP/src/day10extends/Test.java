package day10extends;

public class Test {

	public static void main(String[] args) {
		//继承测试
		T t = new T();
		System.out.println("t = "+t);
		t.drop();
		System.out.println("t = "+t);
		
		O o = new O();
		System.out.println("o = "+o);
		
		/**
		 * 构造方法的继承
		 * 
		 * 执行过程：调用子类构造方法--->调用父类构造方法--->结束父类构造方法--->结束子类构造方法
		 */
		Goo g = new Goo();
		System.out.println("g.n = "+g.n);
		System.out.println("g.a = "+g.a);
		
		//随机生成某一种方块测试
		Tetromino x = randomOne();
		System.out.println(x);
		
		
	}//main
	
	/**
	 * 子类型向上转型---随机生成某一种方块
	 */
	public static Tetromino randomOne(){
		//第一步：随机生成0~6的整数，对应其中方块
		int type = (int)(Math.random()*7);
		switch(type){
		case 0:
			return new T();
		case 1:
			return new J();
		case 2:
			return new I();
		case 3:
			return new O();
		case 4:
			return new S();
		case 5:
			return new Z();
		case 6:
			return new L();
		}
		return null; //解决编译错误问题，但是不会被执行
	}
	
}


class Foo{
	int n;
	//构造方法
	public Foo(){
		n = 6;
	}
}
class Goo extends Foo{
	int a;
	//构造方法
	public Goo(){
		/*
		 * 在子类构造方法中，super用作调用父类构造方法
		 * 每个子类在执行构造方法前，都必须先执行父类的构造方法
		 * 编译器会自动添加super，也可手动添加
		 */
		super();
		a =5;
	}
}


/**
 * 如果父类型没有无参构造方法，则子类就必须使用super调用父类有参构造方法
 * 子类默认调用的是父类无参构造方法
 * 
 *案例：
 *
 *class Koo{
	int n;
	public Koo(int n){
		this.n = n;
	}
}
class Hoo extends Koo{
	
}
 *解决方法：1.在父类中添加无参构造方法
 *       2.在子类中使用super： super(1);
 *
 */



