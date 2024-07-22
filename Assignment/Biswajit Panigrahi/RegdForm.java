package com.regd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegdForm extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h3>response catch</h3>");

			String name=request.getParameter("Name");
			String password=request.getParameter("Password");
			String number=request.getParameter("Number");
			String gender=request.getParameter("Gender");
			//String cond=request.getParameter("Checkbox");

			out.println("<h3>Name :"+name+"</h3>");
			out.println("<h3>Password :"+password+"</h3>");
			out.println("<h3>Number :"+number+"</h3>");
			out.println("<h3>Gender :"+gender+"</h3>");
	}
}
