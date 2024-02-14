package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ������");

		// DAO

		Scanner scn = new Scanner(System.in);

		System.out.println("ȸ����ȣ: ");
		int no = scn.nextInt();

		System.out.println("ȸ��Id: ");
		String userId = scn.next();

		System.out.println("ȸ��Pw: ");
		String userPw = scn.next();

		System.out.println("ȸ���̸�: ");
		String name = scn.next();

		System.out.println("ȸ������: ");
		int age = scn.nextInt();

		// ���񽺿��� DB���� ��Ų���� ����, DAO
		MemberDao dao = new MemberDao();
		// DB���̺� �����͸� ����
		int rs = dao.insert(no, userId, userPw, name, age);

		// ����1 ��ȯ ���� ��������
		if (rs != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
	}

}
