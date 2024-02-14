package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberDelete implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("ȸ�� ����");

		Scanner input = new Scanner(System.in);

		System.out.println("������ ȸ�� no�Է�: ");
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();

		int has = dao.mExist(no);
		if (has != 1) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}

		MemberDto insertBoard = new MemberDto(no, null, null, no, null);

		int result = dao.mDelete(insertBoard);

		if (result != 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");			
		}
	}

}
