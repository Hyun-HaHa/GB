/**
 * 
 */
// 회원가입 폼 validation check
function sendit() {
	let userform = document.joinForm;
	
	let userId = userform.userid;
	let userPw = userform.userpw;
	let userPwRe = userform.userpw_re;
	let userName = userform.username;
	let userPhone = userform.userphone;
	
	// 아이디 "" 처리
	if (userId.value == "") {
		alert("아이디를 입력해 주세요.");
		userId.focus();
		return false;
	}
	// 아이디 5자리 이상, 16자리 미만
	if (userId.value.length < 5 || userId.value.length >= 16) {
		alert("아이디는 5자 이상, 16자 미만으로 입력해 주세요.");
		userId.focus();
		return false;
	}
	// 비밀번호 "" 처리
	if (userPw.value == "") {
		alert("비밀번호를 입력해 주세요.");
		userPw.focus();
		return false;
	} else {	
		// 비밀번호 8자리 이상
		if (userPw.value.length < 8) {
			alert("비밀번호는 8자 이상으로 입력해 주세요.");
			userPw.focus();
			return false;
		}
	}
	
	// 비밀번호, 비밀번호 확인이 같은지 체크
	if (userPwRe.value != userPw.value) {
		alert("비밀번호가 일치하지 않습니다.");
		userPwRe.focus();
		return false;
	}
	// 이름이 "" 처리
	if (userName.value == "") {
		alert("이름을 입력해 주세요.");
		userName.focus();
		return false;
	}
	// 휴대폰 번호 "" 처리
	if (userPhone.value == "") {
		alert("휴대폰 번호를 입력해 주세요.");
		userPhone.focus();
		return false;
	}
	
	userform.submit();
}

function checkId(userid) {
	if (userid == " ") {
		alert("아이디를 입력해 주세요.");
		return false;
	} else {
		// ajax 통신
		let xhr = new XMLHttpRequest();
	      xhr.open("GET", "idcheck.jsp?userid=" + userid, true);
	      xhr.send();
	      xhr.onreadystatechange = function(){
	         if( xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200 ){
	            if(xhr.responseText.trim() == "ok") {	// xhr.responseText 값을 받아올 때 공백이 들어갈 수도 있어서 trim()메서드로 공백제거를 해준다.
	            	// 사용할 수 있는 아이디 입니다.
	            	document.getElementById("text").innerHTML = "사용할 수 있는 아이디 입니다.";
	            } else {
	            	// 중복된 아이디 입니다.
	            	document.getElementById("text").innerHTML = "중복된 아이디 입니다.";
	            	
	            }
	         }         
	      }
		
	}
}















