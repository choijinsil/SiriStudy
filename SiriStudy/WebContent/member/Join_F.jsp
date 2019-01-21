<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//member/Join_F.jsp	
%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 
<script>
//제이쿼리 적용하기
$(function(){
	$("#joinBtn").click(function(){	//button 클릭 시
		//각 폼의 null 검사
		var state = true;
		var msg = "모든 입력 값은 필수입니다.";
		if(!$("#userId").val()) {			
			state = false
		} 
		if(!$("#userPw").val()) {			
			state = false
		}
		if(!$("#userEmail").val()) {			
			state = false
		}		
		//pw검사
		if($("#userPw").val() != $("#userPwCheck").val()) {			
			state = false
			msg = "비밀번호와 비밀번호 체크의 값이 다릅니다.";
		}
		 
		//state 값에 따라서 전송여부 선택 
		if(state) {
			$("#myform").attr("action", "Join_P.jsp");
			$("#myform").attr("method", "post");
			$("#myform").submit();
		} else {
			alert(msg);
		}
	})
});
</script>
 
</head>
<body>	
	<div class="page-header">
      <h1>회원가입 <small>We Can Do It!!</small></h1>
    </div>
    <div class="col-md-6 col-md-offset-3">
      <form role="form" id="myform">
      	<div class="form-group">
          <label for="userId">유저 ID</label>
          <input type="text" class="form-control" id="userId" name="userId" placeholder="아이디를 입력해 주세요">
        </div>
        <div class="form-group">
          <label for="userPw">비밀번호</label>
          <input type="password" class="form-control" id="userPw" name="userPw" placeholder="비밀번호">
        </div>
        <div class="form-group">
          <label for="userPwCheck">비밀번호 확인</label>
          <input type="password" class="form-control" id="userPwCheck" placeholder="비밀번호 확인">
          <p class="help-block">비밀번호 확인을 위해 다시한번 입력 해 주세요</p>
        </div>            
        <div class="form-group">
          <label for="userEmail">이메일 주소</label>
          <input type="email" class="form-control" id="userEmail" name="userEmail" placeholder="이메일 주소">
        </div>           
        <div class="form-group text-center">
          <button type="button" class="btn btn-info" id="joinBtn">회원가입</button>              
        </div>
      </form>
    </div>
</body>
</html>