<%@page contentType="text/html; charset=UTF-8"%>
<%@ page import="db.DBAction, java.sql.*" %>
<%!
    public DBAction db;
    public Connection conn;
    public String sql;
%>
<html>
    <head>
        <title> ★ 로긴폼 ★ </title>
        <script language="javascript">
            function check(form){
            var id = document.f.id.value;
            var pass = document.f.pass.value;           			
            if(id == ""){
                alert(" 아이디를 입력해주세요 ");
                document.f.id.focus();                                                   
            }else if( pass == "" ){             
                alert(" 암호를 입력해주세요 " );
                document.f.pass.focus();
            }else {                             
                form.submit();
            }
        }
        </script>
    </head>	
    <body><center>							
        <%--
        String id = request.getParameter( "id" );
        String pass = request.getParameter( "pass" );
        if( id == null || pass == null ) {
        --%>	
        <%
            request.setCharacterEncoding("UTF-8");
			String sessionid = (String)session.getAttribute("id"); 
			if(sessionid == null){ 
                  String id = request.getParameter("id");			
                  String pass = request.getParameter("pass");
                  if( id == null || pass == null ) {
		%>	
        <form name = f method="post" action="loginEx.jsp">			
            <br><br><br>				
            <h2> ★  ^^  ★ </h2>		
            <br>				
            <table border=2 cellspacing=0 width=300>					
                <tr>
                    <td align=center height=40><b> ID </b></td>
                    <td align=center> 
                    	<input type="text" style="width: 150px;" 
                    		size=20 maxlength=16 name="id">
                    </td>
                </tr> 					
                <tr>
                    <td align=center height=40><b> PASSWORD </b></td>
                    <td align=center> 
                    	<input type="password"  style="width: 150px;" 
                    		size=20 maxlength=10 name="pass"> 
                    </td>
                </tr>					
                <tr align=center>
                    <td colspan=2 height=40 > 
                    	<input type="button" value=" ok " 
                    		onclick="check(this.form)"> &nbsp;&nbsp; 
                    	<input type="reset" value=" cancel ">
                    </td>
                </tr>
            </table>
        </form>		
        <%
        }else{
            String sql = "select * from userinfo "
                    + " where id='" + id + "' and pass='" + pass + "'";            
            db = DBAction.getInstance();
            conn = db.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();            
            try{
                if( rs.next() ){ 
                	session.setAttribute("id", id);
                    session.setMaxInactiveInterval(10);  
        %>			
        <br><br><br><br><br><br>			
        <h1> " <%= id %> 님, 로그인하셨습니다~~^^* " </h1><p>
        <h1>  <%= id %> 님 세션시간 <%= session.getMaxInactiveInterval() %> 
        		으로 설정 되었습니다...        				
        <%
                }else{
        %>				
         
		<form name=f method="post" action="loginEx.jsp">
			<br>
			<br>
			<br>
			<h2>★ ㅠㅠ ★</h2>
			<br>
			<table border=2 cellspacing=0 width=300>
				<tr>
					<td align=center height=40><b> ID </b></td>
					<td align=center>
						<input type="text" style="width: 150px;"
						size=20 maxlength=16 name="id">
					</td>
				</tr>
				<tr>
					<td align=center height=40><b> PASSWORD </b></td>
					<td align=center>
						<input type="password" style="width: 150px;"
						size=20 maxlength=10 name="pass"></td>
				</tr>
				<tr align=center>
					<td colspan=2 height=40>
						<input type="button" value=" ok "
							onclick="check(this.form)"> &nbsp;&nbsp; 
						<input type="reset" value=" cancel ">
					</td>
				</tr>
			</table>
		</form>
		<%
		                }
		            }catch( SQLException e ){
		                e.printStackTrace();
		            }
		        }
                  
			}
			else{  
			%>  
				<h1><%= sessionid %> 님 로긴중입니다..... <h1><p> 
                                <a href="logout.jsp">로그아웃</a>
			<%
				}  
			%>					
    </center>		
    </body>
</html>