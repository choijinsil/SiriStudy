<%@page import="service.UserService"%>
<%@page import="beans.UserTest"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userTest" class="beans.UserTest"/>
<jsp:setProperty property="*" name="userTest"/>
<jsp:useBean id="userService" class="service.UserService"/>
    <%
    	
    	System.out.println(userTest.getId());
    	out.println(userService.select(userTest.getId()));
    	UserTest u=userService.select(userTest.getId());
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script>
	function del(_id){
		//confirm(_id+"번을 삭제하시겠습니까?");
		var isOk=confirm(_id+"번을 삭제하시겠습니까?");
		if(isOk==false){
			
		}else{	//삭제
			location.href="join_delete.jsp?id="+_id;
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>회원 상세페이지</h2>
<p onclick='del(<%=u.getId() %>)'>순번: <%=u.getId() %></p>
유저 Id:<%=u.getUserId() %><br/>
이름:<%=u.getUserName() %><br/>
E-Mail:<%=u.getUserEmail() %><br/>



</body>
</html>
