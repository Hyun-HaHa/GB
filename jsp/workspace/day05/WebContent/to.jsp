<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

	// 파라미터를 받아오기
	String ans = request.getParameter("ans");
	// 화면에 출력할 결과 문자열
	String msg = "정답이 아닙니다.";
	
	if(Integer.parseInt(ans) == 300) {
		msg = "정답입니다.";
	}
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><h1>응답결과</h1></div>
	<div><p><%=msg %></p></div>
</body>
</html>