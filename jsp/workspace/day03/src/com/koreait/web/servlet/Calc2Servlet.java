package com.koreait.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String xStr = arg0.getParameter("X");
		String yStr = arg0.getParameter("Y");
		String op = arg0.getParameter("operator");
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		if (xStr != null && !xStr.equals("")) {
			x = Integer.parseInt(xStr);
		}
		
		if (yStr != null && !yStr.equals("")) {
			y = Integer.parseInt(yStr);
		}
		
		if (op.equals("λ§μ")) {
			result = x + y;
		}
		
		if (op.equals("λΊμ")) {
			result = x - y;
		}
		
		arg1.getWriter().println("result is " + result);
	}
}
