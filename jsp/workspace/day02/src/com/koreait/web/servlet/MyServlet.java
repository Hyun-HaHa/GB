package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")	// web.xml에서 여러 코드로 작성하지 않고 간단하게 서블릿 연결을 간단하게 하는방법
public class MyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		String paramCnt = arg0.getParameter("cnt");
		System.out.println("paramCnt : " + paramCnt);
		// http://localhost:9090/Hello? 		-> paramCnt : null
		// http://localhost:9090/Hello?cnt=		-> paramCnt : 	
		int cnt = 0;
		
		// 예외처리
		if (paramCnt != null && !paramCnt.equals("")) {		// null이거나 빈 문자열이 아닐경우 Integer로 바꿈
			cnt = Integer.parseInt(paramCnt);	
		} else {	
			cnt = 100;	// 그렇지 않으면 100이라는 임의의 숫자값을 넣어준다.
		}
		
		//int cnt = Integer.parseInt(arg0.getParameter("cnt"));
		System.out.println("cnt : " + cnt);
		
		PrintWriter out = arg1.getWriter();
		out.println("안녕 Servlet Annotation!!!!!");
		
	}
	
}
