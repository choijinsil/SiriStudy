<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String uid=String.valueOf(session.getAttribute("uid"));
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<%
if(!("null".equals(uid))){
	out.println( uid+"환영합니다.");
	%>
	<input type="button" value="로그아웃" onclick="logout()">
	<script type="text/javascript">
		function logout(){
			location.href="beans_logout.jsp"
		}
	</script>
	
	<%
	
}else{
	%>
	<form action="beans_page.jsp">
	<div>
	아이디: <input type="text" name="id"><br/>
	비밀번호: <input type="password" name="pass"><br/>
	
	<input type="submit" value="전송">
	</div>
	</form>
	<%
}
%>
</div>

</body>
</html>