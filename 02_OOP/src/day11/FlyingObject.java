package day11;

import java.util.Random;

/**
 * 飞行物父类
 */
public class FlyingObject {

	//公共属性
	int x, y, w, h; //飞行物坐标x，飞行物 坐标y， 飞行物宽度w， 飞行物高度y
	//无参构造方法---子弹、英雄机调用
	public FlyingObject(){}
	//有参构造方法---小飞机、大飞机、蜜蜂调用
	public FlyingObject(int w,int h){
		this.w = w;
		this.h = h;
		Random random = new Random();
		x = random.nextInt(480-w); //设定屏幕宽度为480
		y = -h;
	}
	
	//公共移动方法
	public void move(){
		y++;
	}
	
	//输出方法
	public String toString(){
		return "坐标：("+x+","+y+")"+",宽度："+w+",高度"+h;
	}
}
