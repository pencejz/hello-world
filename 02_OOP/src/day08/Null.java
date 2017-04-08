package day08;

//null和NullPointerException
public class Null {

	public static void main(String[] args) {
		/**
		 * 问题：
		 * 当引用变量的值是null时，访问了其属性（元素）、方法，将会出现空指针异常
		 * 引起空指针异常的条件：引用值为null空时访问了其属性和方法
		 * 解决空指针异常：
		 * 方法一：将引用变量合理的赋值
		 * 方法二：if判断避免null值引用的属性和方法
		 */
		//案例：
		//Cell c = null;
		//int n = c.row; //运行报错：java.lang.NullPointerException
		//解决1：
		Cell c = new Cell();
		int n = c.row;
		//解决2：
		Cell c1 = null;
		if(c1!=null){
			c1 = new Cell();
		}
		
		
		
		
	}//main
	
}//class



