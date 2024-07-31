package com.algo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MTables extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		doGet(req,resp);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			int start = Integer.parseInt(req.getParameter("start"));
			int end = Integer.parseInt(req.getParameter("end"));
			int count = 0;

			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<tr>");
			for(int i=start; i<=end; i++) {
				out.println("<td>");
				out.println("<table>");
				for(int j=1; j<=10; j++) {
					out.println("<tr>");
					out.println("<td align='right'>"+i+"</td>");
					out.println("<td align='center'>x</td>");
					out.println("<td align='right'>"+j+"</td>");
					out.println("<td align='center'>=</td>");
					out.println("<td align='right'>"+(i*j)+"</td>");
					out.println("</tr>");
				}				
				out.println("</table>");
				out.println("</td>");
				count++;
				if(count>=10) {
					count = 0;
					out.println("</tr>");
					out.println("<tr>");
				}
			}
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		} catch(IOException e) {
			
		}
	}
}
