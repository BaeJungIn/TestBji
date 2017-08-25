<%@page import="bean.UserInfo2"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
 <%@page import="java.sql.*,javax.naming.*,javax.sql.*" %>
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
		String id = request.getParameter("userID");
		String sql = "select name from member2 where id='"+id+"'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		try{
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			pstmt.setString(1, UserInfo2);
			
			while(rs.next()){
	%>
	<tr>
	<%
				for(int i=1;i<=cols;i++){
	%>
		<td>
			<%= rs.getString(i) %>
		</td>
	<%
				}
	%>
		<tr>
	<%
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	%>
	
	
	
	<%
		
		
		if(userID.equals(request.getParameter("userID")) && userPwd.equals(request.getParameter("userPwd"))){
			session.setAttribute("loginUser", userID);
			response.sendRedirect("10_main.jsp");
		}else{
			response.sendRedirect("actionTagForm.jsp");
		}
	%>
</body>
</html>