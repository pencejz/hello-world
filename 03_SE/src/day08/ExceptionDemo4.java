package day08;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		System.out.println("程序开始");
		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			/**
			 * 输出错误堆栈信息，可以直接定位到错误出现的代码行，以便调整错误
			 */
			e.printStackTrace();
			/**
			 * 获取异常消息
			 */
			String m = e.getMessage();
			System.out.println("错误信息："+m);
		}
		
		System.out.println("程序结束");
	}
}
