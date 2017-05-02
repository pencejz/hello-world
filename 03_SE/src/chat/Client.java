package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
	/*
	 * 套接字 封装着TCP协议的通讯 使用它可以进行基于TCP的通讯
	 */
	private Socket socket;

	/*
	 * 构造方法，用来初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket的时候需要传入两个参数： 1、远端计算机的IP地址 2、远端计算机的端口
			 * 通过IP地址可以找到服务端的计算机，通过端口可以找到运行在该机器 上的服务端应用程序
			 * 
			 * 实例化Socket的过程就是连接远端计算机的过程， 若远端计算机没有响应，会抛出异常导致实例化失败
			 */
			System.out.println("正在连接服务端...");
			socket = new Socket("localhost",8088);
//			socket = new Socket("172.16.17.50",8088); //张涛
//			socket = new Socket("172.16.0.45",8088); //邓洪
//			socket = new Socket("172.16.17.254",8088); //吴宇
//			socket = new Socket("172.16.17.233",8089); //wuyup
//			socket = new Socket("172.16.17.35",8088);
			System.out.println("连接服务端完毕！");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 客户端开始工作的方法
	 */
	public void start() {
		try {
			//首先将读取服务端发送过的消息的线程启动起来
			ServerHandler handler=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner scan = new Scanner(System.in);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);
			//创建昵称
			String nickname = null;
			while(true){
				System.out.println("请输入昵称：");
				nickname = scan.nextLine();
				if(nickname.length()==0){
					System.out.println("请输入至少一个字符！");
					continue;
				}
				break;
			}
			//单独发送昵称
			pw.println(nickname);
			System.out.println("你好！"+nickname+"开始聊天吧！");
			String str=null;
			while(true){
				str = scan.nextLine();
				pw.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
	
	private class ServerHandler implements Runnable{
		
		public void run() {
			
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
//				BufferedReader br = new BufferedReader(
//						new InputStreamReader(
//								socket.getInputStream(), "UTF-8"));
				String message=null;
				while((message=br.readLine())!=null){
					System.out.println(message);
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}



















