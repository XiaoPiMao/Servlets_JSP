package com.felis.func;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class JarDownloadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("application/jar");
		
		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/bookCode.jar");
		
		int readed = 0;
		byte[] bytes = new byte[1024];//1kb
		
		OutputStream os = response.getOutputStream();
		while ((readed = is.read(bytes)) != -1) {
			os.write(bytes, 0 , readed);
		}
		os.flush();
		os.close();
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println(this.getClass().getName() + ": 開始初始化");
		super.init();
	}
	
	
	@Override
	public void destroy() {
		System.out.println(this.getClass().getName() + ": 開始銷毀");
		super.destroy();
	}
}