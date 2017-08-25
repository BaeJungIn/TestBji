<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.sql.*, javax.naming.*, javax.sql.*,bean.UserInfo" %>
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
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String regist = request.getParameter("regist");

//이후 자동화
UserInfo bean = new UserInfo();
bean.setId(id);
bean.setPass(pw);
bean.setName(name);
bean.setRegist(regist);

//DB insert
String sql = "insert into userinfo(id,pass,name,regist) value(?,?,?,?)";
Connection conn = getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, bean.getId());
pstmt.setString(2, bean.getPass());
pstmt.setString(3, bean.getName());
pstmt.setString(4, bean.getRegist());

int result = pstmt.executeUpdate();
String msg = result > 0 ? "Success" : "Fail";
response.sendRedirect("userinfolist.jsp?result="+msg); //encode하면 안되고 sendredirect 써야함
%>
<body>

</body>
</html>