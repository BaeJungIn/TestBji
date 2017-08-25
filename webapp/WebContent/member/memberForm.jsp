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
			alert("ID를 입력하세요");
			return false;
		}
		
		if(! userinput.pass.value){
			alert("비밀번호를 입력하세요");
			return false;
		}
		if(!userinput.username.value){
			alert("사용자 이름을 입력하세요");
		}
		
	}
	function openConfirmid(userinput){
		if(userinput.id.value==""){
			alert("아이디를 입력하세요");
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
			<font size="1"><b>회원가입</b></font></td>
		</tr>
		<tr>
		<td width="200" bgcolor="#b0e0e6"><b>아이디 입력</b></td>
		<td width="400" bgcolor="#b0e0e6">&nbsp;</td>
		</tr>
		<tr>
		<td width="200">사용자 ID</td>
		<td width="400">
			<input type="text" name="id" size="10" maxlength="12">
			<input type="button" name="confirm" value="ID중복확인" onClick="openConfirmid(this.form)">
		</td>
		</tr>
		<tr>
		<td width="200">비밀번호</td>
		<td width="400">
			<input type="password" name="pass" size="15" maxlength="12">
		</td>
		</tr>
		<!-- <tr>
		<td width="200">비밀번호 확인</td>
		<td width="400">
			<input type="password" name="passwd2" size="15" maxlength="12">
		</td>
		</tr>
		<tr>
		<td width="200" bgcolor="#b0e0e6"><b>개인정보 입력</b></td>
		<td width="400" bgcolor="#b0e0e6">&nbsp;</td>
		</tr> -->
		<tr>
		<td width="200">사용자 이름</td>
		<td width="400">
			<input type="text" name="name" size="15" maxlength="10">
		</td>
		</tr>
		<tr>
		<td width="200">주소</td>
		<td width="400">
			<input type="text" name="regist" size="15" maxlength="10">
		</td>
		</tr>
		<!-- <tr>
		<td width="200">주민등록번호</td>
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
		<td width="200">내용</td>
		<td width="400">
			<input type="text" name="content" size="60" maxlength="50">
		</td>
		</tr> -->
		<tr>
		<td colspan="2" align="center" bgcolor="#b0e0e6" >
			<input type="submit" name="confirm" value="등  록">
			<input type="reset" name="reset" value="다시입력">
			<input type="button" value="가입 안함" onClick="javascript:window.location='main.jsp'">
		</td>
		</tr>
	</table>
	</form>
</body>
</html>