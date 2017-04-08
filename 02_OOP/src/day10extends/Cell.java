package day10extends;
//格子类
public class Cell {
	
	int row; //行
	int col; //列
	//构造方法
	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}

	//重载系统toString方法，将输出的引用地址改为内容
	public String toString(){
		return "("+row+","+col+")";
	}
	
	
}
