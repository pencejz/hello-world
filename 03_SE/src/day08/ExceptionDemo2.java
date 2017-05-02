package day08;
/**
 * finally块
 * finally块定义在异常捕获机制的最后
 * finally可以保证内部代码一定执行，无论try块中的代码是否出现异常
 * finally块中经常做诸如关闭流这样的释放资源操作
 * @author Administrator
 *
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("程序开始");
		try{
			String str = null;
			System.out.println(str.length());
		}catch(Exception e){
			System.out.println("出错啦");
		}finally{
			System.out.println("我在finally中被执行啦");
		}
		System.out.println("程序结束");
	}
}
