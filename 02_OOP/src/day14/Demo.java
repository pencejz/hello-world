package day14;
//类型转换
public class Demo {

	public static void main(String[] args) {
		//1.父类型(抽象父类、接口父类)定义的变量可以引用任意其子类型对象---向上造型(子类型赋值到父类型)
		Koo k1 = new Koo();
		Foo f1 = new Foo();
		Super s1 = k1;
		s1 = f1;
		Free ff = f1;
		//2.强制转型---向下转换(父类型赋值到子类型)
		Super ss1 = new Foo();
		Super ss2 = new Koo();
		Free ff1 = new Foo();
		//  运行正常：运行期间实际对象是目标类型
		Foo fx = (Foo)ss1;
		Koo kx = (Koo)ss2;
		Foo fy = (Foo)ff1;
		Free e = (Free)ss1;
		//  运行失败：运行期间实际引用的对象不是目标类型，会出现运行异常
		//Foo f3 = (Foo)ss2; //报错：java.lang.ClassCastException
		//Free ex = (Free)ss2;
		//3.利用instanceof实现安全的强制类型转换---先判断，在转换
		if(ss1 instanceof Free){
			Free fk = (Free)ss1;
			fk.pay();
		}
		
	}//main
	
}
class Koo extends Super{
	
}
class Foo extends Super implements Free{
	public void pay() {
		System.out.println("pay");
	}
}
//父类
class Super{
	public void test(){
		System.out.println("test");
	}
}
//接口
interface Free{
	void pay();
}