package org.java.basicApi;

import java.util.Scanner;

public class StringEx66 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("사용자 요청 정보입니다. (/insert.do 입력)");

		boolean bool = true;
		while (bool) {
			System.out.println("/insert.do, /update.do, /select.do, /delete.do\n요청정보입력: ");
			
			String order = input.next();
//			System.out.println(order);

			String rsOrder = order.substring(order.length() - 3);
//			System.out.println(rsOrder);

			if (rsOrder.equals(".do")) {
				
//				System.out.println("요청 정보 ->" + order);
				String url = order.substring(0, order.length() - 3);
//				System.out.println(".do 제외 ->" + url);

				if (url.equals("/insert")) {
					System.out.println("회원가입");
				} else if (url.equals("/update")) {
					System.out.println("회원수정");
				} else if (url.equals("/select")) {
					System.out.println("회원조회");
				} else if (url.equals("/delete")) {
					System.out.println("회원삭제");
				} else {
					System.out.println("다시 입력");
				}

			} else if (order.equals("exit")) {
				System.out.println("서비스 종료");
				bool = false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		
	}

}
