package com.login.page;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	public String authenticateUser(LoginBean loginBean)
	{
		String email = loginBean.getemail();
		String password = loginBean.getPassword();
		
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String emailDB = email;
		String passwordDB = password;
		
		try {
			con = DBconnection.createConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery("select email, password from user1");
			
			while(resultSet.next())
			{
				emailDB =resultSet.getString("email");
			    passwordDB = resultSet.getString("password");
			    
			    if(email.equals(emailDB)&& password.equals(passwordDB))
			    {
			    	return "SUCCESS";
			    }
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Invalid user credentials";
			
		
	}

}
