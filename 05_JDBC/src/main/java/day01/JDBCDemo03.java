package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 使用JDBC执行DDL
 * 创建一张表userinfo
 * 字段：
 * id number(6)
 * username varchar2(30)
 * password varchar2(30)
 * email varchar(60)
 * account number(8)
 */
public class JDBCDemo03 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("与数据库连接成功！");
			Statement state = conn.createStatement();
			String sql = "create table userinfo("
			                     +" id number(6), "
					             +" username varchar2(30), "
			                     +" password varchar2(30), "
					             +" email varchar2(60), "
			                     +" account number(8) "
					             +")";
			boolean b = state.execute(sql);
			System.out.println("是否创建成功："+b);
			System.out.println("创建表完毕！");
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
