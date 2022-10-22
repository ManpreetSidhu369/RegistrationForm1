package com.introduction.page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IntroServlet")
public class IntroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public IntroServlet() {
        super();
     }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Introduction = request.getParameter("Introduction");
	    String Hobbies = request.getParameter("Hobbies");
	    
	    
	    IntroBean introBean = new IntroBean();
	    introBean.setIntroduction(Introduction);
	    introBean.setHobbies(Hobbies);
	   
	    
	    IntroDao introDao = new IntroDao();
	    String userRegistered = introDao.registerUser(introBean);
	    
	    if(userRegistered.equals("SUCCESS"))
	    {
	    	 request.setAttribute("Introduction", Introduction);
	    	 request.setAttribute("Hobbies", Hobbies);
	    	request.getRequestDispatcher("Introduction.jsp").forward(request, response);
	    }
	    else
	    {
	    	request.setAttribute("errMessage", userRegistered);
	        request.getRequestDispatcher("Welcome.jsp").forward(request, response);
	    }
	    
		
		
	
	}

}
