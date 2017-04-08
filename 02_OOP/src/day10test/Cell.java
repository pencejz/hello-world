package day10test;
//格子类
public class Cell {
	
	int row;
	int col;
	
	//构造方法
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	//重载toString方法,将输出地址映射改为输出内容
	public String toString(){
		return "("+row+","+col+")";
	}
	
	
}

/**
1.构建Tetromino作为父类---添加属性 Cell[] cells 存储4个格子数据
-添加下落方法 drop() 
-添加左移动方法 moveLeft() 
-添加右移动方法 moveRight() 
-添加方法 toString() 

2.构建T型方块类---添加构造器，初始化属性

3.构建J L S Z I O型方块类
4.创建测试类 Demo---添加随机生成某一种方块的算法 randomOne()

5.添加测试方法---随机生成某个方块
-测试其下落功能
-测试左移动功能
-测试右移动功能
*/
