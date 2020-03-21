package com.felis.jsp;

public class Counter {
	private static int count = 0;
	
	public static synchronized int getCount() {
		Counter.count += 1;
		return Counter.count;
	}

}