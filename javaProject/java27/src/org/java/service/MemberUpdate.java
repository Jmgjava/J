package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberUpdate implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("ȸ�� ����");

		Scanner input = new Scanner(System.in);

		System.out.println("������ ȸ�� no�Է�: ");
		int no = input.nextInt();
		System.out.println("�ٲ� userId�Է�: ");
		String userId = input.next();
		System.out.println("�ٲ� userPw�Է�: ");
		String userPw = input.next();
		System.out.println("�ٲ� age�Է�: ");
		int age = input.nextInt();
		System.out.println("�ٲ� name�Է�: ");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();
		
		int has = dao.mExist(no);
		if (has != 1) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}

		MemberDto insertBoard = new MemberDto(no, userId, userPw, age, name);

		int result = dao.mUpdate(insertBoard);
	}

}
