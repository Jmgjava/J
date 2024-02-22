package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.MemberInsert;
import org.web.service.MemberSelect;
import org.web.service.MemberService;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("POST");

		request.setCharacterEncoding("UTF-8");

		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String url = uri.substring(path.length());

		System.out.println(url + " <- url");

		MemberService service = null;
		String returnURL = "";

		if (url.equals("/index.do")) {
			returnURL = "/index.jsp";
		} else if (url.equals("/join.do")) {
			returnURL = "/join.jsp";
		} else if (url.equals("/joinOk.do")) {
			service = new MemberInsert();
			service.executeQueryService(request, response);
			
			returnURL=(String) request.getAttribute("returnURL"); // 회원목록
		} else if (url.equals("/memberList.do")) {
			service = new MemberSelect();
			service.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);

	}

}
