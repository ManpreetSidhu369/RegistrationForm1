package com.login.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String password = request.getParameter("password");
 
        LoginBean loginBean = new LoginBean();
        loginBean.setemail(email);
        loginBean.setPassword(password);
        
        LoginDao loginDao = new LoginDao();
        String userValidate = loginDao.authenticateUser(loginBean);
        if(userValidate.equals("SUCCESS")) 
        {
            request.setAttribute("email",email); 
            request.getRequestDispatcher("Welcome.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("errMessage", userValidate); 
            request.getRequestDispatcher("Index.jsp").forward(request,response);
	}
	}

}

