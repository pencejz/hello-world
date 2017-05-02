package summary;

public class day01_字符串 {

	public static void main(String[] args) {
		/**
		 * StringBuilder类
		 * StringBuilder append(String str) 末尾增加
		 * StringBuilder delete(int indexStart, int indexEnd) 删除
		 * StringBuilder insert(int index, String str) 插入
		 * StringBuilder replace(int indexStart, int indexEnd, String str) 修改
		 * StringBuilder reverse() 反转
		 * char charAt(int index) 获取指定下标对应的字符
		 * int length() 获取字符串的长度
		 */
		StringBuilder builder = new StringBuilder("好好学习，天天向上");
		//末尾增加---！就是为了报效祖国！
		;
		System.out.println(builder.append("！就是为了报效祖国！"));
		//修改---好好学习，天天向上---活着
		System.out.println(builder.replace(0, 9, "活着"));
		//插入---在（活着！）后面插入（努力奋斗！！！）
		System.out.println(builder.insert(3, "努力奋斗！！！"));
		//删除---活着！
		System.out.println(builder.delete(0, 3));
		//反转字符串
		builder.reverse();
		System.out.println("反转字符串："+builder);
		//获取指定下标对应的字符
		char ch = builder.charAt(5);
		System.out.println(ch);
		//获取字符串的长度
		int len = builder.length();
		System.out.println(len);
		/**
		 * String类
		 * boolean startsWith(String str) 判断当前字符串是否以给定字符串str开头
		 * boolean endsWith(String str) 判断当前字符串是否以给定字符串str结束
		 * String toUpperCase() 将字符串中的所有英文字母全部改为大写
		 * String toLowerCase() 将字符串中的所有英文字母全部改为小写
		 * int indexOf(String str) 查看给定字符串在当前字符串中的位置
		 * int indexOf(String str, int index) 查看给定字符串从指定位置index开始往后查找，第一次出现的位置
		 * int lastIndexOf(String str) 查看给定字符串在当前字符串中最后一次出现的位置
		 * int lastIndexOf(String str, int index) 查看给定字符串从指定位置index开始往前查找，最后一次出现的位置
		 * String substring(int index) 截取字符串，从index开始到字符串结束
		 * String substring(int startIndex, int endIndex) 截取字符串
		 * String trim() 取出字符串两边的空白，但是不能去除中间的空白部分
		 * String valueOf(数值型    i) 将数值型转换成String
		 */
		//判断一个字符串是否以给定字符串开头/结尾
		            //0123456789012345
		String str = "thinking in java";
		boolean b = str.startsWith("th");
		System.out.println(b);
		System.out.println(str.endsWith("va"));
		//先将英文字符改为大写，然后再改为小写
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//查看给定字符串在当前字符串中的位置
		System.out.println(str.indexOf("ia"));
		System.out.println(str.indexOf("in",3));
		System.out.println(str.lastIndexOf("in"));
		System.out.println(str.lastIndexOf("in",8));
		//截取字符串
		str = "好好学习，天天向上！！！";
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,9));
		//去掉字符串两边的空白，但是不能去掉中间的空白部分
		String str1 = "  你好    ";
		System.out.println(str1.trim());
		//将其他类型转换为字符串类型
		int a = 123456;
		System.out.println(a+1);
		System.out.println(String.valueOf(a)+1);
		
		
		
	}//main
}



