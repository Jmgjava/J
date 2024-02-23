package org.web.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;
import org.web.dto.MemberDto;

public class MemberDetail implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("상세조회");

		String userId = request.getParameter("userId");

		MemberDao dao = MemberDao.getInstance();

		MemberDto member = dao.detail(userId);

		String returnURL = "";

		if (member != null) {
			System.out.println("OK");
			returnURL = "/memberDetail.jsp";

			request.setAttribute("member", member);

		} else {
			System.out.println("조회할 회원이 없습니다.");
			returnURL = "/index.do";
		}
		
		request.setAttribute("returnURL", returnURL);
	}

}
