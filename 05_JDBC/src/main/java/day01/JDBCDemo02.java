package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * ִ��DML���
 */
public class JDBCDemo02 {

	public static void main(String[] args) {
		try {
			//�û�������������
			Scanner scan = new Scanner(System.in);
			System.out.println("������Ա����ţ�");
			int empno = scan.nextInt();
			System.out.println("������Ա��������");
			String ename = scan.next();
			System.out.println("������Ա��ְλ��");
			String job = scan.next();
			System.out.println("������Ա�����ʣ�");
			int sal = scan.nextInt();
			scan.close();
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("�����ݿ⽨�����ӣ�");
			//3
			Statement state = conn.createStatement();
			//4
			String sql = "insert into emp(empno,ename,job,salary) "
			             +"values"
//					     +"(1212,'JACKSON','CLERK',3500)";
					     +"("+empno+",'"+ename+"','"+job+"',"+sal+")";
			int i = state.executeUpdate(sql);
			if(i>0){
				System.out.println("������ϣ�");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}
