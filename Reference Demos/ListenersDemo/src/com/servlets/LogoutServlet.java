package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		/*modifying value which is existing on session.This will invoke sessionAttricuteListener's
		attributeReplaced(..) method */
		//session.setAttribute("user", "administartor");
		
		/*removing value from session.This will invoke sessionAttricuteListener's
		attributeRemoved(..) method */
		session.removeAttribute("user");
		
		/*Invalidating session.This will invoke sessionLifeCycleListener's
		sessionDestroyed(..) method . All the data will be removed*/
		session.invalidate();
		
		response.sendRedirect("Logout.jsp");
		
	}

}
