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

		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		PrintWriter out = arg1.getWriter();
		
		String title = arg0.getParameter("title");
		String content = arg0.getParameter("content");
		
		out.println(title);
		out.println(content);
		// http://localhost:9090/regit?title=test&content=test_title%0D%0A 
		// -> get 방식으로 넘어옴
		// -> 문자열 길이에 한계가 있다.
	}
	
}


