package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		if(username.equals("admin")&&password.equals("admin"))
		{
			/*adding data in session.This will invoke sessionAttricuteListener's
			attributeAdded(..) method */
			session.setAttribute("user", username);
			dispatcher=request.getRequestDispatcher("Home.jsp");
			dispatcher.include(request, response);
		}
		else
		{
			response.setContentType("text/HTML");
			PrintWriter out=response.getWriter();
			out.println("Invalid Username or Password !");
			out.println("<br><a href=\"Login.jsp\"> Login again </a>");
		}
	}

}
