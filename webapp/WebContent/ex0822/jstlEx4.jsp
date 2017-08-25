<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:choose> <!-- switch case랑 비슷 -->
	<c:when test="${param.fruit==1 }">
	<span style="color:red;">사과</span>
	</c:when>
	<c:when test="${param.fruit==2 }">
	<span style="color:green;">메론</span>
	</c:when>
	<c:when test="${param.fruit==3 }">
	<span style="color:blue;">바나나</span>
	</c:when>
	</c:choose>
</body>
</html>