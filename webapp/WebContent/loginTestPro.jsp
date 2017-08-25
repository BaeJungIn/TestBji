<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = "abc";
	String	pwd = "123";
	String name = "배정인";
	request.setCharacterEncoding("UTF-8");
	if(id.equals(request.getParameter("id"))&& pwd.equals(request.getParameter("pwd"))){
		response.sendRedirect("loginmain.jsp?name="+URLEncoder.encode(name,"UTF-8"));
	}else{
		response.sendRedirect("loginTest.jsp");
	}
		
	%>
</body>
</html>