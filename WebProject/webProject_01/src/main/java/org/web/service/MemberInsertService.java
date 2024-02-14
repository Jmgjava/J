package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;
import org.web.dto.MemberDto;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		MemberDao dao = MemberDao.getInstance();

		String userId = request.getParameter("userId"); // joinView.jsp 파일에서 form에 name값이 userId다.
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");

		MemberDto board = new MemberDto(userId, userPw, userName);

		int result = dao.mInsert(board);

		String returnURL = "";

		if (result != 1) {
			System.out.println("가입 실패");
			returnURL = "/index.jsp";
//			response.sendRedirect(returnURL);
		} else {
			System.out.println("가입 성공");
			returnURL = "/loginView.jsp";
		}

		// View
		request.setAttribute("returnURL", returnURL);

	}
}
