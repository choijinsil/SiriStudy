<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="member.MemberDAOImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="member.MemberDAOImpl" />
<jsp:useBean id="memberDto" class="member.MemberDTO" />
<jsp:setProperty property="*" name="memberDto" />

<c:set var="memberList" value="${member.select() }"/>

<%
	// 회원가입 완료
	// join_f.jsp에서 데이터를 수신받는 클래스를 만든다.
	// jsp use bean은 html과 java객체를 매핑하는 곳
	// mybatis는 java객체와 database를 매핑하는 곳
	member.save(memberDto);

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 리스트</h2>
	<table border="1">
		<tr>
			<th>순번</th>
			<th>이름</th>
		</tr>
		
		<c:forEach var="joinMember" items="${memberList }" varStatus="status">
			<tr>
				<td>${memberDto.id }</td>
				<td><a href="/SiriStudy/member/join_detail.do?id="${joinMember.id}>${joinMember.userId }</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>