<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="beans.UserVote"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="userVote" class="beans.UserVote" />
<jsp:setProperty property="*" name="userVote" />
<%
	// application.setAttribute("Test", userVote.getFrom());
	// Set voteList= new HashSet();

	// 어플리케이션 영역에서 voteList가 존재하면 불러오고 없으면 새로 생성한다.
	// application.getAttribute("Vote");
	Set<UserVote> voteList = (Set<UserVote>) application.getAttribute("Vote");
	if (voteList == null) {
		voteList = new HashSet<UserVote>();
	}

	
	voteList.add(userVote);
	System.out.println(voteList);
	application.setAttribute("Vote", voteList);
	
	
	
	
%>
<script>
	alert("<%=userVote.getFrom()%>에 투표 완료 하셨습니다.");
	location.href = "vote_form.jsp";

	function cnt() {
	}
</script>
