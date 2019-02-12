<%@page import="member.MemberDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="member.MemberDAOImpl"/>
<jsp:useBean id="memberDto" class="member.MemberDTO"/>
<jsp:setProperty property="*" name="memberDto"/>


    <%
    // 회원가입 완료
    // join_f.jsp에서 데이터를 수신받는 클래스를 만든다.
    // jsp use bean은 html과 java객체를 매핑하는 곳
    // mybatis는 java객체와 database를 매핑하는 곳
  	member.save(memberDto);
    %>
