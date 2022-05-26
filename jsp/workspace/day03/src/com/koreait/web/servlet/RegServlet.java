package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regit")
public class RegServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// 요청 한글처리 (필수)
//		arg0.setCharacterEncoding("UTF-8");
		
		// 응답 한글처리 (필수)
//		arg1.setCharacterEncoding("UTF-8");
//		arg1.setContentType("text/html charset=UTF-8");
		
		PrintWriter out = arg1.getWriter();
		
		String title = arg0.getParameter("title");
		String content = arg0.getParameter("content");
		
		out.println(title);
		out.println(content);
		
	}
	
}


