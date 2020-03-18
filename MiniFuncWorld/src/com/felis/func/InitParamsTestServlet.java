package com.felis.func;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class InitParamsTestServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test init parameters<br>");
		Enumeration<String> paramNames = getServletConfig().getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			out.println(String.format("<br>servlet config param name = %s <br>", paramNames.nextElement()));
		}
		out.println(String.format("main email is %s <br>", getServletConfig().getInitParameter("mainEmail")));
		out.println(String.format("admin email is %s <br>", getServletContext().getInitParameter("adminEmail")));		
	}
}