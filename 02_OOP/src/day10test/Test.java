package day10test;

//测试类
public class Test {

	public static void main(String[] args){
		
		T t = new T();
		System.out.println("测试T："+t);
		//随机生成某一种方块
		Tetromino x = new Tetromino();
		x = randomOne();
		System.out.println("随机方块："+x);
		//左移
		x.moveLeft();
		System.out.println("左移操作："+x);
		//下落
		x.drop();
		System.out.println("下落操作："+x);
		//右移
		x.moveRight();
		System.out.println("右移操作："+x);
		
	}//main
	
	//随机生成某一种方块
	public static Tetromino randomOne(){
		
		//随机生成0~6的整数
		int type = (int)(Math.random()*7);
		//一一对应方块类型
		switch(type){
		case 0:
			return new T();
		case 1:
			return new I();
		case 2:
			return new S();
		case 3:
			return new Z();
		case 4:
			return new J();
		case 5:
			return new O();
		case 6:
			return new L();
		}
		return null;
	}
	
	
}
