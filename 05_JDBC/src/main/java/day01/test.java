package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 用户管理系统
 * 程序启动后，要求用户输入操作序号：
 * 1 表示新注册用户
 * 2 表示登录
 * 3 查询登录用户的余额
 * 4 修改密码
 * 5 转账
 * 6 登出
 * @author sss
 * @version 1.0
 *
 */
public class test {
	
	public static int id = -1; //用户登录id
	public static int account = 50000; //余额
	static Connection conn; //用于连接数据库
	static Statement state; //用于与数据库之间的通信
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			//获取数据库
			conn = DBUtil.getConnection();
			//创建Statement，向数据库发送SQL语句
			 state = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int input = 0;
		while(true){
			System.out.println("     1-注册");
			System.out.println("     2-登录");
			System.out.println("     3-查询余额");
			System.out.println("     4-修改密码");
			System.out.println("     5-转账");
			System.out.println("     6-登出");
			System.out.print("请选择功能：");
			input = scan.nextInt();
			switch(input){
			case 1: reg(); break;
			case 2: login(); break;
			case 3: showAccount(); break;
			case 4: modifyPWD(); break;
			case 5: transferOfAccount(); break;
			case 6: logout(); break;
			default:
				System.out.print("请重新选择功能:");
			}
		}
		
	}//main
	
	/*
	 * 注册
	 * 要求用户输入：用户名，密码，邮箱
	 * 插入userinfo表
	 * id由序列：seq_userinfo_pjz_id生成
	 * 注册用户初始余额：50000
	 */
	public static void reg(){
		System.out.println("欢迎注册！！！");
		System.out.println("请输入你的名字:");
		//判断是否已经存在该名字？？？？？
		
		String name = scan.next();
		System.out.println("请输入你的密码：");
		String pwd = scan.next();
		//密码验证
		while(true){
			System.out.println("请再次输入密码：");
			if(scan.next().equals(pwd)){
				break;
			}else{
				System.out.println("两次输入的密码不一致！请重新输入密码：");
				pwd = scan.next();
			}
		}
		System.out.println("请输入你的邮箱：");
		String eml = scan.next();
		//使用正则表达式验证邮箱
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		boolean tf = eml.matches(regex);
		while(true){
			if(tf){
				break;
			}else{
				System.out.println("请输入一个正确的邮箱！");
				eml = scan.next();
			}
		}
		try {
			//执行SQL语句
			String sql = " INSERT INTO userinfo_pjz(ID,username,PASSWORD,email,ACCOUNT) "
                       + " VALUES(seq_userinfo_pjz_id.NEXTVAL, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			ps.setString(3, eml);
			ps.setInt(4, 50000);
			int d = ps.executeUpdate(); //执行sql语句
			if(d>0){
				System.out.println("恭喜你，"+name+"注册成功！请登录！");
				login();
			}else{
				System.out.println("注册失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 登录
	 * 要求用户输入：用户名，密码
	 * 都输入正确，显示：欢迎你:xxxx
	 * 登录失败显示：用户名或密码错误
	 */
	public static void login(){
		System.out.println("欢迎登录！");
		System.out.println("请输入你的名字:");
		String name = scan.next();
		System.out.println("请输入你的密码：");
		String pwd = scan.next();
		try {
			//连接数据库并进行操作
			String sql = " SELECT id,username,PASSWORD "
                       + " from userinfo_pjz "
                       + " where username=? and password=? ";
			PreparedStatement ps = conn.prepareStatement(sql); //预连接
			ps.setString(1, name); //传入问号值
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery(); //执行sql语句
			if(rs.next()){
				id = rs.getInt("id");
				System.out.println("登录成功！欢迎你："+name);
			}else{
				System.out.println("用户名或密码错误！请重新登录：");
				login();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 查余额
	 * 若该用户已经执行过登录操作，并成功，那么查询并显示该用户余额
	 * 若没有登录过，则显示需要用户先登录
	 */
	public static void showAccount(){
		if(id==-1){
			System.out.println("请先登录:");
			login();
		}
		try {
			//查余额
			String sql = " SELECT id, username, account "
                       + " from userinfo_pjz "
                       + " where id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				int account = rs.getInt("account");
				String username = rs.getString("username");
				System.out.println("你好"+username+"，你的余额为："+account);
			}else{
				account = 0;
				System.out.println("你的余额为："+account);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 修改密码
	 * 若用户已经登录，直接要求用户输入新的密码并修改该用户密码
	 * 否则要求用户先登录
	 */
	public static void modifyPWD(){
		String newPWD = null;
		try {
			if(id==-1){
				System.out.println("请先登录:");
				login();
			}else{
				System.out.println("请输入旧密码：");
				String oldPWD = scan.next();
				//验证旧密码
				String sql = " select password "
						   + " from userinfo_pjz "
						   + " where id=? "
						   + " and password=? ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, oldPWD);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){ //验证成功
					System.out.println("请输入新密码：");
					newPWD = scan.next();
					while(true){
						System.out.println("请再次输入密码：");
						if(scan.next().equals(newPWD)){
							break;
						}else{
							System.out.println("两次输入的密码不一致！请重新输入密码：");
							newPWD = scan.next();
						}
					}
				}
			}
			//修改密码
			String sql = " update userinfo_pjz "
                       + " set password=? "
                       + " where id=? ";
			PreparedStatement ps1 = conn.prepareStatement(sql);
			ps1.setString(1, newPWD);
			ps1.setInt(2, id);
			int d = ps1.executeUpdate();
			if(d>0){
				System.out.println("密码修改成功！");
			}else{
				System.out.println("密码修改失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 转账
	 * 1要求登录
	 * 2要求输入转入账号名字，再输入转账金额，并完成转账操作
	 * 注：转出的金额不能不大于当前登录用户的余额
	 * 使用PreparedStatement实现
	 */
	public static void transferOfAccount(){
		try {
			if(id==-1){
				System.out.println("请登录：");
				login();
			}else{
				while(true){
					System.out.println("请输入要转入的账号：");
					String friendName = scan.next();
					//判断是否存在该账户，若存在，就取出该账户的现有金额
					String sql = " SELECT id, username, account "
		                       + " from userinfo_pjz "
		                       + " where username=? ";
					PreparedStatement ps = conn.prepareStatement(sql); //预连接
					ps.setString(1, friendName); //传入问号值
					ResultSet rs = ps.executeQuery(); //执行sql语句
					int friendAccount; //表示转入账户的金额
					
					if(!rs.next()){ //账户不存在
						System.out.println("你输入的账户不存在，请重新输入！");
						//重新输入账户
						transferOfAccount();
						
					}else{ //账户存在
						while(true){
							friendAccount = rs.getInt("account"); //获取转入账户的金额
							System.out.println("请输入要转入的金额：");
							int moveAccount = scan.nextInt();
							/*获取自己的金额相减，判断是否大于0，若是则完成转账，不是则余额不足*/
							//连接数据库并进行转账
							sql = " SELECT id, account "
								+ " from userinfo_pjz "
								+ " where id=? ";
							ps = conn.prepareStatement(sql); //预连接
							ps.setInt(1, id); //传入问号值
							rs = ps.executeQuery(); //执行sql语句
							rs.next();
							int myAccount = rs.getInt("account"); //获取我现有的金额
							int bal = myAccount-moveAccount; //我转账后的余额
							if(bal<0){
								System.out.println("余额不足，转账失败！");
								//请重新输入金额
								continue;
							}else{ //余额足够
								//自己的金额减少
								sql = " update userinfo_pjz "
									+ " set account=? "
									+ " where id=? ";
								ps = conn.prepareStatement(sql);
								ps.setInt(1, bal);
								ps.setInt(2, id);
								rs = ps.executeQuery();
								//转入账号金额增加
								sql = " update userinfo_pjz "
									+ " set account=? "
									+ " where username=? ";
								ps = conn.prepareStatement(sql);
								ps.setInt(1, moveAccount+friendAccount);
								ps.setString(2, friendName);
								rs = ps.executeQuery();
								//转账成功
								System.out.println("转账成功！你还剩余"+bal+"元");
								break;
							}
						}
					}
				}

				
			}//已登录
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//登出
	public static void logout(){
		if(id!=-1){
			id=-1;
		}
		System.out.println("你已经退出！再见！");
	}
	
}

/**
 * 创建用户功能问题
 * 报错类型：java.sql.SQLException: 索引中丢失  IN 或 OUT 参数:: 4
 * 报错位置：ps.setInt(1, 50000);
 * 解决：改为ps.setInt(4, 50000);
 */

/**
 * 余额查询时报错
 * java.sql.SQLException: 未调用 ResultSet.next
 * 解决：将 int account = rs.getInt("account");
 * 	    String username = rs.getString("username");
 *       这两句放到下面的if语句中
 */

/**
 * 转账功能模块
 * 问题：在输入转入账户时报错
 * 报错位置：friendAccount = rs.getInt(account);
 * 报错类型：java.sql.SQLException: 无效的列索引
 * 解决：friendAccount = rs.getInt("account");
 */


