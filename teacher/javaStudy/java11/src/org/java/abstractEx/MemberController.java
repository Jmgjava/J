package org.java.abstractEx;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		
		// 다형성 -> 부모타입의 객체 참조 변수로 자식객체를 참조할수 있다.
		MemberService service=null;

		Scanner input=new Scanner(System.in);
		
		boolean bool=true;
		
		while(bool) {
			System.out.println("쿼리문 입력");
			
			String query =input.next();
			
			if (query.equals("insert")) {
				service = new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelect();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDelete();
				service.excuteQueryService();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				bool=false;
			}else {
				System.out.println("쿼리문 입력오류");
			}
			System.out.println(service);
		}

	}
}
