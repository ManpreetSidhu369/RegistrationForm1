package com.introduction.page;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection createConnection() {
		Connection con =null;
		String url= "jdbc:mysql://localhost:3306/customer";
		String username = "root";
		String password = "";
		System.out.println(" In DBconnection.java class");
		
		try
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Printing connection object" + con);
		}
		catch(Exception e)
		{
		   e.printStackTrace();	
		}
		return con;
	}


}
