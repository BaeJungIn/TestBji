<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<jsp:useBean id="myinfo" class="bean.MyInfo" scope="page"/>
<jsp:setProperty name="myinfo" property="name"/>
<jsp:setProperty name="myinfo" property="age"/>
���� ������ �̸� : <jsp:getProperty name="myinfo" property="name"/><br>
���� ������ ���� : <jsp:getProperty name="myinfo" property="age"/>
<p>
<form name="forname" action="scopeEx.jsp">
�̸� : <input type="text" name="name"><br>
���� : <input type="text" name="age"><br>
&nbsp;&nbsp;<input type="submit" name="����"><br>
</form>
<p>
<a href="scope.jsp">�ٽ� �б�</a>
</head>
