package day10test;
//������
public class Cell {
	
	int row;
	int col;
	
	//���췽��
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	//����toString����,�������ַӳ���Ϊ�������
	public String toString(){
		return "("+row+","+col+")";
	}
	
	
}

/**
1.����Tetromino��Ϊ����---������� Cell[] cells �洢4����������
-������䷽�� drop() 
-������ƶ����� moveLeft() 
-������ƶ����� moveRight() 
-��ӷ��� toString() 

2.����T�ͷ�����---��ӹ���������ʼ������

3.����J L S Z I O�ͷ�����
4.���������� Demo---����������ĳһ�ַ�����㷨 randomOne()

5.��Ӳ��Է���---�������ĳ������
-���������书��
-�������ƶ�����
-�������ƶ�����
*/
