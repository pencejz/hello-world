package day10extends;
//������
public class Cell {
	
	int row; //��
	int col; //��
	//���췽��
	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}

	//����ϵͳtoString����������������õ�ַ��Ϊ����
	public String toString(){
		return "("+row+","+col+")";
	}
	
	
}
