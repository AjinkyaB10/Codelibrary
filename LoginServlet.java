package com.Backend.Servlet;

import java.io.IOException;

import com.Backend.Dao.*;

import com.Backend.Dao.userDaoimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserDao userDao  =new userDaoimpl();   
    
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userDao.isValidUser(username,password)) {
			HttpSession session=request.getSession();
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp?error=1");
			System.out.println("Inavalid username & password.");
		}
	}

}
