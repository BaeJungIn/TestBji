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
		Cookie cookie = new Cookie("id","");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	%>
	<h3>id ��Ű�� �����Ǿ����ϴ�.</h3>
	<a href="getCookies.jsp">��Ű ������ Ȯ���Ϸ��� Ŭ���ϼ���.</a>
</body>
</html>