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
	- �ڹ� �� ��ü ���� �� ����� ���� ����ϱ�
	<br>
	<br> �̸� :
	<jsp:getProperty name="member" property="name"/>
	<br> ���̵� :
	<jsp:getProperty name="member" property="id"/>
	<hr>
	- ���� ������ �� ����� ���� ����ϱ�
	<br>
	<br> setName("���Խ�") ȣ��Ǿ this.name ����
	<jsp:setProperty name="member" property="name" value="���Խ�"/>
	<jsp:setProperty name="member" property="id" value="pinksubin"/>
	�̸�:
	<jsp:getProperty name="member" property="name"/>
	<br> ���̵�:
	<jsp:getProperty name="member" property="id"/>
	
</body>
</html>