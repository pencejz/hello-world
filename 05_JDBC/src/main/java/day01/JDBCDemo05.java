package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 首先要求用户输入每页显示的条目数在输入页数，查看相应页数对应的emp表信息
 * 查看empno,ename,job,sal,deptno字段
 */
public class JDBCDemo05 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入每页显示的条目数：");
			int pageSize = Integer.parseInt(scan.next());
			System.out.println("请输入要显示的页数：");
			int page = Integer.parseInt(scan.next());
			int start = (page-1)*pageSize+1; //每一页的开始条目数
			int end = page*pageSize; //每一页的结束条目数
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("成功连接数据库！");
			Statement state = conn.createStatement();
			/*
			 * select * 
			 * from(select rownum rn,t.* 
			 *      from(select empno,ename,job,sal,deptno 
			 *           from(emp_pjz) 
			 *           order by sal desc) t 
			 *      where rownum <=end) 
			 * where rn>=start 
			 */
			String sql = "select * "
			           + "from(select rownum rn,t.* "
					   + "     from(select empno,ename,job,sal,deptno "
			           + "          from(emp_pjz) "
					   + "          order by sal desc) t "
			           + "     where rownum <="+end+") "
			           + "where rn>="+start;
			ResultSet rs = state.executeQuery(sql);
			while(rs.next()){
				int rownum = rs.getInt("rn");
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				System.out.println(rownum+","+empno+","+ename+","+job+","+sal+","+deptno);
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //mian
	
}
