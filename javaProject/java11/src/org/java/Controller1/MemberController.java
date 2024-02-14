package org.java.Controller1;

import java.util.Scanner;

import org.project.service.MemberDelete;
import org.project.service.MemberInsert;
import org.project.service.MemberSelect;
import org.project.service.MemberService;
import org.project.service.MemberUpdate;

public class MemberController {

	public static void main(String[] args) {

		MemberService service = null;
		Scanner scn = new Scanner(System.in);

		boolean bl = true;

		while (bl) {

			System.out.println("insert, select, update, delete, exit \n 작업 입력: ");
			String input = scn.next();

			if (input.equals("insert")) {
				service = new MemberInsert();
				service.excuteQueryService();

			} else if (input.equals("select")) {
				service = new MemberSelect();
				service.excuteQueryService();

			} else if (input.equals("update")) {
				service = new MemberUpdate();
				service.excuteQueryService();

			} else if (input.equals("delete")) {
				service = new MemberDelete();
				service.excuteQueryService();

			} else if (input.equals("exit")) {
				System.out.println("프로그램 종료");
				bl = false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		scn.close();

	}
}
