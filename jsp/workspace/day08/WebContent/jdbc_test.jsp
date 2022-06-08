<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
		Connection conn = null;
		// 오라클 접속 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "wjsp";
		String password = "wjsp";
			
		Class.forName(driver);
		System.out.println("jdbc driver 로딩성공!");
		
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("오라클 연결 성공!!");
		
		// sql 쿼리문 작성
		// insert, delete, update
		// create, drop
// 		String sql = "INSERT INTO car(carnum, brand, color, price) values('4', 'sonata', 'black', 50000000)";
// 		String sql = "DELETE car WHERE carnum = 2";
		String sql = "UPDATE car SET BRAND = 'K3' WHERE BRAND = 'sonata'";
		
		// 결과값 변수 선언
		int check = 0;
		
		// 전달 시켜줄 문자 완성
		PreparedStatement pstm = conn.prepareStatement(sql);
		check = pstm.executeUpdate();
		
		System.out.println("check : " + check);
		
		
	%>
</body>
</html>