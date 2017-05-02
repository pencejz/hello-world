package day08;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		/**
		 * 当调用一个使用throws声明异常抛出的方法时，编译器要求必须处理该异常，那么处理的方式有两种：
		 * 1.使用try-catch捕获异常并解决
		 * 2.在当前方法上继续使用throws将该异常声明抛出
		 * 具体使用哪种，要看责任
		 */
		
			try {
				p.setAge(1000);//满足语法，不满足逻辑
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		System.out.println("年龄为："+p.getAge());
		

	}

}
