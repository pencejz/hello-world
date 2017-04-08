package day10;

import java.util.Arrays;

public class T {
	//创建T型方块对象数组
	Cell[] cells = new Cell[4];
	//Cell[] cells; //一旦调用构造方法，就会出空指针异常
	//构造方法
	public T(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,4);
	}
	
	//重载系统toString方法，将输出的引用地址改为内容
	public String toString(){
		//调用Cell类中重写的toString方法
//1		return cells[0].toString()+","+
//2		cells[1].toString()+","+		
//3		cells[2].toString()+","+
//4		cells[3].toString();
		return Arrays.toString(cells); //本句 == 1234
	}
	//下落方法
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
	
}
