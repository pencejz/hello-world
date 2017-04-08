package day06;
/**九九乘法表的输出*/
public class ForNineList {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 * 输出
		 * 1*1 1*2 1*3 1*4 1*5 1*6 1*7 1*8 1*9
		 *     2*2 2*3 2*4 2*5 2*6 2*7 2*8 2*9
		 *         3*3 3*4 3*5 3*6 3*7 3*8 3*9
		 *             4*4 4*5 4*6 4*7 4*8 4*9
		 *                 5*5 5*6 5*7 5*8 5*9
		 *                     6*6 6*7 6*8 6*9
		 *                         7*7 7*8 7*9
		 *                             8*8 8*9
		 *                                 9*9
		 * 
		 */
		//输出方式一：
		System.out.println("输出方式一：");
		for(int i=1;i<=9;i++){
			int m=i-1;
			switch(m){
			case 0:break;
			case 1:System.out.print("\t");break;
			case 2:System.out.print("\t\t");break;
			case 3:System.out.print("\t\t\t");break;
			case 4:System.out.print("\t\t\t\t");break;
			case 5:System.out.print("\t\t\t\t\t");break;
			case 6:System.out.print("\t\t\t\t\t\t");break;
			case 7:System.out.print("\t\t\t\t\t\t\t");break;
			case 8:System.out.print("\t\t\t\t\t\t\t\t");
			}
			for(int j=i;j<=9;j++){
				System.out.print(""+i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//输出方式二：
		System.out.println("输出方式二：");
		for(int i=1;i<=9;i++){
			//制表符输出
			for(int t=0;t<i-1;t++){
				System.out.print("\t");
			}
			//乘法表输出
			for(int j=i;j<=9;j++){
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//输出方式三：
		System.out.println("输出方式三：");
		for(int i=1;i<=9;i++){
			
			for(int j=1;j<=9;j++){
				if(i>j){
					System.out.print("\t");
				}else{
					System.out.print(i+"x"+j+"="+i*j+"\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
	}//main

}//class
