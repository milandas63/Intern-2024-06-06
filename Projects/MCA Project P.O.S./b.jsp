<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*, java.util.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<%
	ArrayList arr=(ArrayList) session.getAttribute("stdinfo");
	Iterator it =arr.iterator();
	while(it.hasNext()){
		ArrayList aa=(ArrayList)it.next();
		out.print(aa.get(0)+", "+ aa.get(1)+", "+ aa.get(2)+"<br>");
	}
%>
</body>
</html>
