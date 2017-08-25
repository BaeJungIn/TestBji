<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>insert 예제</h2><br><p><hr>
<form method="post" action="insertPro.jsp">
<table border="1">
id : <input type="text" name ="id"><br>
pass : <input type="text" name ="pw"><br>
name : <input type="text" name ="name"><br>
regist : <input type="text" name ="regist"><br>
<input type="submit" value="전송">
</table>
<a href="userinfolist.jsp">회원가입 취소</a>
</form>
</center>
</body>
</html>