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
		x = random.nextInt(480-w); //�趨��Ļ���Ϊ480
		y = -h;
	}
	
	//�����ƶ�����
	public void move(){
		y++;
	}

	public String toString(){
		return null;
	}
}
