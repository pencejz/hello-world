package day10;

public class Cell {
	
	int row;
	int col;
	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	/*
	 * 当前格式信息
	 * 引用类型直接输出的是地址
	 * 此处重载toString方法，将输出的引用地址改为内容
	 */
	public String toString(){
		return "("+row+","+col+")";
	}
	
	
	
}
