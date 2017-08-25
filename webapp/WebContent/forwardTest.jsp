<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	int age = Integer.parseInt(request.getParameter("age"));
    if(age<=19){
    	
    %>
    <script type="text/javascript">
    	alert("19세 미만이므로 입장 불가능");
    	history.go(-1);
    </script>
    <%
    }else{
    	request.setAttribute("name", "배정인");
    	RequestDispatcher dispatcher = request.getRequestDispatcher("forwardResult.jsp");
    	dispatcher.forward(request, response);
    }
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>