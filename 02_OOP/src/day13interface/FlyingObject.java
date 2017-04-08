package day13interface;

import java.util.Arrays;
import java.util.Random;

public class FlyingObject {

	protected int x, y, w, h;
	
	public FlyingObject(){
		
	}
	
	public FlyingObject(int w, int h){
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

	public String toString(){
		return null;
	}
}
