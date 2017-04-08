package day10test;

import java.util.Arrays;

//方块父类
public class Tetromino {
	
	Cell[] cells = new Cell[4];
	
	//下落方法
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//左移
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//右移
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	//重载toString方法
	public String toString(){
		return Arrays.toString(cells);
	}
}











