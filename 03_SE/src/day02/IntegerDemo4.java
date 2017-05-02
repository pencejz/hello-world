package day02;
/**
 * JDK1.5之后推出了一个新特性：
 * 自动拆装箱：
 * 它允许我们在编码时可以自由的在基本类型与对应的包装类之间相互赋值使用
 * 而无需在关注他们之间的转换过程
 * 但是，自动拆装箱，并不是虚拟机认可的，只是编译器认可的
 * 编译器会自动将互相之间的转换代码补充到编译后的class文件中
 * 
 * @author Administrator
 *
 */
public class IntegerDemo4 {

	public static void main(String[] args) {
		
		Integer in = 1;//自动装箱过程：自动补充为Integer in = Integer.valueOf(1);
		int i = in; //自动拆箱过程：自动补充为int i = in.intValue();
		dosome(i); //dosome(Integer.valueOf(i));
		
		
		
	}
	
	public static void dosome(Object obj){}
}
