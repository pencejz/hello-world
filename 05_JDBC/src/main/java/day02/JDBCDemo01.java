package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day01.DBUtil;

/**
 * Statement���������ִ�о�̬SQL��䣬��˼�Ǹ�SQL�������κζ�̬ƴ�ӵ����ݡ�
 * ��Ϊ������������⣺
 * 1.ִ��Ч�ʲ�
 * 2.����SQLע�빥����Σ��
 * 
 * ִ�к��ж�̬���ݵ�SQL��䣬Ӧ��ʹ�ã�PreparedStatement����������������������
 * ������ִ����ͬ�����SQL��䣬�������е�ֵ�б仯ʱ��ʹ��StatementЧ�ʲ���PreparedStatement
 * ���磺
 * ��userinfo�����100������ʱ��ÿ�������и����ֶε�ֵ��ͬ
 * ����Statement���Ƚ�SQL�����java�����ƴ�Ӻú��ٽ���SQL���͸����ݿ�
 * ��ô���ݿ�ᷢ��ÿ��insert������ݶ�����ȫһ������ô�ᵱ��ȫ�µ�SQL���ȥִ��
 * ��ʱ���ݿ��Ϊÿ��SQL�������һ��ȫ�µ�ִ�мƻ�����ʱ����Դ��
 * PreparedStatement�ڴ���ʱ��Ҫ����Ԥ����SQL
 * ���ԣ�ʵ�ֽ�insert��䴫������ݿ⣬��ô���ݿ�Ϊ������һ��ִ�мƻ����������ڸ�SQL���С�����
 * ���Ը�ִ�мƻ���ȱ�����ݣ���ôpsʵ����ÿ��ֻ��Ҫ����������Ӧ��ֵ����һ��
 * Ȼ�����ݿ�ͻ�ʹ�ø�ִ�мƻ�ִ��һ��
 * Ϊ�ˣ����ݿⲻ��Ϊÿ���û�������һ��ִ�мƻ���
 */
public class JDBCDemo01 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			/*
			 * ��userinfo���в�������
			 * ���ڲ�����������û����룬���Ծ͵��¿��ܻ���ƴ��DQL���Ĳ���
			 * ��ʱ��Ӧ��ʹ��PreparedStatement��ִ��Ԥ����DQL���
			 * Ԥ����SQL����ǽ���̬��Ϣ���ԡ��������棬��ȷ��SQL����
			 */
			String sql = " insert into userinfo(id,username,password,email,account) "
					   + " values(seq_userinfo_id.nextval, ?, ?, ?, ?) ";
			/*
			 * ����PSʱҪ��Ԥ����SQL��䴫��
			 * �ڴ���ʱ���Ѿ��������Ԥ����SQL���͸����ݿ���
			 * ��ΪԤ����SQLû���κζ�̬���ݵ�ƴ�ӣ��������岻�����κθı�
			 * ��Ϊ�������Ĵ��ڣ�ʹ�ø�SQL������ִ�У����ݿ�ȴ�����������Ӧ��ֵ���ݹ�ȥ��Ż�ִ��
			 */
			PreparedStatement ps = conn.prepareStatement(sql);
			/*
			 * ��ִ��֮ǰSQL֮ǰ��Ҫ��ָ���á�������Ӧ��ֵ
			 * void setXXXX(�ʺ�λ�ã��ʺ�ֵ) ָ���ʺ�ֵ
			 */
			for(int i=0;i<100;i++){
				ps.setString(1, "user"+i);
				ps.setString(2, "123456");
				ps.setString(3, "user"+i+"@tedu.com");
				ps.setInt(4, 50000);
				int n = ps.executeUpdate(); //ִ��SQL  ��ʱ���ڴ���SQL����Ϊ��֮ǰ�Ѿ��������
				if(n>0){
					System.out.println("������ϣ�");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		
	}//main
}






















