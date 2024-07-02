package com.jdbc;

//	1. Import java.sql package
import java.sql.*;

public class Students {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Students() {
		try {
			// 2. Load & register driver
			Class.forName("org.gjt.mm.mysql.Driver");
			
			// 3. Create Connection object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch060624", "root", "");
			
			// 4. Create Statement object
			stmt = conn.createStatement();
			
			// 5. Create ResultSet object
			rs = stmt.executeQuery("SELECT * FROM students");
			
			// 6. Manipulate ResultSet
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+
						rs.getString("name")+" "+
						rs.getString("father")+" "+
						rs.getString("gender")+" "+
						rs.getString("mobile_no")
				);
			}

			// 7. Close ResultSet, Statment, Connection
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			
		} catch(SQLException e) {
			
		}
	}
	
	public static void main(String[] args) {
		new Students();
	}

}
