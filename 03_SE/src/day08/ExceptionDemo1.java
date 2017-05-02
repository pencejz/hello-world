package day08;
/**
 * java异常捕获机制
 * @author Administrator
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("程序开始");
		try{ //存在异常的代码块
			String str = null; //空指针异常
			String str1 = "a"; //下标越界
			/**
			 * 当JVM执行代码遇到了某个异常时，会实例化该异常
			 * 然后将该代码执行过程封装进去，并将该异常实例抛出
			 * 在try中出错的语句之后的剩余的其他语句均不会再被执行
			 */
			System.out.println(str.length());
			System.out.println(str1.charAt(0));
			System.out.println(Integer.parseInt(str1));
			/**
			 * catch可以定义多个，根据不同的异常有不同的处理方法，应当分别去捕获这些异常
			 * 但是应当在最后一个catch上捕获Exception
			 * 这样可以避免因为出现个了一个未捕获的异常导致程序中断
			 * 若捕获的异常之间存在父子级的继承关系时，那么一定是先捕获子类异常，后捕获父类异常
			 * 所以先定义子类异常，后定义父类异常
			 */
		}catch(NullPointerException e){ //捕获异常类型，并实例化
			System.out.println("出现了空指针异常"); //解决异常
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("下标越界");
		}catch(Exception e){
			System.out.println("就是有个错误");
		}
	
		
		System.out.println("程序结束");
	}
}
