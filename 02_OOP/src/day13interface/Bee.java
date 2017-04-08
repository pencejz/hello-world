package day13interface;

import java.util.Random;

public class Bee extends FlyingObject implements Award{

	private int dir = 1; //·½Ïò
	
	public Bee(){
		super(70,80);
	}
	
	public void move(){
		y++;
		x+=dir;
		if(x>=480-w){
			dir=-1;
		}
		if(x<=0){
			dir =1;
		}
	}
	
	public int getAward() {
		return LIFE;
	}
	public String toString(){
		return "Bee";
	}

}
