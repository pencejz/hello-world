package day13;

public class Interface {

	public static void main(String[] args) {
		
		/**接口语法演示 */
		Demo demo = new Demo();
		double p = demo.getPrice();
		System.out.println(p);
		//接口可以声明引用变量，引用子类型对象
		Prodect x; //接口可以定义引用变量
		Prodect x1 = demo; //接口定义引用实现类的对象
		face m = demo;
		//Prodect p = new Prodect();
		Prodect p1 = new Demo(); //接口可以创建实现类型的对象，但是不能创建接口类型对象
	}//main
}
//实现接口的类Demo---多继承
class Demo implements Prodect,face1{

	public double getPrice() {
		
		return 200;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return BOMB;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return 1;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
}

/**
 * 接口---抽象方法的集合
 * 1.在接口中只能定义常量和抽象方法
 * 2.可以省略关键字
 *    -常量可以省略public static final
 *    -方法可以省略public abstract
 * 3.接口不能创建对象
 * 4.接口可以继承接口
 * 5.接口只能作为父类型，被子类实现
 *    -接口实现是继承关系
 *    -实现接口关键字implements
 *    -实现接口必须实现接口中全部的抽象方法
 *    -一个子类可以实现多个接口，就必须实现多个接口中全部方法
 * 6.接口可以定义变量，可以引用子类类型方法
 */
interface face{
	//定义常量
	public static final int DOUBLE_FIRE = 2;
	int LIFE = 1; //省略public static final
	//定义抽象方法
	public abstract int getType();
	int getScore(); //省略public abstract
}
interface face1 extends face{ /**接口之间可以继承 */
	int BOMB = 3;
	int getSpeed();
}
interface Prodect{
	double getPrice();
}








