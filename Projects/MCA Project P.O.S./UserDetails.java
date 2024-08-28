package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

public class UserDetails extends HttpServlet {
	
	PrintWriter out;
	 Connection conn;
	Statement stmt;
	RequestDispatcher rd;

	
	public void doGet( HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		 resp.setContentType("text/html");
		try {
			out=resp.getWriter();
			
			out.println("<marquee><h2>Invalid User Name And Password</h2></marquee>");
			
			String uid =req.getParameter("username");
			String name = req.getParameter("fullName");
			String phone =req.getParameter("phone");
			String email = req.getParameter("email");
			String pass= req.getParameter("password");
			
			
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Medicine", "root", "root");
			stmt= conn.createStatement();
			
			
			int rs=stmt.executeUpdate("INSERT INTO User(UserId, Name,Phone,Email,Password) VALUES('"+uid+"','"+name+"','"+phone+"','"+email+"','"+pass+"');");
			if(rs>=1) {
				rd=req.getRequestDispatcher("login.html");
				rd.forward(req, resp);
		
			}
			else {
			}
			stmt.close();
			conn.close();
				
			} 	catch(ClassNotFoundException e) {
				System.out.println("class not found");
				} 	
				catch (SQLException e) {
				
					
			}
		
	}
}
