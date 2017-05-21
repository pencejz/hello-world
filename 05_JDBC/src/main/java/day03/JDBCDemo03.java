package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day01.DBUtil;

/**
 * 保存一个新的部门的同时，在该部门下保存一个新的员工
 * 1：输入部门的信息(deptno,dname,loc)
 * 2：输入员工名，职位，工资
 * 然后先将部门插入到dept表中，然后再将该员工信息插入到emp表中，该员工的deptno号用该部门的部门号
 * 两个表的记录主键都用序列生成:
 * seq_emp_id  seq_dept_id
 * 
 * JDBC自动返回主键机制
 */
public class JDBCDemo03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Scanner scan = new Scanner(System.in);
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);//关闭自动提交
			
			System.out.println("请输入部门名字：");
			String dname = scan.nextLine();
			System.out.println("请输入部门所在地：");
			String loc = scan.nextLine();
			
			System.out.println("请输入该部门下员工名字：");
			String ename = scan.nextLine();
			System.out.println("请输入该员工的职位：");
			String job = scan.nextLine();
			System.out.println("请输入该员工的工资：");
			int sal = Integer.parseInt(scan.nextLine());
			
			//插入部门信息
			String dSQL = " insert into dept(deptno, dname, loc) "
					    + " values(seq_dep_id.nextval, ?, ?)";
			/*
			 * Connection获取ps的重载方法允许我们传入一个字符串数组的参数
			 * 该数组中每个元素表示通过该ps插入的一条数据后要获取该记录对应字段的值
			 */
			PreparedStatement dps = conn.prepareStatement(dSQL, new String[]{"deptno"});
			dps.setString(1, dname);
			dps.setString(2, loc);
			dps.executeUpdate();
			//查看插入的记录中deptno字段的值
			ResultSet rs = dps.getGeneratedKeys();
			rs.next();
			//PreparedStatement dps = conn.prepareStatement(dSQL, new String[]{"deptno"});
			//1表示上句中的String数组中的第一个字段
			int deptno = rs.getInt(1);
			System.out.println("该部门的部门号为："+deptno);
			System.out.println("部门信息创建成功！");
			rs.close();
			dps.close();
			//插入员工信息			
			String eSQL = " insert into emp(empno, ename, job, sal, deptno) "
						+ " values(seq_emp_id.nextval, ?, ?, ?, ?)";
			PreparedStatement eps = conn.prepareStatement(eSQL);
			eps.setString(1, ename);
			eps.setString(2, job);
			eps.setInt(3, sal);
			eps.setInt(4, deptno);
			int d = eps.executeUpdate();
			if(d>0){
				System.out.println("插入完毕！");
				conn.commit();
			}else{
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.setAutoCommit(true);//打开自动提交
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			DBUtil.closeConnection(conn);
		}
	}
}
