<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<h3>�����ڷ� �α��� ����</h3>
	<%= URLDecoder.decode(request.getParameter("userName"),"UTF-8")%>
	(<%= request.getParameter("userID")%>)�� ȯ���մϴ�.
</body>
</html>