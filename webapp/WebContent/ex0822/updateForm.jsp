
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="java.sql.*, javax.naming.*, javax.sql.*, bean.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%
   request.setCharacterEncoding("UTF-8");
   String id = request.getParameter("id");
   AddrBean addr = (AddrBean) session.getAttribute(id);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <center>
      <h3>* �ּҷ� ���� *</h3>
   </center>
   <hr />
   <table width="100%">
      <tr>
         <td align="right"><jsp:include page="../menu.jsp" flush="false"></jsp:include>
         </td>
      </tr>
      <tr>
         <td align="center">
            <form method="post" action="addrUpdate.jsp">
               <table border=1>
                  <tr>
                     <td colspan=2 align=center>����� �߰�</td>
                  </tr>
                  <tr>
                     <td>���̵�</td>
                     <td><input type="text" name="id" value="<%=addr.getId()%>">
                     </td>
                  </tr>
                  <tr>
                     <td>�̸�</td>
                     <td><input type="text" name="phone"
                        value="<%=addr.getPhone()%>"></td>
                  </tr>
                  <tr>
                     <td>�ּ�</td>
                     <td><input type="text" name="addr"
                        value="<%=addr.getAddr()%> "></td>
                  </tr>
                  <tr>
                     <td colspan=2 align="center"><input type="submit"
                        value="����� �߰�"> <input type="reset" value="Reset">
                     </td>
                  </tr>
               </table>
            </form>
         </td>
      </tr>
   </table>

</body>
</html>