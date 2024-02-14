package org.java.abstractEx;

import java.util.Scanner;

import org.java.service.ExcuteCommand;

public class MemberController {

	public static void main(String[] args) {

		// 다형성 -> 부모타입의 객체참조 변수로 자식객체를 참조할 수 있다.
		MemberService service = null;

		Scanner scn = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.println("입력: ");
			String input = scn.next();

			if (input.equals("insert")) {
				System.out.println("회원가입");
				service = new MemberInsert();
				service.excutequeryService();
			} else if (input.equals("update")) {
				service = new MemberUpdate();
				service.excutequeryService();
			} else if (input.equals("select")) {
				service = new MemberSelect();
				service.excutequeryService();
			} else if (input.equals("delete")) {
				service = new MemberDelete();
				service.excutequeryService();
			} else if (input.endsWith("exit")) {
				System.out.println("프로그램 종료");
				bool = false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		scn.close();
	}

}
