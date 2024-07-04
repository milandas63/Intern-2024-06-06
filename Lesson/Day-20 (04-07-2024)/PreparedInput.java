package com.io;

import java.util.*;
import java.sql.*;

public class PreparedInput {
	public Scanner sc;
	public Connection conn;
	public PreparedStatement pstmt;

	public PreparedInput() {
		String id, name, father, gender, mobile;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch060624","root","root");
			pstmt = conn.prepareStatement("INSERT INTO students VALUES(?,?,?,?,?)");
		
			sc = new Scanner(System.in);
			boolean more = true;
			while(more) {
				for(int i=0; i<25; i++) System.out.println();
				System.out.print("ID:            ");
				id = sc.nextLine();
				System.out.print("Student Name:  ");
				name = sc.nextLine();
				System.out.print("Father's Name: ");
				father = sc.nextLine();
				System.out.print("Gender [M/F]:  ");
				gender = sc.nextLine();
				System.out.print("Mobile:        ");
				mobile = sc.nextLine();

				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, father);
				pstmt.setString(4, gender);
				pstmt.setString(5, mobile);
				pstmt.executeUpdate();
				
				System.out.println();
				System.out.print("More [Y/N]:   ");
				more = sc.nextLine().toUpperCase().startsWith("Y");
			}
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println("Exception: "+e);
		}
	}

	public static void main(String[] args) {
		new PreparedInput();
	}

}
