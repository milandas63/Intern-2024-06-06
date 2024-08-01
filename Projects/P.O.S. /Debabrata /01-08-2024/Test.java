package com.pharma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	public void doGet( HttpServletRequest req, HttpServletResponse resp) {
		int uid = Integer.parseInt(req.getParameter(""));
		String name = req.getParameter("");
		int phone = Integer.parseInt(req.getParameter(""));
		String email = req.getParameter("");
		String pass= req.getParameter("");
		
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement st = conn.createStatement();
			
			conn.close();
			st.close();
		}
		catch(SQLException e) {}
	}
}
