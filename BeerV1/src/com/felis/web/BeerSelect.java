package com.felis.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.felis.model.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		//將業務邏輯交由Model處理
		BeerExpert beerExpert = new BeerExpert();
		String color = request.getParameter("color");
		List<String> brands = beerExpert.getBrands(color);

		
		//直接在Servlet中輸出html
		/*
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		for (String brand: beerExpert.getBrands(color)) {
			out.println("Try: " + brand + "<br>");
		}
		*/
		
		//分派給JSP處理View
		request.setAttribute("brands", brands);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);

	}

}