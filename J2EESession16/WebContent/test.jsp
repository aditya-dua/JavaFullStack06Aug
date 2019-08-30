<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="404.jsp"%>

<%
	String num1= request.getParameter("num1");
	String num2= request.getParameter("num2");
	String sessionID=request.getParameter("sessionIdStr");
	
	int n1= Integer.parseInt(num1);
	int n2= Integer.parseInt(num2);
	
	out.println("DIVISION RESULT IS:"+n1/n2+" SESSIONID "+sessionID );
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Your SessionID is:<%=sessionID%>

</body>
</html>