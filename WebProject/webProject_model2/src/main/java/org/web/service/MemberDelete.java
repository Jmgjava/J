package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;

public class MemberDelete implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원 삭제");

		String userId = request.getParameter("userId");

		MemberDao dao = MemberDao.getInstance();

		String returnURL = "";

		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("삭제 실패");
			returnURL="/index.do";
		} else {
			System.out.println("삭제 성공");
			returnURL="/memberList.do";
		}

		request.setAttribute("returnURL", returnURL);
	}

}
