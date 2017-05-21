package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC java���ݿ�����
 * JDBC��һ�ױ�׼�Ľӿڣ������淶�벻ͬ���ݿ������
 * ��ͬ���ݿ��ṩ�̻��ṩһ��ʵ���࣬�������Ǵ����һ��jar�������jar��������Ը����ݿ�ġ���������
 * ������Ҫ���Ӳ�ͬ�ĵ����ݿ�ʱ�������ظ����ݿ��������
 * JDBC���Ӳ����������ݿ���Ҫ��������ӿڣ�
 * DriverManager��������������������ݿ⽨������
 * Connection����ʵ�����ʾ�����ݿ�����ӣ���ͨ�����ഴ������ִ��sql����Statement
 * Statement�����������ݿⷢ��sql���
 * ResultSet����Statementִ�е���DQL����ô���ȡ��ѯ�����
 *            ResultSet������ʾ��ѯ�Ľ������ͨ��������Ա��������
 */
public class JDBCDemo01 {

	public static void main(String[] args) {
		try {
			/**
			 * �������ݿ�Ĳ���:
			 * 1.��������Class.forName(...)
			 * 2.�������� DriveManager
			 * 3.����Statement
			 * 4.ִ��SQL
			 * 5.���н���������������ResultSet
			 * 6.ͨ��Statement�����������ݿ����
			 * 7.�����ݿ�Ͽ�����
			 */
			//1  ��ͬ���ݿ⣬�ַ����������ݲ�ͬ
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 * 2
			 * DriverManager�ľ�̬����getConnection���������ݿ⽨�����ӣ���Ҫ����3������
			 * ����1�����ݿ��ַ����ͬ���ݿ��ʽ��ͬ��
			 * ����2�����ݿ��û���
			 * ����3�����ݿ�����
			 */
			Connection conn = DriverManager.getConnection(
				   //----------------��������ַ(������) �˿ں�   SID  �û���        ����
					"jdbc:oracle:thin:@localhost:1521:xe","pjz","123456");
			System.out.println("�����ݿ⽨�����ӣ�");
			//3
			Statement state = conn.createStatement();
			/*
			 * 4
			 * Statement�ṩ����Բ�ͬ����SQL��ִ�з�����
			 * 
			 * boolean excute(String sql) ����ִ���������͵�SQL����������ִ��DDL
			 * ����ֵΪtrue��ʾ��SQLִ�к��в�ѯ�Ľ���������ԣ�ֻ��ִ��DQL��Ż᷵��true
			 *   
			 * int executeUpdate(String sql) ר������ִ��DML�������
			 * ����ֵΪӰ�������ݿ�ָ����ļ�¼��
			 * 
			 * ResultSet executeQuery(String sql) ר������ִ��DQL���
			 * ����ֵΪ��ѯ�����Ľ����
			 */
			String sql = "select empno,ename,job,salary from emp";
			ResultSet rs = state.executeQuery(sql);
			/*
			 * 5
			 * ������ѯ�����ResultSet
			 * ResultSet�ṩ�˱�����ѯ���������ط���:
			 * 
			 * 1:boolean next() ʹ��ǰ�����ָ������һ����¼
			 * ������һ����¼���򷵻�true������ʾ������¼��û���򷵻�false
			 * 
			 * 2:String getString(String colName) ���ڻ�ȡָ���ֶ�ֵ
			 *   int getInt(String colName)
			 *   ...
			 * ���Ϸ����ǻ�ȡָ���ֶζ�Ӧ��ֵ����������Ǹ����������ֶε��������Ͷ���
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








