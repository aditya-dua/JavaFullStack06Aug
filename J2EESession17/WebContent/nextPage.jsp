<%@page import="db.DbUtility"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DBConnection"%>

<%@ page import ="java.io.*, java.util.*,java.sql.*" %>
<%@ page import ="javax.servlet.*" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/sql' prefix='sql' %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	// Register the user:
	// I will add the user Name to session
	// I will add the details of his registertaion to cookies
	
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	String phoneNumber = request.getParameter("phoneNumber");
	
	
	
	
	String insert="INSERT INTO sys.user_details_table"+
			"(email, userName, password, phoneNumber)"+
			"VALUES('"+email+"', '"+userName+"','"+password+"', '"+phoneNumber+"');";
		
	int rowsAffected= DbUtility.executeUpdate(DBConnection.getDBInstance(), insert);
	
	out.print("Rows inserted are:"+rowsAffected);
	
	
	
		String user = (String)session.getAttribute("userName");
		
		if(user==null){
			session.setAttribute("userName", userName);
			session.setAttribute("SID","ASFAFFF2353565346dgbsdgbt234");
		}
		
		Cookie cok= new Cookie("userEmail",email);
		Cookie cok1= new Cookie("userName",userName);
		Cookie cok2= new Cookie("user",email);
		// *.seic.com
		// seibussinessbuilder.com
		// user.seic.com
		
		
		cok.setDomain("www.google.com");
		cok.setMaxAge(60*60);
		out.print(cok.getDomain());
		cok2.setDomain("www.amazon.com");
		
		response.addCookie(cok);
		response.addCookie(cok1);
		response.addCookie(cok2);
		
		

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% out.println("Session IS NEW :"+session.isNew()); %> <br>
	<% out.println("Session USerID:"+session.getAttribute("userN")); %> <br>
	
	<sql:setDataSource var ="myVar" driver="com.mysql.jdbc.Driver"
		url ="jdbc:mysql://localhost:3306/sys" user="root"
		password="password"/>
		
		<sql:query var ="user" datasource="${myVar}" >
			select * user_details_table;
		</sql:query>
		
		<c:forEach var = "userVar" items="${user.rows}">
			<c:out value="${userVar.email}"/>
			<c:out value="${userVar.userName}"/>
			<c:out value="${userVar.phoneNumber}"/>
			
		<br>
		</c:forEach>
		
	
	
</body>
</html>