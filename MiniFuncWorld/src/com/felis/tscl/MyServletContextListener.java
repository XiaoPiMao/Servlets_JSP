package com.felis.tscl;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(this.getClass().getName() + ": do something after context initialized.");
		ServletContext sc = sce.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog dog = new Dog(dogBreed);
		sc.setAttribute("dog", dog);
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		//do nothing
	}
}