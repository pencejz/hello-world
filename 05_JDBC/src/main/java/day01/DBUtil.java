package day01;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 使用该类管理数据库的连接
 * @author sss
 *
 */
public class DBUtil {
	
	//DBCP的连接池实例
	private static BasicDataSource ds;
//	//驱动名
//	private static String driverName;
//	//数据库地址
//	private static String host;
//	//用户名
//	private static String username;
//	//密码
//	private static String password;
	
	//使用静态块初始化
	static{
		try {
			/**
			 * java.util.Properties
			 * 该类可以解析properties文件，并将内容类似Map的形式给我们
			 * 可以理解为：key = value.
			 */
			Properties prop = new Properties();
			prop.load(new FileInputStream("config.propertises"));
			String driverName = prop.getProperty("driverName");
			String host = prop.getProperty("host");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			//最大连接数
			int maxActive = Integer.parseInt(prop.getProperty("maxActive"));
			//最长等待时间
			long maxWait = Long.parseLong(prop.getProperty("maxWait"));
			//初始化连接池
			ds = new BasicDataSource();
			ds.setDriverClassName(driverName); //设置驱动类名，原Class.forName()中的内容
			ds.setUrl(host);
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setMaxActive(maxActive); //设置最大连接数
			ds.setMaxWait(maxWait); //设置最长等待时间
			System.out.println("初始化完毕！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取一个数据库连接
	 * @return
	 * @throws ClassNotFoundException 加载驱动异常
	 * @throws SQLException 连接数据库异常
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
//		Class.forName(driverName);
//		Connection conn = DriverManager.getConnection(host,username,password);
//		return conn;
		
		/*
		 * 通过连接池获取连接
		 * 连接池的：Connection getConnection()是一个阻塞方法
		 * 通常会立刻返回连接池中的可用连接
		 * 但是当连接池中没有可用连接时，该方法会阻塞，阻塞时间由创建连接池时通过setMaxWait()方法设置的最大等待时间决定
		 * 当阻塞期内有可用连接时，该方法会立刻解除阻塞并将可用连接返回
		 * 若有阻塞超时时仍然没有可用连接，该方法会抛出超时异常
		 */
		return ds.getConnection();
	}
	/**
	 * 关闭数据库连接
	 * @param conn
	 */
	public static void closeConnection(Connection conn){
		try {
			if(conn!= null){
				/*
				 * 该链接是通过连接池获取回来的，这个链接的close方法的作用是将该连接还给连接池以便该链接还可以重用
				 * 而并不是与数据库断开了链接
				 */
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
//demo05之后
