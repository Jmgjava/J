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

			System.out.println("insert, select, update, delete, exit \n �۾� �Է�: ");
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
				System.out.println("���α׷� ����");
				bl = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		scn.close();

	}
}
