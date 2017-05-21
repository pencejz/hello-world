package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 执行DML语句
 */
public class JDBCDemo02 {

	public static void main(String[] args) {
		try {
			//用户输入所有内容
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入员工编号：");
			int empno = scan.nextInt();
			System.out.println("请输入员工姓名：");
			String ename = scan.next();
			System.out.println("请输入员工职位：");
			String job = scan.next();
			System.out.println("请输入员工工资：");
			int sal = scan.nextInt();
			scan.close();
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("与数据库建立连接！");
			//3
			Statement state = conn.createStatement();
			//4
			String sql = "insert into emp(empno,ename,job,salary) "
			             +"values"
//					     +"(1212,'JACKSON','CLERK',3500)";
					     +"("+empno+",'"+ename+"','"+job+"',"+sal+")";
			int i = state.executeUpdate(sql);
			if(i>0){
				System.out.println("插入完毕！");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}
