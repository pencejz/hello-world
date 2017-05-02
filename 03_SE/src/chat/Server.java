package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/**
 * 聊天室服务端
 */
public class Server {
	/*
	 * java.net.ServerSocket 运行在服务端的ServerSocket负责申请服务端口，客户端就是通过
	 * 这个端口与服务端应用程序建立连接的。 ServerSocket的另一个职责就是监听该端口，一但一个客户端连接，这边就会
	 * 自动创建一个Socket，通过这个Socket就可以与刚刚连接的客户端通讯了
	 */
	private ServerSocket server;
	/*
	 * 共享集合
	 * 该集合用户存放所有客户端的输出流以便于服务端广播消息
	 */
	private List<PrintWriter> allOut;

	public Server() {
		try {
			/*
			 * 初始化ServerSocket时要指定服务端口，客户端通过该端口进行连接，
			 * 该端口号不能与操作系统其它应用程序申请的重复，否则会抛出异常
			 */
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 向共享集合中添加一个新的输出流
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out){
		allOut.add(out);
	}
	/*
	 * 将给定的集合从共享集合中删除
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out){
		allOut.remove(out);
	}
	/*
	 * 便利共享集合中的所有输出流，将给定的消息发给所有客户端
	 */
	private synchronized void sendMessage(String message){
		for(PrintWriter out : allOut){
			out.println(message);
		}
	}
	
	
	
	public void start() {
		try {
			/*
			 * 该方法是一个阻塞方法，用于一直监听服务端口（8088）, 直到一个客户端连接， 然后创建一个与该客户端通讯的Socket
			 */
			while (true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				// 启动一个线程来处理该客户端的交互
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 线程内部类
	 * 该线程负责与一个客户端进行交互
	 */
	private class ClientHandler implements Runnable {
		private Socket socket;
		//客户端的地址信息
		private String host;
		private String name;
		private String nickname; //昵称

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/*
			 * 获取远程计算机的地址信息
			 */
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
			name=address.getHostName();
		}

		public void run() {
			PrintWriter pw = null;
			try {
				//
				sendMessage(host+"("+name+")："+"上线了！");
				/*
				 * 通过Socket获取输出流，以便可以将消息发送给客户端
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				pw=new PrintWriter(osw,true);
				//将给输入流存入共享集合
				addOut(pw);
				/*
				 * Socket提供的方法： InputStream getInputStream()
				 * 该方法获取的输入流是用来读取远端计算机发送过来的数据的
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				//客户端发送的第一个字符串为昵称
				nickname = br.readLine();
				//通知所有用户上线
				sendMessage(nickname+"上线了！"+"当前在线人数"+allOut.size()+"人");
				String message = null;
				while ((message = br.readLine()) != null) {
					/*
					 * 当客户端断开连接后，由于客户端的操作系统不同，服务端的 br.readLine方法的执行结果也不同：
					 * 当windows客户端断开连接后：br.readLine方法会直接抛出异常
					 * 当linux客户端断开连接后：br.readLine方法会返回null
					 */
					//将接收到的消息输出到控制台
					System.out.println(nickname+"说：" + message);
					//将读到的话返回给客户端
//					pw.println(nickname+"说：(回你的)" + message);
					//将读到的话转发给所有客户端
					sendMessage(nickname+"说：" + message);
				}
			} catch (Exception e) {

			}finally{
				//处理客户端断开连接后的操作
				  //将给客户端的输出流从共享集合中删除
				removeOut(pw);
				sendMessage(nickname+"("+name+")："+"下线了，当前在线人数："+allOut.size()+"人"); //广播下线消息
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
