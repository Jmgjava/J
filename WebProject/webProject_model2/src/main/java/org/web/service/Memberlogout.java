package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Memberlogout implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그아웃");
		
		HttpSession session = request.getSession();
		
		if(session!=null) {
			session.invalidate();
		}
		
		request.setAttribute("returnURL", "/index.do");

	}

}
