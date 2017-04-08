package day10extends;

import java.util.Arrays;

//四格方块父类
public class Tetromino{
	
	Cell[] cells = new Cell[4];
	
	//下落
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//右移
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	//左移
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//重载系统toString方法，将输出的引用地址改为内容
	public String toString(){
		return Arrays.toString(cells);
	}
	
	
}
