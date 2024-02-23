package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;
import org.web.dto.MemberDto;

public class MemberUpdate implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원수정");

		int no = Integer.parseInt(request.getParameter("no"));
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

		int result = dao.update(no, userPw, userId, gender, hobby, memo);

		String returnURL = "";

		if (result != 1) {
			System.out.println("수정실패");
			returnURL = "/index.jsp";

		} else {
			System.out.println("수정성공");
			returnURL = "/memberList.do";
		}

		request.setAttribute("returnURL", returnURL);

	}

}
