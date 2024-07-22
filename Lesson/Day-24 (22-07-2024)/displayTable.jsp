<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Display Table Program</h1>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM contact");
		ResultSetMetaData rsmd = rs.getMetaData();

		out.println("<html><body>");
		out.println("<table>");
		while(rs.next()) {
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(i));
				out.println("</td>");
				out.println("</tr>");
			}			
		}
		out.println("</table>");
		out.println("</body></html>");

		rs.close();
		stmt.close();
		conn.close();
	%>
</body>
</html>
