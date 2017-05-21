package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * ����Ҫ���û�����ÿҳ��ʾ����Ŀ��������ҳ�����鿴��Ӧҳ����Ӧ��emp����Ϣ
 * �鿴empno,ename,job,sal,deptno�ֶ�
 */
public class JDBCDemo05 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("������ÿҳ��ʾ����Ŀ����");
			int pageSize = Integer.parseInt(scan.next());
			System.out.println("������Ҫ��ʾ��ҳ����");
			int page = Integer.parseInt(scan.next());
			int start = (page-1)*pageSize+1; //ÿһҳ�Ŀ�ʼ��Ŀ��
			int end = page*pageSize; //ÿһҳ�Ľ�����Ŀ��
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("�ɹ��������ݿ⣡");
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
