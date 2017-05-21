package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC java数据库连接
 * JDBC是一套标准的接口，用来规范与不同数据库的链接
 * 不同数据库提供商会提供一套实现类，并将它们打包成一个jar包，这个jar包就是针对该数据库的“驱动包”
 * 将来需要连接不同的的数据库时，就下载该数据库的驱动包
 * JDBC连接并操作该数据库需要以下类与接口：
 * DriverManager：负责加载驱动，与数据库建立连接
 * Connection：其实现类表示与数据库的连接，并通过该类创建用于执行sql语句的Statement
 * Statement：用于向数据库发送sql语句
 * ResultSet：若Statement执行的是DQL，那么会获取查询结果集
 *            ResultSet用来表示查询的结果集，通过该类可以遍历结果集
 */
public class JDBCDemo01 {

	public static void main(String[] args) {
		try {
			/**
			 * 连接数据库的步骤:
			 * 1.加载驱动Class.forName(...)
			 * 2.建立连接 DriveManager
			 * 3.创建Statement
			 * 4.执行SQL
			 * 5.若有结果集，遍历结果集ResultSet
			 * 6.通过Statement继续其他数据库操作
			 * 7.与数据库断开连接
			 */
			//1  不同数据库，字符串参数内容不同
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 * 2
			 * DriverManager的静态方法getConnection用来与数据库建立连接，需要传入3个参数
			 * 参数1：数据库地址（不同数据库格式不同）
			 * 参数2：数据库用户名
			 * 参数3：数据库密码
			 */
			Connection conn = DriverManager.getConnection(
				   //----------------服务器地址(主机名) 端口号   SID  用户名        密码
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("与数据库建立连接！");
			//3
			Statement state = conn.createStatement();
			/*
			 * 4
			 * Statement提供了针对不同种类SQL的执行方法：
			 * 
			 * boolean excute(String sql) 可以执行所有类型的SQL，但常用来执行DDL
			 * 返回值为true表示该SQL执行后有查询的结果集，所以，只有执行DQL后才会返回true
			 *   
			 * int executeUpdate(String sql) 专门用来执行DML事务语句
			 * 返回值为影响了数据库指定表的记录数
			 * 
			 * ResultSet executeQuery(String sql) 专门用来执行DQL语句
			 * 返回值为查询出来的结果集
			 */
			String sql = "select empno,ename,job,salary from emp";
			ResultSet rs = state.executeQuery(sql);
			/*
			 * 5
			 * 遍历查询结果集ResultSet
			 * ResultSet提供了遍历查询结果集的相关方法:
			 * 
			 * 1:boolean next() 使当前结果集指针向下一条记录
			 * 若有下一条记录，则返回true，并表示该条记录，没有则返回false
			 * 
			 * 2:String getString(String colName) 用于获取指定字段值
			 *   int getInt(String colName)
			 *   ...
			 * 以上方法是获取指定字段对应的值，具体调用那个方法看该字段的数据类型而定
			 */
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("salary");
				System.out.println(empno+","+ename+","+job+","+sal);
			}
			//7
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
	
}








