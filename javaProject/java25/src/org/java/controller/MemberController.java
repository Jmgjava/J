package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberSelectOne;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("controller");

		MemberService service = null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("������ �Է�");

			String query = input.next();

			if (query.equals("insert")) {
				// ȸ������
				service = new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				// ȸ����ȸ
				service = new MemberSelect();
				service.excuteQueryService();
			} else if (query.equals("selectone")) {
				// ȸ����ȸ
				service = new MemberSelectOne();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				// ȸ������
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				// ȸ��Ż��
				service = new MemberDelete();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				// ����
				System.out.println("����");
				bool = false;
			} else {
				System.out.println("�Է� ����");
			}
		}
	}

}
