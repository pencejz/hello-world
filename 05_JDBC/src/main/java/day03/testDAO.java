package day03;
//使用day01中test修改

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day01.DBUtil;
import day03.UserInfoDAO;

/**
 * 用户管理系统
 * 程序启动后，要求用户输入操作序号：
 * 1 表示新注册用户
 * 2 表示登录
 * 3 查询登录用户的余额
 * 4 修改密码
 * 5 转账
 * 6 登出
 */
public class testDAO {
	
	public static UserInfo userInfo = null; //用户对象
	public static UserInfoDAO userInfoDAO = new UserInfoDAO(); //UserInfoDAO类中定义了操作数据库的方法
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
	 * id由序列：seq_userinfo_id生成
	 * 注册用户初始余额：50000
	 */
	public static void reg(){
		System.out.println("欢迎注册！！！");
		System.out.println("请输入你的名字:");
		//判断是否已经存在该名字？？？？
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
		//开始注册
		userInfo = new UserInfo();
		userInfo.setUsername(name);
		userInfo.setPassword(pwd);
		userInfo.setEmail(eml);
		userInfo.setAccount(50000);
		//保存数据工作交给DAO
		if(userInfoDAO.save(userInfo)){
			System.out.println("恭喜你，"+name+"注册成功！请登录！");
			login();
		}else{
			System.out.println("注册失败！");
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
		//连接数据库并进行操作
		userInfo = new UserInfo();
		userInfo.setUsername(name);
		userInfo.setPassword(pwd);
		userInfo = userInfoDAO.findByNameAndPwd(name, pwd);
		if(userInfo!=null){
			System.out.println("登录成功！欢迎你："+name);
		}else{
			System.out.println("用户名或密码错误！请重新登录：");
			login();
		}
	}
	
	/*
	 * 查余额
	 * 若该用户已经执行过登录操作，并成功，那么查询并显示该用户余额
	 * 若没有登录过，则显示需要用户先登录
	 */
	public static void showAccount(){
		
		try {
			if(userInfo==null){
				System.out.println("请先登录:");
				login();
			}
			//查余额
			userInfo=userInfoDAO.findAccount(userInfo.getId());
			if(userInfo!=null){
				System.out.println("你好"+userInfo.getUsername()+"，你的余额为："+userInfo.getAccount());
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
			if(userInfo==null){
				System.out.println("请先登录:");
				login();
			}else{
				for(int i=0;i<3;i++){
					System.out.println("请输入旧密码：");
					String oldPWD = scan.next();
					System.out.println(1);
					//验证旧密码
					if(oldPWD.equals(userInfo.getPassword())){
						System.out.println("请输入新密码：");
						newPWD = scan.next();
						while(true){ //验证新密码
							System.out.println("请再次输入密码：");
							if(scan.next().equals(newPWD)){
								break;
							}else{
								System.out.println("两次输入的密码不一致！请重新输入密码：");
								newPWD = scan.next();
							}
						}
						//修改密码并保存到数据库
						userInfo.setPassword(newPWD);
						boolean b = userInfoDAO.update(userInfo);
						if(b){
							System.out.println("密码修改成功！");
						}else{
							System.out.println("密码修改失败！");
						}
					}else{
						System.out.println("旧密码输入错误！请重新输入！(你还有"+(2-i)+"次输入机会)");
						continue;
					}
				}
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
			if(userInfo==null){
				System.out.println("请登录：");
				login();
			}else{
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入转入账号的用户名:");
				String inName = scanner.nextLine();
				System.out.println("请输入转账金额:");
				int money = Integer.parseInt(scanner.nextLine());
				//判断余额
				userInfo=userInfoDAO.findAccount(userInfo.getId());
				int account=userInfo.getAccount();
				if(userInfo!=null){
					if(account<money){
						System.out.println("您的账户余额不足，当前余额为:"+account);
					}else{
						//开始转账
						//修改转入账号余额
						if(userInfoDAO.moveAccount(inName, money)){
							System.out.println("转入金额成功!");
							//修改转出账号余额
							if(userInfoDAO.moveAccount(userInfo.getUsername(), -money)){
								System.out.println("转账完毕!");
							}else{
								System.out.println("转账失败!");
							}
							
						}else{
							System.out.println("转入金额失败!");
						}					
					}
				}else{
					System.out.println("账号异常!");
				}			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConnection(conn);
		}
	}
	
	//登出
	public static void logout(){
		if(userInfo==null){
			System.out.println("你好没有登录过哦！");
		}else{
			userInfo=null;
			System.out.println("你已经登出！再见！");
		}
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


