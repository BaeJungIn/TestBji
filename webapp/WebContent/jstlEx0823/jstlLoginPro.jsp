<%@page import="bean.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.sql.*, javax.naming.*, javax.sql.*,bean.AddrBean" %>
    <jsp:useBean id="data" scope="page" class="bean.AddrBean"/>
    <jsp:setProperty property="*" name="data" />
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%

//DB insert
String sql = "insert into addrbook values(?,?,?,?)";
Connection conn = getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);

pstmt.setString(1, data.getId());
pstmt.setString(2, data.getName());
pstmt.setString(3, data.getPhone());
pstmt.setString(4, data.getAddr());

int result = pstmt.executeUpdate();
String msg = result > 0 ? "Success" : "Fail";
response.sendRedirect("addrlist.jsp?result="+msg); //encode하면 안되고 sendredirect 써야함
%>
<body>

</body>
</html>