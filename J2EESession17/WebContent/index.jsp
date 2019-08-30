<%@ page import ="java.io.*, java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	Date creationTS = new Date(session.getCreationTime());
	Date lastM = new Date(session.getLastAccessedTime());
	
	if(session.isNew()){
		session.setAttribute("userN", "ADUA");
		session.setAttribute("email", "aditya.d@acadgild.com");	
	}
	
	
	
	

%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% out.println("Session IS NEW :"+session.isNew()); %> <br>
	<% out.println("Session Creation TimeStamp:"+creationTS); %> <br>
	<% out.println("Session Last Access :"+lastM); %> <br>
	<% out.println("Session USerID:"+session.getAttribute("userN")); %> <br>
	
	<form action="nextPage.jsp" method="post">
		<input type="text" name="userName"> <br>
		<input type="text" name="password"> <br>
		<input type="text" name="cPassword"> <br>
		<input type="text" name="email"> <br>
		<input type="text" name="phone"> <br>
		
		<input type="submit"> <br>
		
	
	</form>
</body>
</html>