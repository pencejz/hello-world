package day08;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("====================欢迎来到猜字母游戏====================");
		System.out.println(
				"游戏规则：\n" 
						+ "1、游戏中的字母均为大写字母；\n" 
						+ "2、字母的位置与随机生成的字母位置一一对应才算正确；\n" 
						+ "3、游戏总分1000分，每猜1次扣除10分，分数为0则退出游戏；\n"
						+ "4、游戏中字母长度由用户选择；\n" 
						+ "5、输入EXIT0退出游戏。\n\n" 
						+ "----------游戏开始！Ready！Go！----------\n");
		System.out.print("请输入要猜测的字母长度：");
		int count = scan.nextInt(); // 自定义字母的个数
		scan.nextLine(); // 将nextInt()丢弃掉的回车符(用户上一次输入完成后的回车符)接收，以保证后续nextLine()能正常接收输入
		int score = 1000; // 总分
		int chs, loc; // 声明猜对字母的个数及猜对位置的字母个数
		char[] answer = generate(count); // 调用生成随机数方法
		//System.out.println(answer); //系统随机生成的字母
		do {
			System.out.println("请输入" + count + "个字母：");
			String s = scan.nextLine();
			//检查用户输入EXIT0或者exit0退出游戏
			if(s.equals("EXIT0")||s.equals("exit0")){
				System.out.println("----------退出游戏！欢迎下次继续----------");
				break;
			}
			char[] input = s.toCharArray();
			int[] var = check(answer, input);	// 调用比较方法返回有chs与loc信息的数组check
			chs = var[0];
			loc = var[1];
			System.out.println("你猜对了" + chs + "个字母，其中" + loc + "个字符位置正确！");
			score -= 10;
			if (score == 0) {
				System.out.println("你太差劲了！IQ有待提升！");
				break;
			}
			if (chs == count && loc == count) {
				System.out.println("大神！恭喜你！猜对了！你的得分：" + score);
			}
		} while (chs != count || loc != count);
		scan.close();	//关闭输出

	}

	// 生成随机字母方法
	public static char[] generate(int n) {
		//方法一：将26个大写字母放到一个数组里面，然后随机生成这个数组的索引（下标），通过索引得到随机字母
		//方法二：随机生成26个大写字母所对应的int型数字（65~90）,再转换成字母即可
		char[] allLetters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] isRep = new boolean[allLetters.length];	//创建一个boolean型数组，与allLetters长度一致，所有元素默认为false
		char[] letter = new char[n];	//创建数组接收随机生成的n个字母
		int temp;	//声名数组索引（下标）
		for (int i = 0; i < letter.length; i++) {
			do {
				Random ran=new Random();
				temp=ran.nextInt(allLetters.length);	//生成随机数方法一（allLetters数组下标0~25）
				//temp = (int) (Math.random() * allLetters.length); // 生成随机数方法二
				letter[i] = allLetters[temp];	//将allLetters数组中下标为temp的元素赋值给letter数组中索引为i的元素
			} while (isRep[temp]);	
			isRep[temp] = true;	//letter每一次赋值完成后，将与allLetters数组下标对应的isRep数组下标所对应的元素值改为true
		}
		return letter;
	}

	// 比较系统生成的字母与用户输入的字母
	public static int[] check(char[] answer, char[] input) {
		int[] result = new int[2];
		int m = 0, n = 0;
		// （比数量）比较两组字母，并将相同字母数量存放在result数组的第一个位置
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (answer[i] == input[j]) {
					m++;
				}
			}
		}
		result[0] = m;
		// （比位置）比较两组字母，并将相同字母数量存放在result数组的第二个位置
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				n++;
			}
		}
		result[1] = n;
		return result;
	}
}
