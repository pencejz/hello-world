package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day01.DBUtil;

/**
 * ����һ���µĲ��ŵ�ͬʱ���ڸò����±���һ���µ�Ա��
 * 1�����벿�ŵ���Ϣ(deptno,dname,loc)
 * 2������Ա������ְλ������
 * Ȼ���Ƚ����Ų��뵽dept���У�Ȼ���ٽ���Ա����Ϣ���뵽emp���У���Ա����deptno���øò��ŵĲ��ź�
 * ������ļ�¼����������������:
 * seq_emp_id  seq_dept_id
 * 
 * JDBC�Զ�������������
 */
public class JDBCDemo03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Scanner scan = new Scanner(System.in);
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);//�ر��Զ��ύ
			
			System.out.println("�����벿�����֣�");
			String dname = scan.nextLine();
			System.out.println("�����벿�����ڵأ�");
			String loc = scan.nextLine();
			
			System.out.println("������ò�����Ա�����֣�");
			String ename = scan.nextLine();
			System.out.println("�������Ա����ְλ��");
			String job = scan.nextLine();
			System.out.println("�������Ա���Ĺ��ʣ�");
			int sal = Integer.parseInt(scan.nextLine());
			
			//���벿����Ϣ
			String dSQL = " insert into dept(deptno, dname, loc) "
					    + " values(seq_dep_id.nextval, ?, ?)";
			/*
			 * Connection��ȡps�����ط����������Ǵ���һ���ַ�������Ĳ���
			 * ��������ÿ��Ԫ�ر�ʾͨ����ps�����һ�����ݺ�Ҫ��ȡ�ü�¼��Ӧ�ֶε�ֵ
			 */
			PreparedStatement dps = conn.prepareStatement(dSQL, new String[]{"deptno"});
			dps.setString(1, dname);
			dps.setString(2, loc);
			dps.executeUpdate();
			//�鿴����ļ�¼��deptno�ֶε�ֵ
			ResultSet rs = dps.getGeneratedKeys();
			rs.next();
			//PreparedStatement dps = conn.prepareStatement(dSQL, new String[]{"deptno"});
			//1��ʾ�Ͼ��е�String�����еĵ�һ���ֶ�
			int deptno = rs.getInt(1);
			System.out.println("�ò��ŵĲ��ź�Ϊ��"+deptno);
			System.out.println("������Ϣ�����ɹ���");
			rs.close();
			dps.close();
			//����Ա����Ϣ			
			String eSQL = " insert into emp(empno, ename, job, sal, deptno) "
						+ " values(seq_emp_id.nextval, ?, ?, ?, ?)";
			PreparedStatement eps = conn.prepareStatement(eSQL);
			eps.setString(1, ename);
			eps.setString(2, job);
			eps.setInt(3, sal);
			eps.setInt(4, deptno);
			int d = eps.executeUpdate();
			if(d>0){
				System.out.println("������ϣ�");
				conn.commit();
			}else{
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.setAutoCommit(true);//���Զ��ύ
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			DBUtil.closeConnection(conn);
		}
	}
}
