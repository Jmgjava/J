package org.java.service;

import java.util.Scanner;

import org.java.controller.MemberService;
import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {

	public int a;

	@Override
	public void excuteQueryService() {
		System.out.println("ȸ�� ����");

		// DB�� ������ ȸ�������� �Է¹޾Ƽ� �����ͺ��̽��� ���� -> DAO
		MemberDao dao = new MemberDao();

		boolean bool = true;
		Scanner scn = new Scanner(System.in);

		while (bool) {

			System.out.println("ȸ����ȣ: ");
			int no = scn.nextInt();// ȸ����ȣ

			System.out.println("ȸ��ID: ");
			String userId = scn.next(); // ȸ�� Id

			System.out.println("ȸ��PW: ");
			String userPw = scn.next(); // ȸ�� PW

			System.out.println("ȸ���̸�: ");
			String name = scn.next(); // ȸ�� �̸�

			System.out.println("��ȭ��ȣ: ");
			String number = scn.next(); // ��ȭ��ȣ

			// ��ȯ���� 1�̸� ȸ������ ����, 1�� �ƴϸ� ȸ������ ����
			int result = dao.insert(no, userId, userPw, name, number);

			if (result == 1) {
				System.out.println("ȸ������ ����");
				bool = false;
			} else {
				System.out.println("ȸ������ ����");

			}
		}
		scn.close();

	}

}
