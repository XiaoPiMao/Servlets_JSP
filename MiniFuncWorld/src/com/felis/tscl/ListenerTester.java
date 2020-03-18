package com.felis.tscl;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		PrintWriter out = response.getWriter();
		out.println("<h1 align=center>Test Servlet Context Listener</h1>");
		out.println(String.format("<h3 align=center>Dog's breed is %s.</h3>", dog.getBreed()));
	}
	
}