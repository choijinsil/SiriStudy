<%@page import="java.util.HashSet"%>
<%@page import="beans.UserVote"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Set<UserVote> voteList = (Set) application.getAttribute("Vote");
	if (voteList == null) {
		voteList = new HashSet();
	}

	int[] cnt = new int[4];
	for (UserVote u : voteList) {
		if ("라오스".equals(u.getFrom())) {
			cnt[0]++;
		}else if("스페인".equals(u.getFrom())) {
			cnt[1]++;
		}else if("헝가리".equals(u.getFrom())) {
			cnt[2]++;
		}else if("로마".equals(u.getFrom())) {
			cnt[3]++;
		}
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>내가 가고 싶은 여행지</h2>

	<form action="vote_page.jsp">
		<table border="1">
			<tr>
				<td>여행지</td>
				<td>득표수</td>
			</tr>

			<tr>
				<td><input type="radio" name="from" value="라오스">라오스</td>
				<td><%=cnt[0]%></td>

			</tr>

			<tr>

				<td><input type="radio" name="from" value="스페인">스페인</td>
				<td><%=cnt[1]%></td>
			</tr>

			<tr>
				<td><input type="radio" name="from" value="헝가리">헝가리</td>
				<td><%=cnt[2]%></td>
			</tr>

			<tr>
				<td><input type="radio" name="from" value="로마">로마</td>
				<td><%=cnt[3]%></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="투표하기"></td>
			</tr>
		</table>
	</form>

</body>
</html>