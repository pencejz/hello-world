package day07;

import java.util.Random;
import java.util.Scanner;

//猜字符游戏
public class GuessChars {
	
	/**
	 * 猜字符游戏
	 * 1.生成5个不重复的随机字符---声明为方法
	 * 2.等待用户输入
	 * 3.将用户输入的信息与5个字符相比较
	 * 4.显示比较的结果
	 * 5.计算得分
	 * 6.分数为0 结束
	 * 7.如果没有猜中返回2
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//生成5个不重复的随机大写字符
		char[] answer = generate(5);
		System.out.println(answer);
		int chs,loc,score = 1000;
		do{
			System.out.print("猜吧：");
			//获取用户输入的信息
			String s = scan.nextLine(); //用户输入信息
			char[] input = s.toCharArray(); //接收用户输入信息，并保存到input数组中
			//用户输入的数组与系统随机生成数组对比
			int[] val = check(input,answer);
			chs = val[0]; //猜测正确的字符个数
			loc = val[1]; //猜测正确的字符的个数的位置个数
			System.out.println("你猜对了"+chs+"个字符，其中"+loc+"个字符的位置正确！");
			score -=10;
			if(score==0){
				System.out.println("你要思考人生咯！！！");
				break;
			}
		}while(chs!=5 || loc!=5);
		
		System.out.println("分数为： "+score);
		scan.close();
		
	}//main
	
	/**
	 * 随机生成字符数组answer[]
	 * letters[]为范围数组
	 * used[]为开关数组，用来实现随机时不产生重复的字符
	 * index为即将产生的随机字符的下标
	 */
	public static char[] generate(int n){
		char[] answer = new char[n]; //保存系统随机生成的字符的数组
	    char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' }; //随机字符范围--26个大写字母
		boolean[] used = new boolean[letters.length]; //used为开关数组，默认值为false,表示没有保存过
	    Random random = new Random();
	    for(int i=0;i<answer.length;i++){ //遍历随机字符数组
	    	int index;
	    	do{
	    		index = random.nextInt(letters.length); //随机生成数组下标
	    	}while(used[index]); //当下标对应的used数组的值为true时，表示该字符已经存过，则重新生成index
	    	                     //当下标对应的used数组的值为false时，表示该字符未保存过，循环结束
	    	answer[i] = letters[index]; //根据下标取出letters中对应的字符，赋值给answer数组
	    	used[index] = true;
	    }
	    return answer;
	}
	
	/**随机字符数组与用户输入的字符数组作对比
	 * intput---用户输入的字符串
	 * answer---系统随机生成的字符串
	 * chs---猜对的字符个数
	 * loc---猜对的字符的位置的个数
	 * BUG：假若系统产生的字符数组为：ASDFG
	 *     用户输入sssss
	 *     输出结果为：猜对1个字符，其中0个位置正确
	 * */
	public static int[] check(char[] input,char[] answer){
		int chs = 0; //猜对的字符个数
		int loc = 0; //猜对的字符的位置个数
		for(int i=0;i<answer.length;i++){ //遍历用户输入的字符数组
			for(int j=0;j<input.length;j++){ //遍历系统产生的随机字符数组
				if(input[i]==answer[j]){ //字符相同
					chs++;
					if(i==j){ //位置相同
					loc++;
					}
					break;
				}
			}
		}
	return new int[]{chs,loc};	
	}
	
}//class
