package summary;
//包装类
public class day02_正则_包装类型 {

	public static void main(String[] args) {
		
		/**
		 * 基本类型(整型，char，boolean，float，double)转换成包装类
		 * 包装类型  valueOf(基本类型/引用类型) 包装类赋值：1.直接赋值、2.变量赋值
		 * 基本类型  parseXXX(包装类型) 包装类转换为基本类型
		 */
		//创建包装类对象
		Integer i1 = new Integer(1);
		System.out.println("i1 = "+i1);
		Character c1 = new Character('a');
		System.out.println("c1 = "+c1);
		Boolean b1 = new Boolean(true);
		System.out.println("b1 = "+b1);
		
		//包装类直接赋值
		Integer i2 = Integer.valueOf(12);
		System.out.println("i2 = "+i2);
		Character c2 = Character.valueOf('A');
		System.out.println("c2 = "+c2);
		
		//包装类变量赋值
		long l1 = 10L;
		Long l2 = Long.valueOf(l1);
		System.out.println("l3 = "+l2);
		
		//包装类转换为基本类型
		long l3 = i2.longValue();
		System.out.println("l3 = "+l3);
		double d1 = i2.doubleValue();
		System.out.println("d1 = "+d1);
		char c3 = c1.charValue();
		System.out.println("c3 = "+c3);
		boolean b2 = b1.booleanValue();
		System.out.println("b2 = "+b2);
		
		//数字类型（int,long,byte,short,double,float）包装支持两个常量：MAX_VALUE MIN_VALUE
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
		//将字符串转化为对应的基本类型（数字类型）
		String str = "123";
		int i3 = Integer.parseInt(str);
		System.out.println("i3 = "+i3);
		String str1 = "123.456";
		double d2 = Double.parseDouble(str1);
		System.out.println("d2 = "+d2);
		//i3 = Double.parseDouble(str1); //编译报错
		//i3 = Integer.parseInt(str1); //运行报错
		
		//自动拆装箱
		Integer i4 = 1; //Integer i4 = Integer.valueOf(i4);
		dosome(i4);
		int i5 = i4; //int i5 = i4.intValue();
		dosome(i5);
		
		/**
		 * 正则表达式
		 * boolean matches(String regex) 用给定正则表达式检验当前字符串是否满足格式要求
		 * String split(String regex) 将当前字符串满足正则表达式的地方进行拆分，将拆分后的所有字符串返回
		 * String replaseAll(String regex,String str) 将当前满足正则表达式的部分替换为给定字符串
		 */
		//判断pjz@qq.com.cn是否是一个邮箱地址
		String email = "pjz@qq.com.cn";
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		System.out.println("是否为邮箱地址："+email.matches(regex));
		
		//将str2按照数字部分拆分
		String str2 = "abc123def456ghi789jkl";
		String regex2 = "[0-9]+";
		String[] ary = str2.split(regex2);
		for(int i=0;i<ary.length;i++){
			System.out.println("ary["+i+"] = "+ary[i]);
		}
		
		//图片重命名
		String imgName = "123.jpg"; //我的图片名
		String[] names = imgName.split("\\.");
		System.out.println("names[0] = "+names[0]);
		System.out.println("names[1] = "+names[1]);
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println("上传到网上保存的图片名:"+imgName);	
		
		//将数字部分替换为“ #NUMBER# ”
		String str3 = "abc123def456ghi789jkl";
		str = str3.replaceAll("\\d+", " #NUMBER# ");
		System.out.println("替换后的str3为："+str3);
		
		//和谐用语
		String regex3 = "(wqnmlgb|nc|cnm|nmsl|mdzz|tmd|wtf|djb)";
		String str4 = "wtf!wqnmlgb!你怎么这么的nc！你这个djb！";
		str4 = str4.replaceAll(regex3, "****");
		System.out.println("替换后str4 = "+str4);
		
	} //mian
	
	//自动拆装箱测试
	public static void dosome(Integer in){
		System.out.println("自动装箱成功！");
	}
	public static void dosome(int in){
		System.out.println("自动拆箱成功！");
	}
}













