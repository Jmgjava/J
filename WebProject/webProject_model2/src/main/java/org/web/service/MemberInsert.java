package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		int result = 0;

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String gender = request.getParameter("gender");
		//
		String[] hobbyArr = request.getParameterValues("hobby");
		String hobby = "";
		for (String str : hobbyArr) {
			hobby += str;
		}
		String memo = request.getParameter("memo");

		MemberDao dao = MemberDao.getInstance();

		int results = dao.insert(userId, userPw, gender, hobby, memo);

		String returnURL = "";

		if (result != 1) {
			System.out.println("Fail");
			returnURL = "/index.jsp";
		} else {
			System.out.println("success");
			returnURL = "memberList.jsp";
		}

		request.setAttribute("returnURL", returnURL);

	}

}
