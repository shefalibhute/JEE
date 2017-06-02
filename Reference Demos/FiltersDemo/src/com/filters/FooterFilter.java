package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FooterFilter
 */
public class FooterFilter implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//pre- processing task
		System.out.println("executing pre processing from footer");
		chain.doFilter(request, response);
		//post processing task
		System.out.println("sending response back to browser from footer..");
		PrintWriter out=response.getWriter();
		out.println("<div style='background-color:DodgerBlue;text-align:center;'>&copy All rights reserved at TLS (2016)</div>");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
