<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="java.sql.*, javax.naming.*, javax.sql.*, bean.UserInfo"%>
<%!
public UserInfo bean = new UserInfo();
public Connection getConnection() {
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
String name = request.getParameter("name");
String pass = request.getParameter("pass");
String regist = request.getParameter("regist");


//정상적 처리 이후
Connection conn = getConnection();
String sql = "update userinfo set pass=?, name=?, regist=? where id=?";
PreparedStatement pstmt = conn.prepareStatement(sql);

pstmt.setString(1, pass);
pstmt.setString(2, name);
pstmt.setString(3, regist);
pstmt.setString(4, id);
int result = pstmt.executeUpdate();
String msg = result > 0 ? "Success" : "Fail";
response.setCharacterEncoding("utf-8");
response.sendRedirect("login/main.jsp?result="+URLEncoder.encode(msg));
%>
<body>

</body>
</html>