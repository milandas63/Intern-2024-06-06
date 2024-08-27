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
	<%
		String sqlquery=request.getParameter("sql");
	try{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine", "root", "root");
		
		Statement statement=connection.createStatement();
		
		out.println("<br>"+sqlquery);
		
		 int rs = statement.executeUpdate(sqlquery);

        if(rs>0){
        	out.println("<h2>Insert New Data Succefully</h2>");
        	out.println("<a href='manufacture.jsp'>manufacture</a>");
        }
            
                statement.close();
                connection.close();
            } catch (ClassNotFoundException e) {
                out.println("<tr><td colspan='6'>Driver class Not Found/td></tr>");
                out.println("</table>");
            }catch (SQLException e) {
                out.println("<tr><td colspan='6'>SQL Syntax error</td></tr>");
                out.println("</table>");
            }catch (Exception e) {
                out.println("<tr><td colspan='6'>An error occurred while retrieving data from the database.</td></tr>");
                out.println("</table>");
            }
	%>
</body>
</html>