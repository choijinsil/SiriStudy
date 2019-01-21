<%@page import="beans.UserTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userTest" class="beans.UserTest"/>
<jsp:setProperty property="*" name="userTest"/>
<jsp:useBean id="userService" class="service.UserService"/>

<%
	
	
	UserTest u=userService.select(userTest.getId());
	
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="join_update_page.jsp">
<div>
<input type="hidden" name="id" value="<%=u.getId()%>">
회원 ID: <%=u.getUserId() %><br/>
회원 비밀번호:<input type="password" name="userPass" value="<%=u.getUserPass()%>"><br/>
회원 이름:<input type="text" name="userName" value="<%=u.getUserName()%>"><br/>
회원 e-mail:<input type="text" name="userEmail" value="<%=u.getUserEmail()%>"><br/>

<input type="submit" value="수정하기">

</div>
</form>
</body>
</html>