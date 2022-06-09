<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		sendRedirect	: jsp영역에서 페이지 이동 시키는 곳
		location		: 자바 스크립트 단에서 페이지 이동
	-->
	
	<%
		session.removeAttribute("session_id");
		response.sendRedirect("login_view.jsp");
	%>
</body>
</html>