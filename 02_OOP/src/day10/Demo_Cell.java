package day10;
/**
 * 引用类型数组
 */
import java.util.Arrays;

public class Demo_Cell {
	public static void main(String[] args){
		//Cell类测试
		Cell[] ary= new Cell[4];
		System.out.println(Arrays.toString(ary));
		/*
		 * 输出null值不会发生空指针异常
		 * 说明：1.引用数组中存储的元素是引用类型变量
		 *     2.元素的默认值为null
		 *     3.有数组，五Cell对象
		 */
		//初始化数组元素
		ary[0] = new Cell(0,3);
		ary[1] = new Cell(0,4);
		ary[2] = new Cell(0,5);
		ary[3] = new Cell(1,4);
		System.out.println("ary = "+Arrays.toString(ary));
		
		//T型方块类测试
		T t = new T();
		System.out.println("T = "+t.toString());
		//省略形式：System.out.println("T = "+t);
		t.drop();
		System.out.println("T = "+t);
	}
}
