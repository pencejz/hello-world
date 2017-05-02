package day11;

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
 * �����ҷ����
 * TCPͨѶ�ķ����
 */
public class Server {
	/*
	 * ServerSocket�������ڷ���˵�Socket
	 * ����������:
	 * 		1:�������˿ڣ��ͻ��˾���ͨ���ö˿����ӵ�����˵�
	 * 		2:��������ķ���˿ڣ�һ���ͻ������Ӻ󣬾ʹ���һ��Socketʵ����ÿͻ��˽�����  
	 */
	private ServerSocket server;
	private List<PrintWriter> allOut;	// ��������пͻ���������Ĺ�����
	
	/**
	 * ���췽����������ʼ�������
	 * @throws Exception
	 */
	public Server() throws Exception{
		try {
			//��ʼ��ServerSocket��ָ������˿ڸö˿ڲ���������Ӧ�ó����ͻ��������׳��쳣
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			throw e;
		}
	}
	/**
	 * ����������Ӹ����Ŀͻ��˵������
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out){
		allOut.add(out);
	}
	/**
	 * �������Ŀͻ��˵�������ӹ�������ɾ��
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out){
		allOut.remove(out);
	}
	/**
	 * ����������Ϣ���͸����пͻ���
	 * @param message
	 */
	private synchronized void sendMessage(String message){
		for(PrintWriter out : allOut){
			out.println(message);
		}
	}
	
	
	
	/**
	 * ����˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			/*
			 * Socket accept()
			 * ServerSocket�ṩ��accept�������÷������ڼ�������ķ���˿ڣ�ֱ�� һ���ͻ������ӣ�Ȼ�󷵻�һ��Socket
			 * ʵ��������ÿͻ���ͨѶ��
			 * ���������һ������������ֱ���ͻ������ӷ��ؼ�������ִ�С�
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
				
				//�������ڽ��տͻ�����Ϣ���߳�
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
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
	 * ���̵߳������Ǹ�����ָ���Ŀͻ��˽��н���
	 * @author Administrator
	 *
	 */
	class ClientHandler implements Runnable{
		/*
		 * ��ǰ�߳�ͨ����socket��ָ���ͻ��˽���
		 */
		private Socket socket;
		private String host;	//�ͻ��˵�ַ��Ϣ
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			//ͨ��Socket���Ի�ȡԶ�̼������ַ��Ϣ�����ڷ������߶��ԣ�Զ�̼�������ͻ���
			InetAddress address = socket.getInetAddress();
			//��ȡIP��ַ���ַ�����ʽ
			host = address.getHostAddress();
		}
		public void run(){
			PrintWriter pw = null;
			try {
				//֪ͨ���пͻ��˸��û�����
				sendMessage("["+host+"]������!");
				
				/*
				 * ͨ��Socket��ȡ����������ڽ���Ϣ���͸��ͻ���
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
				//���ÿͻ��˵���������빲����
				addOut(pw);
				
				/*
				 * InputStream getInputStream()
				 * Socket�ṩ�ĸ÷���������ȡһ����������ͨ�������������Զ�ȡԶ�˼�������͹��������ݡ�
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				//��ȡ�ͻ��˷��͹�������Ϣ
				String message = null;
				/*
				 * ����˽��տͻ��˷��͹�������Ϣʱ�����ڿͻ��˲���ϵͳ��ͬ����ô���ͻ��˶Ͽ�����ʱ��Ч��Ҳ����ͬ:
				 * 		��windows�Ŀͻ��˶Ͽ����Ӻ�br.readLine�������׳��쳣
				 * 		��linux�Ŀͻ��˶Ͽ����Ӻ�br.readLine�᷵��null
				 */
				while((message = br.readLine())!=null){
//					System.out.println(host+"˵:"+message);	
//					pw.println(host+"˵:"+message);
					sendMessage(host+"˵:"+message);
				}
				
				
			} catch (Exception e) {
				
			} finally{
				/*
				 * �ͻ��������˶Ͽ���
				 */				
				try {
					//���ÿͻ��˵�������ӹ�������ɾ��
					removeOut(pw);
					//֪ͨ���пͻ��˸��û�����
					sendMessage("["+host+"]������!");
					/*
					 * ͨѶ��Ϻ�Ӧ����socket�رգ����ͷŵײ���Դ��
					 */
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}






