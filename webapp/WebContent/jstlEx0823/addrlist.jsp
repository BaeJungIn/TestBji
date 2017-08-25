<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@page import="java.sql.*, javax.naming.*, javax.sql.*, bean.AddrBean"%>
<%@page import="java.net.URLDecoder"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="data" scope="page" class="bean.AddrBean"/>
    <jsp:setProperty property="*" name="data" />
<%!public Connection getConnection() {
      Connection conn = null;
      try {
         InitialContext initctx = new InitialContext();
         Context ctx = (Context) initctx.lookup("java:comp/env");
         DataSource ds = (DataSource) ctx.lookup("jdbc/mysql");
         conn = ds.getConnection();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <center>
      <br>
      <p>
         <br>
      <p>
      <h1>주소록 만들기</h1>
      <p>
      <hr>
      <br>
      <p>
      <h3>
         <%
         	ResultSet rs = null;
         	//AddrBean addrbean = AddrBean();
            request.setCharacterEncoding("UTF-8");
            String result = request.getParameter("result");
            if (result != null)
               out.println(URLDecoder.decode(result));
         %>
      </h3>
      <hr>
      <br>
      <p>
      <table border="1">
      
      <%
      ResultSetMetaData rsmd = rs.getMetaData();
      int cols=rsmd.getColumnCount();
      
      	try{
      		while(rs.next()){
      			%>
      			
      			<tr>
      			--${rs.getString(1)}
      			<%
      				ArrayList<String> items = new ArrayList<String>();
      				for(int i=1; i<=cols; i++){
      					items.add(rs.getString(i));
      				}
      				pageContext.setAttribute("items", items);
      				
      				/* String id = rs.getString("id");
      				String name = rs.getString("name");
      				String phone = rs.getString("phone");
      				String addr = rs.getString("addr");
      				
      				data.setId(id);
      				data.setName(name);
      				data.setPhone(phone);
      				data.setAddr(addr); */
      				
      			
      				%>
      				<%-- <c:set var="cols" value="<%= cols %>"/>
      				<c:forEach items="${items}" var="item">
      				<c:set var="cols" value="${item}" />
      				</c:forEach> --%>
      				
      				<%-- <jsp:setProperty property="id" name="data" value="${items[0]}"/>
      				<jsp:setProperty property="name" name="data" value="${items[1]}"/>
      				<jsp:setProperty property="phone" name="data" value="${items[2]}"/>
      				<jsp:setProperty property="addr" name="data" value="${items[3]}"/> --%>
      				
      				<%-- <td><c:out var="id" value="${data.id}"/><td>
      				<td><c:out var="name" value="${data.name}"/><td>
      				<td><c:out var="phone" value="${data.phone}"/><td>
      				<td><c:out var="addr" value="${data.addr}"/><td> --%>
      				
      				<%-- <td><%= data.getId() %><td>
      				<td><%= data.getName() %><td>
      				<td><%= data.getPhone() %><td>
      				<td><%= data.getAddr() %><td> --%>
      				
      				<c:forEach items=${items } var="item">
      				<td>${item}</td>
      				</c:forEach>
      				
      				
      				 <td><a href="updateForm.jsp?id=${id}">수정</a></td>
            <td><a href="remove.jsp?id=${id}">삭제</a></td>
            </tr>
            <%
        	session.setAttribute("id", data);
      			
      		}
      	}catch(Exception e){
      		e.printStackTrace();
      	}
      %>
         
           
          
    	<tr align = center>
    	<td colspan=6>
         <a href="addrForm.jsp"> 사용자 추가 </a>&nbsp;&nbsp; 
        </td>
        </tr>
   </center>
</body>
</html>