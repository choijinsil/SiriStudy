<%@page import="javax.tools.DocumentationTool.Location"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userTest" class="beans.UserTest"/>
<jsp:setProperty property="*" name="userTest"/>
<jsp:useBean id="userService" class="service.UserService"/>

<%
	out.println(userTest);
	userService.update(userTest);
	pageContext.forward("join_detail.jsp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>

</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


</body>
</html>