package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ������");

		Scanner input = new Scanner(System.in);

		System.out.println("ȸ�� ��ȣ: ");
		int no = input.nextInt();
		System.out.println("ȸ�� ID: ");
		String userId = input.next();
		System.out.println("ȸ�� PW: ");
		String userPw = input.next();
		System.out.println("ȸ�� �̸�: ");
		String name = input.next();
		System.out.println("ȸ�� ����: ");
		int age = input.nextInt();

		MemberDao dao = new MemberDao();
		int rs = dao.insert(no, userId, userPw, name, age);

		if (rs != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}

	}

}
