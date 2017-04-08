package GuessingChar;
//猜字母游戏
import java.util.Scanner;  //用户输入支持

public class GuessingChar {
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("GuessingGame>欢迎尝试猜字母游戏！");
		int count=0;
		int score=0;
		char[] chs=generate(); //随机生成字符
		System.out.println(chs);
		System.out.println("游戏开始，请输入你猜的5个字母序列：（exit--退出）");
		while(true){
			String str=scan.next().toUpperCase();
			if("EXIT".equals(str)){
			System.out.println("谢谢你的尝试，再见！");
			break;
			}
			char[] input=str.toCharArray();
			int[] result=check(chs,input);
			if(result[0]==chs.length){
				score=chs.length*100-count*10;
				System.out.println("恭喜你猜对了！你的得分是："+score);
				break;
			}else{
				count++;
				System.out.println("你猜对"+result[1]+"个字符,其中"+result[0]+"个字符位置正确！(总次数="+count+",exit--退出)");
			}
		}
		scan.close();
/*		
		//check方法测试
		char[] chs={'A','B','C','D','E'};        //定义字符串
		char[] input={'B','Y','M','D','Z'};
		int[] result=check(chs,input);            //调用check方法
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		//生成随机数组方法测试
		char[] chs=generate();
		System.out.println(chs);
*/			
	}//main
	
	//随机生成字符数组chs	
	public static char[] generate(){
		char[] chs=new char[5];
		char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//生成随机数组--不可重复
		boolean[] flags=new boolean[letters.length];//boolean[]默认值FALSE
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index=(int)(Math.random()*26);//生成0--25的随机数。Math.random()--生成随机整数
			}while(flags[index]);
			chs[i]=letters[index];
			flags[index]=true;			
	/*   
	    //生成随机数组--可重复
		for(int i=0;i<chs.length;i++){
			int index=(int)(Math.random()*26);//生成0--25的随机数。Math.random()--生成随机整数
			chs[i]=letters[index];
	*/	
		}
	return chs;
	}
	//随机生成字符数组chs与用户输入字符数组input相对比得到result的方法check()
	/**
	 * @param chs 系统随机产生的字符数组
	 * @param input 用户输入的字符数组
	 * @return 字母和字母位置相同的个数组成的check数组
	 * BUG：假若系统产生的字符数组为：ASDFG
	 *     用户输入sssss
	 *     输出结果为：猜对1个字符，其中0个位置正确
	 */
	public static int[] check(char[] chs,char[] input){
		int[] result=new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[1]++;//字母相同
					if(i==j){
						result[0]++;//位置相同
					}
					break;
				}
			}
		}
		return result;
	}
	
}//class
