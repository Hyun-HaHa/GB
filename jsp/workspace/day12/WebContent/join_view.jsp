<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#text{
		color: red;
		font-weight: bold;
	}
</style>

</head>
<body>
	<!-- model 1방식 (프로젝트는 model 2방식으로 해야한다~) -->
	
	<form name="joinForm" method="post" action="join_db.jsp">
		<p id="text">사용할 수 있는 아이디입니다.</p>
		<p>
			<label>
				아이디<input type="text" name="userid">
			</label>
			<input type="button" value="중복확인" onclick="checkId(joinForm.userid.value)">
		</p>		
		<p>
			<label>
				비밀번호 : <input type="password" name="userpw">
			</label>
		</p>
		<p>
			<label>
				비밀번호 확인 : <input type="password" name="userpw_re">
			</label>
		</p>
		<p>
			<label>
				이름 : <input type="text" name="username">
			</label>
		</p>
		<p>
			성별<br>
			<label>남자<input type="radio" name="usergender" value="M" checked></label>
			<label>여자<input type="radio" name="usergender" value="W"></label>
		</p>
		<p>
			휴대폰 번호 : <input type="text" name="userphone">
		</p>
		<p>
			<input type="button" value="가입완료" onclick="sendit()">
		</p>
	</form>
	
	<script src="user.js"></script>
</body>
</html>