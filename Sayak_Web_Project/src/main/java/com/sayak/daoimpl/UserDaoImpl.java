package com.sayak.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sayak.dbconnection.Dbconnection;
import com.sayak.vo.ResultVO;
import com.sayak.vo.UserVO;

public class UserDaoImpl {
	
	public Connection con = null;
	public PreparedStatement ps = null;
	Dbconnection dc = new Dbconnection();
	ResultVO rvo = new ResultVO();
	boolean status = false;
	
	
	public ResultVO dataInsert(UserVO uvo) {
		try {
			String name = uvo.getName();
			String email = uvo.getEmail();
			String contact = uvo.getContact();
			String city = uvo.getCity();
			String gender = uvo.getGender();
			String password = uvo.getPassword();
			
			con = dc.dbconnect();
			
			String insertQuery = "insert into user values(DEFAULT, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(insertQuery);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setString(4, city);
			ps.setString(5, gender);
			ps.setString(6, password);
			
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rvo;
		
	}
	
	public ResultVO userDelete(UserVO uvo) {
		try {
			String email = uvo.getEmail();
			
			con = dc.dbconnect();
			
			String deleteQuery = "delete from user where email=?";
			ps = con.prepareStatement(deleteQuery);
			ps.setString(1, email);
			
			int i = ps.executeUpdate();
			if (i>0) {
				System.out.println("Data Deleted");
			}
			else {
				System.out.println("Failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rvo;
		
	}
	

	public ResultVO userUpdate(UserVO uvo) {
		try {
			String email = uvo.getEmail();
			String phn = uvo.getContact();
			
			con = dc.dbconnect();
			
			String updateQuery = "update user set contact=? where email=?";
			ps= con.prepareStatement(updateQuery);
			ps.setString(1, phn);
			ps.setString(2, email);
			
			int i = ps.executeUpdate();
			if (i>0) {
				System.out.println("Data Updated");
			}
			else {
				System.out.println("Failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return rvo;
	}
	public boolean userlogin(UserVO uvo)
	{
		try {
			
			String email = uvo.getEmail();
			String password = uvo.getPassword();
			
			con = dc.dbconnect();
			
			String loginQuery = "select * from user where email=? and password=?";
			ps = con.prepareStatement(loginQuery);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;		
	}
}
