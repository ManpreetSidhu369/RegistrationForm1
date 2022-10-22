package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.RegisterBean;
import com.mvc.util.DBconnection;

public class RegisterDao {
	
	public String registerUser(RegisterBean registerBean) {
		String FirstName = registerBean.getFirstName();
		String LastName = registerBean.getLastName();
		String Email = registerBean.getEmail();
		String Password = registerBean.getPassword();
		String ConfPassword = registerBean.getConfPassword();
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try
		{
			con = DBconnection.createConnection();
			String  query = "insert into user1(FirstName,LastName,Email,Password,ConfPassword) values (?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, FirstName);
			preparedStatement.setString(2, LastName);
			preparedStatement.setString(3, Email);
			preparedStatement.setString(4, Password);
			preparedStatement.setString(5, ConfPassword);
			
			int i = preparedStatement.executeUpdate();
			if(i != 0)
				return "SUCCESS";
			
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";
		
		
		
	}

}
