<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userTest" class="beans.UserTest"/>
<jsp:setProperty property="*" name="userTest"/>
<jsp:useBean id="userService" class="service.UserService"/>


<%
	out.println(userTest);
	userService.insert(userTest);
%>