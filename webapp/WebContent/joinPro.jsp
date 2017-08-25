<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>*회원가입 결과*</h3>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("myname");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
	%>
	
	이름 : <%= name %><p>
	메일 : <%= id %><p>
	내용 : <%= email %><p>
	
	<%= "성별: "+request.getParameter("sex") %>
	<br>
	
	<%
		String str[];	
		str = request.getParameterValues("hoby");
	%>
	<br> 취미:
	<%
	for(int i=0; i<str.length; i++){
		if(i == str.length-1){
	%>
			<%= str[i] %>
				
	<%
		}else{
	%>
			<%= str[i]+"<br>" %>
	<% 
		
			}
		}
	%>
	
	<%
	out.println("직업 "+request.getParameter("job"));
	out.println("<BR>");
	
	String str2[];
	str2 = request.getParameterValues("favo");
	out.print("관심 분야  :  ");
	for(int i=0; i<str.length; i++){
		out.print(str[i]+" ");
		out.println("<BR>");
	}
	%>
	
</body>
</html>