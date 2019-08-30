<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p> Today's Date is:<%=(new java.util.Date()).toLocaleString()%></p>
</body>
</html>

<%--
 JSP or a HTML file
1) form : create the session -> A new session object should be created and you 
will bind it to the response

2) reload : you are accessing the session , doing some opertion

3) destroy:

reqeuest.getSesssion-> false

session : loggedUser -> session.invalidate
--%>


