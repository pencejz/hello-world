package day10extends;

import java.util.Arrays;

//�ĸ񷽿鸸��
public class Tetromino{
	
	Cell[] cells = new Cell[4];
	
	//����
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//����
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	//����
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//����ϵͳtoString����������������õ�ַ��Ϊ����
	public String toString(){
		return Arrays.toString(cells);
	}
	
	
}
