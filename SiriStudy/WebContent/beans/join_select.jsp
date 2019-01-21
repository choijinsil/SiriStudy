<%@page import="beans.UserTest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userService" class="service.UserService"/>
    <%
    List<UserTest> list= userService.select();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 가입된 회원 목록</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>회원 ID</th>
			<th>회원 이름</th>
			<th>회원 이메일</th>
		</tr>
		<%for(UserTest t: list){ %>
		<tr>
			<td><a href="join_detail.jsp?id=<%=t.getId()%>"><%=t.getId() %></a></td>
			<td><%=t.getUserId() %></td>
			<td><%=t.getUserName() %></td>
			<td><%=t.getUserEmail() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>