<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	pageContext.setAttribute("name", "page man");
  	  request.setAttribute("name", "request man");
    	session.setAttribute("name", "session man");
    	application.setAttribute("name", "application man");
    %>
    name : ${name}
    <hr>
    page 加己 : ${pageScope.name }
    <br>
    request 加己 : ${requestScope.name }
    <br>
    session 加己 : ${sessionScope.name }
    <br>
    application 加己 : ${applicationScope.name }
    <br>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>