package com.run;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RunServlet extends HttpServlet {
	PrintWriter out;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		String name = req.getParameter("name");
		out = res.getWriter();
		out.println("<marquee><h1 style='background-color:lightgray;color:red;'>"+name+"</h1></marquee>");
		out.close();
	}
}
