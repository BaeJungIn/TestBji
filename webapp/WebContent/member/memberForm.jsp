<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script language = "JavaScript">
	function checkID(){
		var userinput = document.userinput;
		if(!userinput.id.value){
			alert("ID�� �Է��ϼ���");
			return false;
		}
		
		if(! userinput.pass.value){
			alert("��й�ȣ�� �Է��ϼ���");
			return false;
		}
		if(!userinput.username.value){
			alert("����� �̸��� �Է��ϼ���");
		}
		
	}
	function openConfirmid(userinput){
		if(userinput.id.value==""){
			alert("���̵� �Է��ϼ���");
			return;
		}
		
		url = "idCheck.do?id="+userinput.id.value;
		
		open(url, "confirm", "toolbar=no, resizable=no, width=300, height=200");
	}
</script>
</head>
<body>
	<form method = "post" action = "join.do" name="userinput" onsubmit="return checkIt();">
	<table width="600" border="1" cellspacing="0" cellpadding="3" align="center">
		<tr>
		<td colspan="2" height="39" align="center" bgcolor="#b0e0e6">
			<font size="1"><b>ȸ������</b></font></td>
		</tr>
		<tr>
		<td width="200" bgcolor="#b0e0e6"><b>���̵� �Է�</b></td>
		<td width="400" bgcolor="#b0e0e6">&nbsp;</td>
		</tr>
		<tr>
		<td width="200">����� ID</td>
		<td width="400">
			<input type="text" name="id" size="10" maxlength="12">
			<input type="button" name="confirm" value="ID�ߺ�Ȯ��" onClick="openConfirmid(this.form)">
		</td>
		</tr>
		<tr>
		<td width="200">��й�ȣ</td>
		<td width="400">
			<input type="password" name="pass" size="15" maxlength="12">
		</td>
		</tr>
		<!-- <tr>
		<td width="200">��й�ȣ Ȯ��</td>
		<td width="400">
			<input type="password" name="passwd2" size="15" maxlength="12">
		</td>
		</tr>
		<tr>
		<td width="200" bgcolor="#b0e0e6"><b>�������� �Է�</b></td>
		<td width="400" bgcolor="#b0e0e6">&nbsp;</td>
		</tr> -->
		<tr>
		<td width="200">����� �̸�</td>
		<td width="400">
			<input type="text" name="name" size="15" maxlength="10">
		</td>
		</tr>
		<tr>
		<td width="200">�ּ�</td>
		<td width="400">
			<input type="text" name="regist" size="15" maxlength="10">
		</td>
		</tr>
		<!-- <tr>
		<td width="200">�ֹε�Ϲ�ȣ</td>
		<td width="400">
			<input type="text" name="jumin1" size="7" maxlength="6">
			<input type="text" name="jumin1" size="7" maxlength="7">
		</td>
		</tr> -->
		<!-- <tr>
		<td width="200">E-Mail</td>
		<td width="400">
			<input type="text" name="email" size="40" maxlength="30">
		</td>
		</tr>
		<tr>
		<td width="200">����</td>
		<td width="400">
			<input type="text" name="content" size="60" maxlength="50">
		</td>
		</tr> -->
		<tr>
		<td colspan="2" align="center" bgcolor="#b0e0e6" >
			<input type="submit" name="confirm" value="��  ��">
			<input type="reset" name="reset" value="�ٽ��Է�">
			<input type="button" value="���� ����" onClick="javascript:window.location='main.jsp'">
		</td>
		</tr>
	</table>
	</form>
</body>
</html>