package day11;

public class TestPlane {

	public static void main(String[] args) {
		//创建小飞机
		Airplane a1 = new Airplane();
		System.out.println("小飞机"+a1);
		//飞机向下移动---调用父类move方法
		a1.move();
		System.out.println("移动后小飞机"+a1);
		//创建英雄机
		Hero h1 = new Hero();
		System.out.println("英雄机"+h1);
		//创建蜜蜂
		Bee b1 = new Bee();
		System.out.println("蜜蜂"+b1);
		//创建大飞机
		Bigplane ba1 = new Bigplane();
		System.out.println("大飞机"+ba1);
		//创建子弹
		Bullet bu1 = new Bullet(240,500);
		System.out.println("子弹"+bu1);
		//子弹向上移动移动---重写的父类move方法
		bu1.move();
		System.out.println("移动后的子弹"+bu1);
		//发射一颗子弹shoot()方法
		bu1 = h1.shoot();
		System.out.println("shoot方法创建子弹"+bu1);
		/*
		 * 向上造型
		 * 好处是提现飞行物的多种多样
		 * 父类型变量不可调用子类型方法---Bullet b=obj.shoot(); //编译错误
		 * 解决方法：强制转型
		 */
		FlyingObject[] all = new FlyingObject[10];
		all[0] = new Airplane();
		FlyingObject obj = new Hero();
		
		Bullet bx = ((Hero)obj).shoot(); //强制转型
		System.out.println(bx);
		
		
		
	}

}
