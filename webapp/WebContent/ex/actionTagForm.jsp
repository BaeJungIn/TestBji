<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="actionTagTest.jsp">
		���̵� : <input type="text" name="userID" id="userID"><br>
		�� &nbsp; ȣ : <input type="password" name=userPwd><br>
		<input type="radio" name="loginCheck" value="user" checked="checked">�����
		<input type="radio" name="loginCheck" value="manager">������<br>
		<input type="submit" value="�α���">
	</form>
</body>
</html>