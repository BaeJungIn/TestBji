
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%@page import="java.sql.*, javax.naming.*, javax.sql.*,bean.AddrBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%!
		public Connection getConnection(){
			Connection conn = null;
			try{
				InitialContext initctx = new InitialContext();
				Context ctx = (Context)initctx.lookup("java:comp/env");
				DataSource ds = (DataSource)ctx.lookup("jdbc/mysql");
				conn = ds.getConnection();
			}catch(Exception e){
				e.printStackTrace();
			}
			return conn;
		}
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <c:set var = "member" value="<%=new bean.AddrBean() %>"></c:set>
   <c:set target="${member}" property="id">member.getId()</c:set>
   <c:set target="${member}" property="name">member.getName()</c:set>
   <c:set target="${member}" property="phone">member.getPhone()</c:set>
   <c:set target="${member}" property="addr">member.getAddr()</c:set>
   \${member.id} = ${member.id} <br>
   \${member.name} = ${member.name} <br>
   \${member.phone} = ${member.phone} <br>
   \${member.addr} = ${member.addr}
   <hr>
  
</body>
</html>