<%@page import="java.util.Enumeration"%>
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
	session.setAttribute("s_name1", "���� ���ǿ� ����� ù ��° ���̿���.^0^");
	session.setAttribute("s_name2", "���� ���ǿ� ����� �� ��° ���̿���.^0^");
	session.setAttribute("s_name3", "���� ���ǿ� ����� �� ��° ���̿���.^0^");
	out.print("<h3> >> ���ǰ��� �����ϱ� �� << </h3>");
	Enumeration names;
	names = session.getAttributeNames();
	while(names.hasMoreElements()){
		String name = names.nextElement().toString();
		String value = session.getAttribute(name).toString();
		out.println(name+":"+value+"<hr>");
	}
	//�̸��� �����Ͽ� ���ǿ� ����� ��ü�� �����մϴ�.
	session.removeAttribute("s_name2");
	out.print("<hr> <h3> >>���ǰ��� ������ �� << </h3>");
	names = session.getAttributeNames();
	while(names.hasMoreElements()){
		String name = names.nextElement().toString();
		String value = session.getAttribute(name).toString();
		out.println(name+":"+value+"<hr>");
	}
%>
</body>
</html>