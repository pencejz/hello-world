package day01;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * ʹ�ø���������ݿ������
 * @author sss
 *
 */
public class DBUtil {
	
	//DBCP�����ӳ�ʵ��
	private static BasicDataSource ds;
//	//������
//	private static String driverName;
//	//���ݿ��ַ
//	private static String host;
//	//�û���
//	private static String username;
//	//����
//	private static String password;
	
	//ʹ�þ�̬���ʼ��
	static{
		try {
			/**
			 * java.util.Properties
			 * ������Խ���properties�ļ���������������Map����ʽ������
			 * �������Ϊ��key = value.
			 */
			Properties prop = new Properties();
			prop.load(new FileInputStream("config.propertises"));
			String driverName = prop.getProperty("driverName");
			String host = prop.getProperty("host");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			//���������
			int maxActive = Integer.parseInt(prop.getProperty("maxActive"));
			//��ȴ�ʱ��
			long maxWait = Long.parseLong(prop.getProperty("maxWait"));
			//��ʼ�����ӳ�
			ds = new BasicDataSource();
			ds.setDriverClassName(driverName); //��������������ԭClass.forName()�е�����
			ds.setUrl(host);
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setMaxActive(maxActive); //�������������
			ds.setMaxWait(maxWait); //������ȴ�ʱ��
			System.out.println("��ʼ����ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ȡһ�����ݿ�����
	 * @return
	 * @throws ClassNotFoundException ���������쳣
	 * @throws SQLException �������ݿ��쳣
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
//		Class.forName(driverName);
//		Connection conn = DriverManager.getConnection(host,username,password);
//		return conn;
		
		/*
		 * ͨ�����ӳػ�ȡ����
		 * ���ӳصģ�Connection getConnection()��һ����������
		 * ͨ�������̷������ӳ��еĿ�������
		 * ���ǵ����ӳ���û�п�������ʱ���÷���������������ʱ���ɴ������ӳ�ʱͨ��setMaxWait()�������õ����ȴ�ʱ�����
		 * �����������п�������ʱ���÷��������̽�����������������ӷ���
		 * ����������ʱʱ��Ȼû�п������ӣ��÷������׳���ʱ�쳣
		 */
		return ds.getConnection();
	}
	/**
	 * �ر����ݿ�����
	 * @param conn
	 */
	public static void closeConnection(Connection conn){
		try {
			if(conn!= null){
				/*
				 * ��������ͨ�����ӳػ�ȡ�����ģ�������ӵ�close�����������ǽ������ӻ������ӳ��Ա�����ӻ���������
				 * �������������ݿ�Ͽ�������
				 */
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
//demo05֮��
