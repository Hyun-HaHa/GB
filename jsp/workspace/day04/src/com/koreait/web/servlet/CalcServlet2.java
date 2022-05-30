package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class CalcServlet2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
		// session 객체
		// session 에서 저장한 값을 다른 브라우저에서 부를려하면 nullPoint 에러가 난다.
		HttpSession session = arg0.getSession();
		
		PrintWriter out = arg1.getWriter();
		
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		int value = 0;
		
		if(!value_.equals("")) {
			value = Integer.parseInt(value_);
		}
		
		// 계산
		if (op.equals("=")) {
			// session 저장된 값
			int x = (Integer)session.getAttribute("value");		// 객체를 가져오기 때문에 형변환이 필요하다.
			// 2번째로 요청보낸 값
			int y = value;
			String operator = (String)session.getAttribute("op");
			
			int result = 0;
			
			if (operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			
			out.println("결과 값 : " + result);
			
		} else {		// op값이 + 또는 -, session 저장
			session.setAttribute("value", value);
			session.setAttribute("op", op);		// 객체로 저장
		}
		
	}
}
