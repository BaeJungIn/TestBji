<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<jsp:useBean id="myinfo" class="bean.MyInfo" scope="page"/>
<jsp:setProperty name="myinfo" property="name"/>
<jsp:setProperty name="myinfo" property="age"/>
현재 설정된 이름 : <jsp:getProperty name="myinfo" property="name"/><br>
현재 설정된 나이 : <jsp:getProperty name="myinfo" property="age"/>
<p>
<form name="forname" action="scopeEx.jsp">
이름 : <input type="text" name="name"><br>
나이 : <input type="text" name="age"><br>
&nbsp;&nbsp;<input type="submit" name="전송"><br>
</form>
<p>
<a href="scope.jsp">다시 읽기</a>
</head>
