<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*,java.util.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<br />
<br />
<%! 
	int cnt=0; 
	ArrayList ar=new ArrayList();
%>
<%
	try{
		String vals=request.getParameter("a1");
 		cnt=Integer.parseInt(vals);
		String na=request.getParameter("n1");
		String ro=request.getParameter("r1");
		ArrayList aa=new  ArrayList();
		aa.add(cnt);
		aa.add(na);
		aa.add(ro);
		ar.add(aa);
		out.print(na+", "+ro+"<br>");
	}catch(Exception e){ cnt=0; }
	cnt++;
%> 
<form>
 Name <input type="text" name="n1"  /> Roll <input type="text" name="r1"  /><br />
<input type="submit" value="Add" />
<!-- <input type="hidden" name="a1" value="<%= cnt %>" /> -->
</form>

<form action="b.jsp">
<%
	session.removeAttribute("stdinfo");
	session.setAttribute("stdinfo", ar);
%>
<input type="submit" value="submit" />
</form>
</body>
</html>
