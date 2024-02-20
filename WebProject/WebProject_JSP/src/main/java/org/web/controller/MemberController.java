package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dto.MemberDto;

@WebServlet(".do")
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

		// index.do -> index.jsp

		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String url = uri.substring(path.length());
		
		System.out.println(uri+" <- uri");
		System.out.println(path+" <- path");
		System.out.println(url+" <- url");

		String returnURL = "";

		if (url.equals("/index.do")) {
			returnURL = "/index.jsp";
		}else if (url.equals("/join.do")) {
			returnURL = "/join.jsp";
		}
		
//		View -> JSP
	RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
	dispatcher.forward(request, response);
	}

}
