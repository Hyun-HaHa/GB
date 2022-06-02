<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String username = request.getParameter("username");
	String userbirth = request.getParameter("userbirth");
	
	// DB처리 
	//
	//
	
	// forward	: request 객체 유지
	// 사용자가 요청한 정보를 그대로 유지된 채로 출력할 때 forward 데이터 유지를 한다.
// 	pageContext.forward("object_result.jsp");
	
	// redirect 방식	: request 객체 재생성
	// 사용자의 결제 할 때 카드번호 등 숨겨야 할 경우 redirect방식을 사용한다. 데이터 손실을 본다.
	response.sendRedirect("object_result.jsp");
	// 입력한 정보가 null로 출력이 된다.
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>