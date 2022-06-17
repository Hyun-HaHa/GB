package com.koreait.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do2 {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("result", "do2으로 보내기");	// 업무처리
		return "do2.jsp";		// 응답
		
		
	}
}
