package day13interface;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		//天空飞来一群飞行物
		FlyingObject[] sky = new FlyingObject[4];
		//产生四个随机的飞行物
		sky[0] = randomOne();
		sky[1] = randomOne();
		sky[2] = randomOne();
		sky[3] = randomOne();
		System.out.println(Arrays.toString(sky));
		//数组中的飞行物是多种多样的
		//统计如上数组中敌人数组中的数量
		int sum = 0;
		int ss = 0;
		for(int i=0;i<sky.length;i++){
			if(sky[i] instanceof Enemy){
				int s = ((Enemy)sky[i]).getScore();
				sum++;
				ss+=s;
				
			}
		}
		System.out.println("敌人数量："+sum);
		//统计敌人总分
		System.out.println("敌人总分："+ss);
		//检查变量引用的对象类型
		boolean b = sky[0] instanceof Bee;
		System.out.println(b);
		

	}
	//产生某一个随机的敌人的方法---与对象无关的可以使用static
	public static FlyingObject randomOne(){
		Random random = new Random();
		int type = random.nextInt(5);
		switch(type){
		case 0: return new Bee();
		case 1:
		case 2:
		case 3: return new Airplane();
		case 4:	return new Airplane2();
		}
		return null;
	}
	
	
}
