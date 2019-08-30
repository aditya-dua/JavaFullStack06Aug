<%@ page import="java.lang.*"
		import="java.util.*" %> 
<%-- <jsp:directive.page attribute="value"> --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	
	public void jspInit(){
	
	
		System.out.print("Init Called");
		HashMap hm = new HashMap();
	}

%>

<%-- 
create a project : divide 2 numbers
2) process 
3) show on jsp
4) if error , error.jsp
THIS IS A COMMENT --%>
    
   
   <%
   	String sessionCount =(String) session.getAttribute("SessionCount");
   	session.setMaxInactiveInterval(1);
   	if(sessionCount == null){
   		session.setAttribute("SessionCount", "0");
   	}else{
   		int count = Integer.parseInt(sessionCount);
   		session.setAttribute("SessionCount", Integer.toString(++count));
   		
   		
   	}
   	
   
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%="My JSP Page"%></title>
</head>
<body>

	
	<form action ="test.jsp" method="get">
		<input type ="text" name="num1"/>
		<input type ="text" name="num2"/>
		<input type="hidden" name="sessionIdStr" value='<%="SID!12121212"%>'/>
		<input type ="submit" name="divide"/>
	
	</form>
	
	<form action ="index.jsp" method="post">
		
	<input type ="submit" name="update"/>
	
	
	</form>
	
	<% String str[]=new String[10];
		//out.print(str[11]);
	
	%>
	<%=config.getServletName() %>
	<%=session.getAttribute("SessionCount") %>
	<p align="center">
	<jsp:include page="date.jsp" flush="true"></jsp:include> 
	<%--<jsp:forward page="date.jsp"></jsp:forward> --%>
	</p>

	<jsp:useBean id="myAction" class="com.example.Actions"></jsp:useBean>
	<jsp:setProperty name="myAction" property="message"  value="MY NEW ACTIONS"/>
	

	
	

	<jsp:getProperty property="message" name="myAction"/>

	
</body>
</html>