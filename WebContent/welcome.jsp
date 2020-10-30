<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	// response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.
	// response.setHeader("Pragma", "no-cache"); // HTTP 1.0 (older browsers)
	// response.setHeader("Expires", "0"); // Proxies

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	if (session.getAttribute("userName") == null) {
		response.sendRedirect("login.jsp");
	}
%>
	Welcome
	
	<a href="movies.jsp">go to movies </a>
	<a href="logout.jsp">Logout</a>
</body>
</html>