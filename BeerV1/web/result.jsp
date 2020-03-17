<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
<%
	List<String> brands = (List<String>)request.getAttribute("brands");
	for (String brand: brands) {
		out.println("Try: " + brand + "<br>");
	}
%>
</body>
</html>