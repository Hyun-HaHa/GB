<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="join.jsp" name="joinForm" method="post">
		아이디	<input type="text" name="userid"><br>
		비밀번호	<input type="password" name="userpw"><br>
		이름		<input type="text" name="username"><br>
		핸드폰 번호	<input type="text" name="userphone"><br>
		<br>
<!-- 		<input type="submit">  -->
		<input type="button" value="회원가입" onclick="sendit()">
	</form>
	
	<script >
		function sendit() {
			// validation check
			// 아이디 "" 체크
			// 비밀번호 "" 체크
			// 비밀번호 8자리 이상 체크
			// 이름 "" 체크
			// 휴대폰 "" 체크
			let joinForm = document.joinForm;
			
			let idTag = joinForm.userid;
			let pwTag = joinForm.userpw;
			let nameTag = joinForm.username;
			let phoneTag = joinForm.userphone;
			
			if (idTag.value == "") {
				alert("아이디를 입력해 주세요.")
				idTag.focus();
				return false;
			}
			
			if (pwTag.value == "") {
				alert("비밀번호를 입력해 주세요.")
				pwTag.focus();
				return false;
			}
			
			if (pwTag.value.length < 8) {
				alert("비밀번호는 8자리 이상 입력해 주세요.")
				pwTag.focus();
				return false;
			}
			
			if (nameTag.value == "") {
				alert("이름을 입력해 주세요.")
				nameTag.focus();
				return false;
			}
			
			if (phoneTag.value == "") {
				alert("전화번호를 입력해 주세요.")
				phoneTag.focus();
				return false;
			}
			
			joinForm.submit();
		}
	</script>
</body>
</html>