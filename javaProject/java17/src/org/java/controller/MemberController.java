package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService;
import org.java.service.MemberService;
import org.java.service.MemberUpdateService;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("Controller");

		// SQL(������ �����ͺ��̽� CRUD���) -> RDBMS(�����������ͺ��̽�): oracle, mysql
		// insert(C), select(R), update(U), delete(D)

		Scanner input = new Scanner(System.in);

		// �������Է�

		boolean bool = true;

		while (bool) {
			System.out.println("������ �Է� : insert, select, update, delete");
			String query = input.next();

			MemberService service = null; // ��ü���� �⺻�� : null

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
				System.out.println("���α׷� ����");
				bool = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
//				throw new IllegalArgumentException("������ �Է� ����");
			}
		}
	}

}
