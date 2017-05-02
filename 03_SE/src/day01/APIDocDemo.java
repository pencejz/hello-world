package day01;
/**
 * 文档注释的导出：
 * 文档注释用来修饰三个地方：类，方法，常量
 * 注释最终会被javadoc命令翻译并生成一个API文档
 * 在类上声明通常是用来说明当前类的功能
 * @author pjz （作者）
 * @version 1.0 22/06/16 (1部分为大版本修改-功能上的修改。0为小版本更改-修复bug之类的
 *                       22/06/16常为最后更改时间)
 * @see java.long.String (参考的包)
 * @since JDK1.0 (始于某一JDK版本)
 */
public class APIDocDemo {
	
	/**
	 * sayHello方法使用的问候短语
	 */
	public static final String INFO = "你好！";
	
	/**
	 * 为指定用户添加一个问候语(方法的功能)
	 * @param name 需要添加到问候语的用户名 （参数）
	 * @return 含有问候语的字符串
	 */
	public String sayHello(String name){
		return INFO+name;
	}
}
