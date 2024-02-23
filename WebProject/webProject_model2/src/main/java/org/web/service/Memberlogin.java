package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.web.dao.MemberDao;

public class Memberlogin implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그인");
		int result=0;
		
		// 아이디 비밀번호가 동시에 일치 할 때 로그인
		// 로그인 성공하면 session을 1시간 설정
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		String returnURL="";
		
		result=dao.login(userId, userPw);
		
		HttpSession session = request.getSession();
		
		
		if(result!=1) {
			System.out.println("로그인 실패");
			returnURL="/index.do";
		} else {
			System.out.println("로그인 성공");
			returnURL="/memberList.do";
			
			session.setAttribute("sessionId", userId);
			session.setMaxInactiveInterval(60*60);
		}
		
		request.setAttribute("returnURL", returnURL);
	}

}
