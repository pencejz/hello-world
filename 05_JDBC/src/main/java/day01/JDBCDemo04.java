package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * ��������seq_userinfo_id
 */
public class JDBCDemo04 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("�ɹ��������ݿ⣡");
			Statement state = conn.createStatement();
			String sql = "CREATE SEQUENCE seq_userinfo_id "
                          +" START WITH 1 "
                          +" INCREMENT BY 1 ";
			state.execute(sql);
			System.out.println("���д�����ϣ�");
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
