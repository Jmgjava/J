package org.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class TestController extends HttpServlet {

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

		request.setCharacterEncoding("UTF-8"); // 한글, 요청

//		response.setContentType("text/html;charest='UTF-8'");
//		서블릿에서 View를 구현(사용자에게 반환)

//		PrintWriter out = response.getWriter();
//		out.write("<!doctype html>");
//		out.write("<html>");
//		out.write("<head>");
//		out.write(" <meta charset=\"UTF-8\">");
//		out.write("<meta name=\"viewPort\" content=\"width=device-width, initial-scale=1.0\">");
//		out.write("<title>서블릿</title>");
//		out.write("</head>");
//		out.write("<body>");
//		out.write("<h1> 서블릿 </h1>");
//		out.write("<h2>아이디" + request.getParameter("userId") + "</h2>");
//		out.write("</body>");
//		out.write("</html>");
//		out.close();

		String returnURL="/test.jsp";
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);
				
				
	}

}
