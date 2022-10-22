package com.mvc.controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
import javax.servlet.ServletException;

public class RegisterServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	
public RegisterServlet() {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String FirstName = request.getParameter("FirstName");
    String LastName = request.getParameter("LastName");
    String Email = request.getParameter("Email");
    String Password = request.getParameter("Password");
    String ConfPassword = request.getParameter("ConfPassword");
    
    RegisterBean registerBean = new RegisterBean();
    registerBean.setFirstName(FirstName);
    registerBean.setLastName(LastName);
    registerBean.setEmail(Email);
    registerBean.setPassword(Password);
    registerBean.setConfPassword(ConfPassword);
    
    
    RegisterDao registerDao = new RegisterDao();
    String userRegistered = registerDao.registerUser(registerBean);
    
    if(userRegistered.equals("SUCCESS"))
    {
    	request.getRequestDispatcher("Index.jsp").forward(request, response);
    }
    else
    {
    	request.setAttribute("errMessage", userRegistered);
        request.getRequestDispatcher("Register.jsp").forward(request, response);
    }
    
	}
	
	
}
