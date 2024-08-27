<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacture</title>
<style>
		body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
        }
        h1 {
            text-align: center;
            background-color: #e2e2e2;
            color: #fff;
            padding: 20px 0;
            margin: 0;
        }
        table { 
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .add {
            display: block;
            margin: 20px auto;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }
</style>
</head>
<body>
			<h1>All Manufacture Companies</h1>
 	 			<table >
				<thead>
			            <tr>
			                <th>MFR_ID</th>
			                <th>MFR_Name</th>
			                <th>Abbreviation</th>
			                <th>HEAD_OFFICE</th>
			                <th>CONTACT</th>
			                <th>PIN</th>
			            </tr>
        		</thead>
        		<tbody>
        			<%
        				try{
        					Class.forName("com.mysql.jdbc.Driver");
        					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine", "root", "root");
        					Statement statement=connection.createStatement();
        					 ResultSet rs = statement.executeQuery("select  * from manufacture;");
    
        						 while (rs.next()) {
        		                        out.println("<tr>");
        		                        out.println("<td>" + rs.getString("mfr_id") + "</td>");
        		                        out.println("<td>" + rs.getString("mfr_name") + "</td>");
        		                        out.println("<td>" + rs.getString("mfr_abbr") + "</td>");
        		                        out.println("<td>" + rs.getString("headoffice") + "</td>");
        		                        out.println("<td>" + rs.getString("contact") + "</td>");
        		                        out.println("<td>" + rs.getString("pin") + "</td>");
        		                       // out.println("<td><button class='edit-button' onclick=\"editManufacturer('" + rs.getInt("mfr_id") + "')\">Edit</button></td>");
        		                      //  out.println("<td><button class='delete-button' onclick=\"deleteManufacturer('" + rs.getInt("mfr_id") + "')\">Delete</button></td>");
        		                        out.println("</tr>");
        		                    }
        		                    out.println("</table>");
        		            
        		                    rs.close();
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
        		
        		</tbody>
		</table>
		<button class="add" onclick="addRow()">Add New</button>
</body>
	<script>
	function addRow() {
       
        window.location.href = "addnew.jsp"; 
    }
	</script>
</html>