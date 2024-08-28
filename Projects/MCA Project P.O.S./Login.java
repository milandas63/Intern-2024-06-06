package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	Connection conn;
	PreparedStatement statement;
	
	RequestDispatcher rd;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Medicine", "root", "root");
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		
		System.out.println(name+"\n"+pass);
		
		statement=conn.prepareStatement("select  UserId from User where  UserId=? and Password=?");
		statement.setString(1,name);
		statement.setString(2,pass);
		ResultSet rs=statement.executeQuery();
		
		
			if(rs.next()) {
			rd=request.getRequestDispatcher("Front.html");
			rd.forward(request, response);
			System.out.println("Running");
			
			}
				else {
			rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
			System.out.println("NotRunning");

			}
		
		
		rs.close();
		statement.close();
		conn.close();
		}	
			catch(ClassNotFoundException e) {
			System.out.println("class not found");
			} 	
			catch (SQLException e) {
			
				System.out.println("sql not found");
		}
	}

}
