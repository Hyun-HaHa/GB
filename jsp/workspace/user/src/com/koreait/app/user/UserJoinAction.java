package com.koreait.app.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.user.dao.UserDAO;
import com.koreait.app.user.dao.UserDTO;

public class UserJoinAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		UserDAO udao = new UserDAO();	// DB연결
		UserDTO user = new UserDTO();	// 파라미터로 객체를 담는다.
		ActionForward forward = new ActionForward();
		
		user.setUserid(req.getParameter("userid"));
		user.setUserpw(req.getParameter("userpw"));
		user.setUsername(req.getParameter("username"));
		user.setUserphone(req.getParameter("userphone"));
		user.setUseraddr(req.getParameter("useraddr"));
		
		if(udao.join(user)) {		// 회원가입 성공시
			forward.setRedirect(true);
			forward.setPath(req.getContextPath() + "/app/user/loginview.jsp");
			
		} else {					// 회원가입 실패시
			forward.setRedirect(true);
			forward.setPath(req.getContextPath() + "index.jsp");
			
		}
		
		return forward;
	}
	
}
