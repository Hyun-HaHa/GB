package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")	// .do로 끝나는 요청을 한꺼번에 catch
public class DoFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		doProcess(req, resp);
		
	}	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		doProcess(req, resp);
		
		
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URI : " + req.getRequestURI());
		
		String requestURI = req.getRequestURI();
		String responseURI = null;
		
		if (requestURI.equals("/fc/do1.do")) {
			// do1.do 에 대한 업무처리
//			req.setAttribute("result", "do1으로 요청보내기!");				// 업무처리
//			req.getRequestDispatcher("do1.jsp").forward(req, resp);		// 응답
			responseURI = new Do1().execute(req, resp);
			
		} else if (requestURI.equals("/fc/do2.do")) {
			// do2.do 에 대한 업무처리
//			req.setAttribute("result", "do2으로 요청보내기!");
//			req.getRequestDispatcher("do2.jsp").forward(req, resp);
			responseURI = new Do2().execute(req, resp);
			
		} else if (requestURI.equals("/fc/do3.do")) {
			// do3.do 에 대한 업무처리
//			req.setAttribute("result", "do3으로 요청보내기!");
//			req.getRequestDispatcher("do3.jsp").forward(req, resp);
			responseURI = new Do3().execute(req, resp);
			
		}
		
		// 응답 처리를 한번에 해준다. (위에 중복된 코드가 많아서)
		req.getRequestDispatcher(responseURI).forward(req, resp);
		
	}
	
	
}
