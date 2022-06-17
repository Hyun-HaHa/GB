<%@page import="com.koreait.beans.MemberBean"%>
<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDAO mdao = new MemberDAO();
		String userid = request.getParameter("userid");
		MemberBean user = mdao.searchById(userid);
		request.setAttribute("user", user);
		pageContext.forward("searchview.jsp");		// 리다이렉트는 저장된 정보가 다 날아간다. 그래서 꼭 forward사용
		
		
	%>
</body>
</html>