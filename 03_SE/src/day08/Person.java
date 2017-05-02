package day08;

public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * 当一个方法内部使用throw抛出异常时，就要在方法上使用turows定义该异常的抛出，以便通知调用者捕获该异常
	 * 只有抛出RuntimeException及其子类时，不强制要求这样做
	 * 否则编译器要求强制这样做，不然编译不会通过
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		
		if(age<0 || age>100){
			//throw new RuntimeException("年龄不合法！");
			throw new IllegalAgeException("年龄不合法！");
		}
		this.age = age;
	}
	
}
