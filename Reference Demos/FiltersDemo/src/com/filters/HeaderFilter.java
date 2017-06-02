package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
/* Annotation for Filters:
@WebFilter(filterName = "header",urlPatterns = {"/*"})
Either annotation or web.xml should be used to configure filters
*/
public class HeaderFilter implements Filter {

	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//pre- processing task
		System.out.println("executing pre processing from header");
		PrintWriter out=response.getWriter();
		out.println("<div style='background-color:DodgerBlue;text-align:center;'>Techmahindra TLS</div>");
		
		chain.doFilter(request, response);
		//post processing task
		System.out.println("sending response back to browser from header..");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
