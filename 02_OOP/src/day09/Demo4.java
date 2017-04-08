package day09;
//构造方法
public class Demo4 {
	
	public static void main(String[] args){
		//反复调用构造器就是重复调用数据的初始化过程
		Cell01 c1 = new Cell01(0,4);
		Cell01 c2 = new Cell01(0,5);
		Cell01 c3 = new Cell01(0,6);
		Cell01 c4 = new Cell01(1,5);
		//检查构造器执行结果，就是检查数据是否成功的初始化
		System.out.println("c1.row= "+c1.row+", c1.col= "+c1.col);
		System.out.println("c2.row= "+c2.row+", c2.col= "+c2.col);
		System.out.println("c3.row= "+c3.row+", c3.col= "+c3.col);
		System.out.println("c4.row= "+c4.row+", c4.col= "+c4.col);
		
		//检查c5是否下落
		Cell01 c5 = new Cell01(1,5);
		c5.drop();
		System.out.println("c5.row= "+c5.row);
		
		//默认构造器与定义构造器的使用 
		Gooo g =new Gooo(); //编译正确，调用默认构造方法
		//Fooo f = new Fooo(); //编译错误，定义了有参构造方法，编译器就不会再自动创建默认的无参构造方法
		Fooo f = new Fooo(1); //编译正确---调用有参构造方法
	}
}


class Cell01{
	int row;
	int col;
	/*添加构造器
	 * 核心作用：可以重用的 数据初始化过程
	 * 无返回值类型
	 * 方法名必须与类名一致
	 */
	public Cell01(int row,int col){
		super();
		this.row = row;
		this.col = col;
		//此处this.不可省略
		
	}
	
	
	public void drop(){
		
		/**
		 * this 在程序运行期间代表执行方法的当前对象。
		 * 当“对象属性”和“局部变量”无法区分时，不可省略this.
		 * 一般情况下可以不写this.
		 */
		//this.row++;
		row++; //此处可以省略 
	}
	
}

/**
 * 构造器(构造方法)：
 * 在类中定义构造器，用于封装对象数据的初始化过程
 * 构造器的名字必须与类名一样
 * 只能用new来调用
 * 
 * 构造器的运行原理：（考点）
 * 1.类加载： 从磁盘加载.class文件到内存的方法区---只加载一次，如果加载过就不在加载了
 * 2.分配空间： new运算在堆内存中开辟对象的存储空间。
 *              - 根据对象的属性分配存储空间。
 *              - 对象属性自动初始化为“零”值。
 * 3.执行属性的初始化： 执行对象属性初始化赋值
 * 4.执行构造器： 执行构造器中的语句
 * 5.返回对象的首地址： new运算结束，返回刚刚创建对象的首地址
 * 
 * 默认构造器：
 * 1.任何一个类都必须含有构造方法
 * 2.如果源程序中没有定义，编译器就会自动为其添加一份无参的空的构造方法，称为默认构造方法
 * 3.当定义了构造方法后，java编译器将不再添加默认的构造方法
 */
//Gooo采用默认的构造方法
class Gooo{
	
}
//定义Fooo(int)构造方法
class Fooo{
	public Fooo(int a){
		
	}
}







