package org.web.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;
import org.web.dto.MemberDto;

public class MemberSelect implements MemberService{
	
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDao dao = MemberDao.getInstance();
		
		List<MemberDto> members = dao.selectAll();
		
		String returnURL="";
		
		if(members.isEmpty()) {
			System.out.println("조회할 회원 X");
			returnURL="/index.do";
		}else {
			System.out.println("회원목록");
			returnURL="/memberList.jsp";
			request.setAttribute("members", members);
		}
		
		request.setAttribute("returnURL", returnURL);
		
	}

}
