package org.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.project.service.MemberDeleteService;
import org.project.service.MemberInsertService;
import org.project.service.MemberSelectService;
import org.project.service.MemberService;
import org.project.service.MemberUpdateService;
public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("Controller");
		// ������ �Է�
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		MemberService service = null;

		while (bool) {

			System.out.println("������ �Է�(insert,update,delete,select)");
			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("ȸ������ ����");
				bool = false;
			} else {
				System.out.println("�������Է� ����~!");
			}

		}
	}
}
