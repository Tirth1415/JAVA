<%@page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("Login.jsp");
	}
	%>
	
	Welocme,
	Name : <%=u.getName()%>
	Contact : <%=u.getContact()%>
	Address : <%=u.getAddress()%>
	Email : <%=u.getEmail() %>
	Password : <%=u.getPassword() %>
</body>
</html>