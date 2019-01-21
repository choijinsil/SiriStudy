<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userTest" class="beans.UserTest"/>
<jsp:setProperty property="*" name="userTest"/>

<%
	if("admin".equals(userTest.getId())&&"admin".equals(userTest.getUserPass())){
		// 세션에 값을 저장
		session.setAttribute("uid",userTest.getId());
		
		%>
		<script>alert("로그인 성공");
		location.href="beans_form.jsp";
		</script><%
		
	}else{
		%><script>
		alert("로그인 실패");
		location.href="beans_form.jsp";
		</script><%
	}

%>
