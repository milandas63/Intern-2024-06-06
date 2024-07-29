package com.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pyramid extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		int spaces = 40;
		int stars = 1;
		
		out.println("<body>");
		out.println("<tt>");
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++) out.print("&nbsp;");
			for(int j=0; j<stars; j++) out.print("*");
			out.println("<br>");
			spaces--; stars+=2;
		}
		out.println("</tt>");
		out.println("</body>");
	}
}
