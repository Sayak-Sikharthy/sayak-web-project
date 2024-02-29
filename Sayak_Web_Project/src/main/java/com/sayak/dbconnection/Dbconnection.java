package com.sayak.dbconnection;
import java.sql.DriverManager;
import java.sql.Connection;

//import com.mysql.jdbc.Connection;

public class Dbconnection {
	public Connection con=null;

	public static void main(String[] args) {
		Dbconnection dc=new Dbconnection();
		dc.dbconnect();
		
		// TODO Auto-generated method stub

	}
public Connection dbconnect()
{
	try {
		System.out.println("Connecting...");
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
		System.out.println("Connected");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
