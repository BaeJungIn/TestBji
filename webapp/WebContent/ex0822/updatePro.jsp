<%@page import="test.DBAction"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="java.sql.*, javax.naming.*, javax.sql.*, bean.AddrBean"%>
  <jsp:useBean id="user" scope="page" class="bean.AddrBean"/>
    <jsp:setProperty property="*" name="data" />
    <%
    	DBAction db = DBAction.getInstance();
    String sql = "update addrbook set name='"+user.getName().trim()+"', phone='"+user.getPhone().trim()+"', addr='"+user.getAddr().trim()+"', where id='"+user.getId().trim()+"'";
    PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
    pstmt.executeUpdate();
    response.sendRedirect("addrList.jsp");
    %>
