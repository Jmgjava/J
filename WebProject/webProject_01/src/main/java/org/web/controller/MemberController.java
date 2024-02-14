package org.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.MemberInsertService;
import org.web.service.MemberService;
import org.web.service.MemberselectService;

// RequestMapping -> 요청 URL 처리
@WebServlet("*.do")
public class MemberController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 초기화");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get 방식 처리 -> 주로 조회시 -> 브라우저 주소창 입력
		System.out.println("GET");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post방식 처리 -> 주로 추가, 변경, 삭제, 변경, 보안
		System.out.println("POST");

		request.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지

		String uri = request.getRequestURI(); // 요청 URI
		String path = request.getContextPath(); // 기본 Path
		String host = request.getRemoteHost(); // 요청 Host

		String returnURL = uri.substring(path.length());

		System.out.println(uri + " <-uri");
		System.out.println(path + " <-path");
		System.out.println(host + " <-host");
		System.out.println(returnURL + " <-returnURL");

		// 요청에 대한 응답을 처리 -> Servlet -> 요청받고(Controller), 응답(View)
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		MemberService service = null;

		// View -> 1 페이지만 이동시, 2. 데이터가지고 페이지 이동
		if (returnURL.equals("/index.do")) {
			returnURL = "/index.jsp";
		} else if (returnURL.equals("/joinView.do")) {
			returnURL = "/joinView.jsp";
		} else if (returnURL.equals("/joinOk.do")) {
			returnURL = "/joinOk.jsp";
			service = new MemberInsertService();
			service.excuteQueryService(request, response);
			// 이동할 페이지
			returnURL = (String) request.getAttribute("returnURL");
		} else if (returnURL.equals("/loginView.do")) {
			returnURL = "/loginView.jsp";
		} else if (returnURL.equals("/select.do")) {
			returnURL = "/select.jsp";
			service = new MemberselectService();
			service.excuteQueryService(request, response);
		} else {
			returnURL = "/none/none.jsp";
		}

//		View를 분리 -> jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);

//		out.print("<!doctype html>");
//		out.print("<html>");
//		out.print("<head>");
//		out.print("<meta charset='UTF-8'>");
//		out.print("<title>응답HTML 페이지</title>");
//		out.print("</head>");
//		out.print("<body>");
//		out.print("<div>요청 Uri" + uri + "</div>");
//		out.print("<div>요청 Path" + path + "</div>");
//		out.print("<div>요청 Host" + host + "</div>");
//		out.print("</body>");
//		out.print("</html>");
	}

	@Override
	public void destroy() {
		System.out.println("서블릿 종료");
	}

}
