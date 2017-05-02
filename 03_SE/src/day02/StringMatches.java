package day02;
/**
 * 字符串支持正则表达式方法1:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求，满足返回true
 * 注意：正则表达式中，就算不添加边界符(^,$)，在该方法中也是全匹配验证
 * @author Administrator
 *
 */
public class StringMatches {
	
	public static void main(String[] args) {
		/*
		 * pjz@qq.com
		 */
		String r = "\\\\"; //表示\\
		String email = "pjz@qq.com.cn";
		//String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\.[a-zA-Z]+)+";
		//此处的.在正则表达式中有特殊含义，需要转译字符\，即\.表示.
		//但是在String字符串中并没有特殊含义，不需要转译，加了\立即报错
		//解决：使用转译字符\将之前的转义字符\变成字符\输出来，即\\表示\
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		System.out.println("0".matches(regex));
		
		boolean tf = email.matches(regex);
		if(tf){
			System.out.println("是一个邮箱地址。");
		}else{
			System.out.println("不是一个邮箱地址。");
		}
		//应用：图片重命名
		String imgName = "123.jpg"; //我的图片名
		String[] names = imgName.split("\\.");
		System.out.println(names[0]+" "+names[1]);
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println(imgName); //上传到网上保存的图片名
		
		
	} //main
}
