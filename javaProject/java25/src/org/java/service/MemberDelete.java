package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDelete implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("ȸ������");

		MemberDao dao = MemberDao.getInstance();

		Scanner input = new Scanner(System.in);

		System.out.println("ID �Է�");
		String userId = input.next();
		
		// ȸ�� ���̵� ����
		int bool = dao.selectBool(userId);
		if (bool != 1) {
			System.out.println("������ ���̵� �������� �ʽ��ϴ�.");
			return;
		}
		

		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("ȸ��Ż�� ����");
		} else {
			System.out.println("ȸ��Ż�� ����");
		}

	}

}
