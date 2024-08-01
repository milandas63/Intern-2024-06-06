package com.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SQLBrowser extends HttpServlet {
	PrintWriter out;
	private static Connection conn;
	Statement stmt;
	ResultSet rs;
	ResultSetMetaData rsmd;

	static {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch060624", "root", "root");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			String query = req.getParameter("query");
			out = res.getWriter();
			res.setContentType("text/html");

			stmt = SQLBrowser.conn.createStatement();
			rs = stmt.executeQuery(query);
			rsmd = rs.getMetaData();

			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<tr>");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.println("<th>");
				out.println(rsmd.getColumnLabel(i).toUpperCase());
				out.println("</th>");
			}
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					out.println("<td>");
					out.println(rs.getString(i));
					out.println("</td>");
				}
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
			rs.close();
			stmt.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
