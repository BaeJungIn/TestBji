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

//�ڵ��ۼ�1 use request method

//�ڵ��ۼ�2 UserInfo ���

//������ ó�� ����
Connection conn = getConnection();
String sql = "update userinfo set pw=?, name=?, regist=? where id=?";
PreparedStatement pstmt = conn.prepareStatement(sql);

pstmt.setString(1, bean.getPass());
pstmt.setString(2, bean.getName());
pstmt.setString(3, bean.getRegist());
pstmt.setString(4, bean.getId());
int result = pstmt.executeUpdate();
String msg = result > 0 ? "Success" : "Fail";
response.setCharacterEncoding("utf-8");
response.sendRedirect("userinfolist.jsp?result="+URLEncoder.encode(msg));
%>
<body>

</body>
</html>