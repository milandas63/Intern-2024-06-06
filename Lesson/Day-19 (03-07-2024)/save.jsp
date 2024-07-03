<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <%@ page import="java.sql.*"%>
    <head>
        <title>Saving data<title>
        <%
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch060624", "root", "root");
            Statement statement = connect.createStatement();

            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String father = request.getParameter("father");
            String gender = request.getParameter("gender");
            String mobile = request.getParameter("mobile_no");
            String sqlString = "INSERT INTO students VALUES("+
                    id+",'"+
                    name+"','"+
                    father+"','"+
                    gender+"','"+
                    mobile+"')";
            out.write(sqlString);
            statement.executeUpdate(sqlString);
            statement.close();
            connect.close();
        %>
    </head>

    <body>
        <font face="Arial" color="red" size="5">
        Student data is successfully saved
        </font>
    </body>
</html>
