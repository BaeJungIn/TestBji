<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.sql.*, javax.naming.*, javax.sql.*,bean.MemberBean" %>
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
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pass = request.getParameter("pass");
String name = request.getParameter("name");

MemberBean bean = new MemberBean();
bean.setId(id);
bean.setPass(pass);
bean.setName(name);

//DB insert
String sql = "insert into userinfo(id,pass,name,regist) value(?,?,?,?)";
Connection conn = getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, bean.getId());
pstmt.setString(2, bean.getPass());
pstmt.setString(3, bean.getName());

int result = pstmt.executeUpdate();
String msg = result > 0 ? "Success" : "Fail";
response.sendRedirect("userinfolist.jsp?result="+msg); //encode�ϸ� �ȵǰ� sendredirect �����
%>
<body>

</body>
</html>