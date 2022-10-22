package com.introduction.page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IntroDao {
	public String registerUser(IntroBean introBean) {
		String Introduction = introBean.getIntroduction();
		String Hobbies = introBean.getHobbies();
		
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try
		{
			con = DBconnection.createConnection();
			String  query = "insert into user(Introduction,Hobbies) values (?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, Introduction);
			preparedStatement.setString(2, Hobbies);
			
			
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
