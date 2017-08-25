<%@page import="test.DBAction"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.sql.*, javax.naming.*, javax.sql.*, bean.AddrBean"%>

<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	DBAction db = DBAction.getInstance();
	String sql = "delete from addrbook where id=?";
	PreparedStatement pstmt = db.getConnection().prepareCall(sql);
	pstmt.setString(1, id);
	int result = pstmt.executeUpdate();
	String msg = result > 0 ? "Success" : "Fail";
	response.sendRedirect("addrlist.jsp?result="+msg);
%>

<body>
	
</body>
</html>