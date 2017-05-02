package day01;
/**
 * StringBuilder：用来编辑字符串内容的API
 * 提供的方法：
 * 		增：append
 * 		删：delete
 * 		改：replace
 * 		插：insert
 * 		反转：reverse
 * StringBuilder内部维护一个可变长度的字符数组，所以修改内容都是在该数组上进行的。不会每修改一次就创建一个对象
 * @author Administrator
 *
 */
public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		String str = "好好学习，天天向上";
		StringBuilder builder = new StringBuilder(str); //传入一个参数	
		//StringBuilder builder = new StringBuilder(); //创建一个空的字符串
		//StringBuilder builder = new StringBuilder("好好学习，天天向上"); //直接传入一个字符串
		System.out.println(builder);
		/**
		 * 末尾增加---！为了考上好大学！
		 * StringBuilder append(String str)
		 */
		builder.append("！为了考上好大学！");
		str = builder.toString();
		System.out.println("添加后的bulider = "+str);
		/**
		 * 修改
		 * 1.好好学习，天天向上！为了考上好大学！
		 * 2.好好学习，天天向上！就是为了改变世界！
		 * 将1换成2
		 * StringBuilder replace(int startIndex,int endIndex,String str)
		 */
		builder.replace(10, 19, "就是为了改变世界！");
		System.out.println("改变后的builder = "+builder.toString());
		/**
		 * 删除---好好学习，天天向上！
		 * StringBuilder delete(int startIndex, int endIndex)
		 *                         [startIndex,  endIndex) ---含头不含尾
		 */
		builder.delete(0, 10);
		System.out.println("删除后的bulider = "+builder.toString());
		/**
		 * 插入
		 * 1.就是为了改变世界！
		 * 2.活着，就是为了改变世界！
		 * 在1的基础上插入---活着，变成2
		 * StringBuilder insert(int index,String str)
		 */
		builder.insert(0, "活着,");
		System.out.println("插入后的builder = "+builder.toString());
		
		/**
		 * 反转字符串
		 * StringBuilder reverse()
		 */
		builder.reverse();
		System.out.println("反转后的builder = "+builder.toString());
		
	}//main
	
}










