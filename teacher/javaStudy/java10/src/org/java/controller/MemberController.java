package org.java.controller;

import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

//사용자(클라이언트) 요청 받아서 -> 서비스에 일을 시키고
//-> 서비스에서 결과 값을 반환 받아서 -> 사용자(클라이언트)에 되돌려줌(View)
public class MemberController {

	public static void main(String[] args) {

		// query가 insert면 "회원가입"
		// query가 select면 "회원조회"
		// query가 update면 "회원수정"
		// query가 delete면 "회원탈퇴"
		// query가 exit면 "쿼리문 종료"
		// query가 위4가지 이외에는 "쿼리문입력오류"
		// 가 각각에 해당하는 excuteQueryService 출력 되도록
		// if~else if~else활용해서
		// 프로그래밍 해보세요 ~3시~ 50분까지

		// 다형성
		// 부모타입 객체 참조 변수로 자식객체 잠조
		MemberService mService = null;
		Scanner input = new Scanner(System.in);
		// while문이용해서 -> exit-> while문 종료		
		boolean bool=true;
		
		while(bool) {			
			System.out.println("쿼리문 입력하세요");
			System.out.print("QUREY: ");
			String query = input.next();
			
			if (query.equals("insert")) {
				// 회원가입 일을 시킨다.
				mService = new MemberInsert();
				mService.excuteQueryService();
			} else if (query.equals("select")) {
				// 회원조회 일을 시킨다.
				mService = new MemberSelect();
				mService.excuteQueryService();
			} else if (query.equals("update")) {
				// 회원수정 일을 시킨다.
				mService = new MemberUpdate();
				mService.excuteQueryService();
			} else if (query.equals("delete")) {
				// 회원탈퇴 일을 시킨다.
				mService = new MemberDelete();
				mService.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("쿼리문 종료");
				bool=false;
			} else {
				System.out.println("쿼리문 입력 오류");
			}
		}

	}
}
