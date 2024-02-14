package org.java.membercontroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.memberservice.MemberDeleteService;
import org.java.memberservice.MemberInsertService;
import org.java.memberservice.MemberSelectService;
import org.java.memberservice.MemberService;
import org.java.memberservice.MemberUpdateService;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("Controller");

		// �������Է�
		MemberService service = null;
		Scanner scn = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("������ �Է�(insert,update,select,delete)");
			String query = scn.next();
			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("ȸ������ ����");
				bool = false;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

	}

}
