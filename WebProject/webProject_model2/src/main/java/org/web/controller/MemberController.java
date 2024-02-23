package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.MemberDelete;
import org.web.service.MemberDetail;
import org.web.service.MemberInsert;
import org.web.service.MemberSelect;
import org.web.service.MemberService;
import org.web.service.MemberUpdate;
import org.web.service.Memberlogin;
import org.web.service.Memberlogout;

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
		} else if (url.equals("/login.do")) {
			returnURL = "/login.jsp";
		}
		
		else if (url.equals("/joinOk.do")) {
			service = new MemberInsert();
			service.executeQueryService(request, response);
			
			returnURL=(String) request.getAttribute("returnURL"); // 회원목록
		} else if (url.equals("/memberList.do")) {
			service = new MemberSelect();
			service.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		} else if (url.equals("/loginOk.do")) {
			service = new Memberlogin();
			service.executeQueryService(request, response);
			
			returnURL = (String) request.getAttribute("returnURL");
		} else if (url.equals("/logoutOk.do")) {
			service = new Memberlogout();
			service.executeQueryService(request, response);
			
			returnURL = (String) request.getAttribute("returnURL");
		} else if (url.equals("/memberDetail.do")) {
			service = new MemberDetail();
			service.executeQueryService(request, response);
			
			returnURL = (String) request.getAttribute("returnURL");
		} else if (url.equals("/memberUpdateOk.do")) {
			service = new MemberUpdate();
			service.executeQueryService(request, response);
			
			returnURL = (String) request.getAttribute("returnURL");
		} else if (url.equals("/memberDeleteOk.do")) {
			service = new MemberDelete();
			service.executeQueryService(request, response);
			
			returnURL = (String) request.getAttribute("returnURL");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);

	}

}
