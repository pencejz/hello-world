package day01;
/**
 * 字符串在创建对象时，推荐使用字面量形式直接创建
 * 因为在使用字面量创建时，若创建内容相同的字符串时会重用对象，减少内存的开销
 * 由于内容相同的字符串会重用对象，所以要求字符串对象是不变对象
 * 即：字符串对象一旦创建，内容将不可被改变。若要改变，则会创建新的对象
 * 为了解决这一问题，java专门提供了StringBuilder类
 */
public class StringDemo {

	public static void main(String[] args) {
		//字符串一旦定义，就不能再更改
		String s = "你好！";
		String s1 = "你好！";
		System.out.println(s==s1); //true---引用了相同的对象，地址相等
		System.out.println(s.equals(s1)); //true---值相等
		s = s+"！！"; //s引用的是新创建的对象的地址
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1); //false
		
		String s2 = new String("你好！"); //new会强制创建新的对象
		System.out.println(s1==s2); //false
		
		String s3 = "你好"+"！"; //没有变量，编译期就会得到结果，不会创建新的对象
		System.out.println(s1==s3); //true
		
		String s4 = "你好";
		String s5 = s4 + "！"; //有变量，运行期才会得到结果，会创建新的对象
		System.out.println(s5==s1); //false
		
	}
}
