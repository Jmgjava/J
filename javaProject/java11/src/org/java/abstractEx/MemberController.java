package org.java.abstractEx;

import java.util.Scanner;

import org.java.service.ExcuteCommand;

public class MemberController {

	public static void main(String[] args) {

		// ������ -> �θ�Ÿ���� ��ü���� ������ �ڽİ�ü�� ������ �� �ִ�.
		MemberService service = null;

		Scanner scn = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.println("�Է�: ");
			String input = scn.next();

			if (input.equals("insert")) {
				System.out.println("ȸ������");
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
				System.out.println("���α׷� ����");
				bool = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		scn.close();
	}

}
