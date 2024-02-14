package org.web.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;
import org.web.dto.MemberDto;

public class MemberselectService implements MemberService {

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원목록조회");

		MemberDao dao = MemberDao.getInstance();

		List<MemberDto> member = dao.mselect();

		String returnURL = "";

		if (!member.isEmpty()) {
			// 회원목록 "member"
			request.setAttribute("member", member);
			returnURL = "select.jsp";
		} else {
			request.setAttribute("member", null);
			returnURL = "select.jsp";
		}

		request.setAttribute("returnURL", returnURL);
	}

}
