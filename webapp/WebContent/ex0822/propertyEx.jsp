<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="bean.MemberBean"/>
	<hr>
	- 자바 빈 객체 생성 후 저장된 정보 출력하기
	<br>
	<br> 이름 :
	<jsp:getProperty name="member" property="name"/>
	<br> 아이디 :
	<jsp:getProperty name="member" property="id"/>
	<hr>
	- 정보 변경한 후 변경된 정보 출력하기
	<br>
	<br> setName("정규식") 호출되어서 this.name 저장
	<jsp:setProperty name="member" property="name" value="정규식"/>
	<jsp:setProperty name="member" property="id" value="pinksubin"/>
	이름:
	<jsp:getProperty name="member" property="name"/>
	<br> 아이디:
	<jsp:getProperty name="member" property="id"/>
	
</body>
</html>