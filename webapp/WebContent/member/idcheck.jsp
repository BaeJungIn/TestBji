<%@page import="test.DBAction"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/member/member.js"></script>
</head>
<body>
	<h2>���̵� �ߺ�Ȯ��</h2>
	<form action = "idCheck.do" method="get" name="frm">
	���̵� <input type="text" name="id" value="${id}">
	<input type="submit" value="�ߺ� üũ"><br>
	<c:if test="${result ==1 }">
		<script type="text/javascript">
			opener.document.frm.id.value="";
		</script>
		${id } �� �̹� ������� ���̵��Դϴ�.
	</c:if>
	<c:if test="${result==-1 }">
		${id } �� ��� ������ ���̵��Դϴ�.
		<input type="button" value="���" class="cancel" onclick="idok('${id}')">
	</c:if>
	</form>
</body>
</html>