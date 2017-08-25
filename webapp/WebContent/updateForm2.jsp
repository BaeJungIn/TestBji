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
   }%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");

if(id != null){
	Connection conn = getConnection();
	String sql = "select * from userinfo where id = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	
	try{
		if(rs.next()){
			bean.getId();
			bean.getPass();
			bean.getName();
			bean.getRegist();
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		if(rs!= null) rs.close();
		if(pstmt!= null) pstmt.close();
	}
	
}
%>
<body>
<h2>update 예제</h2>
<form method="post" action="updatePro2.jsp">
<table border="1">
<input type ="hidden" name=id value='<%=bean.getId() %>'/>
<%-- name : <input type = "text" name="name" value = '<%=bean.getName() %>' disable="false"><br>
pass : <input type = "text" name="pass" value = '<%=bean.getPass() %>' disable="false"><br>
regist : <input type = "text" name="regist" value = '<%=bean.getRegist() %>' disable="false"><br> --%>
id : <input type = "text" name="id" value = id disable="false"><br>
name : <input type = "text" name="name" value = name disable="false"><br>
pass : <input type = "text" name="pass" value = pass disable="false"><br>
regist : <input type = "text" name="regist" value = "regist" disable="false"><br>
<input type="submit" value="전송">
</table>
</form>
</body>
</html>