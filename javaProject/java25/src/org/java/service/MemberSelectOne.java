package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOne implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("ȸ�� �ϳ��� ��ȸ");
		// 2. ��ȸ�� ���̵� ����
		System.out.println("��ȸ�� ���̵� ����");

		Scanner input = new Scanner(System.in);

		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();

		MemberDto member = dao.selectone(userId);

		if (member != null) {
			System.out.print("���̵�: " + member.getUserId() + " ");
			System.out.print("��й�ȣ: " + member.getUserPW() + " ");
			System.out.print("����: " + member.getAge() + " ");
			System.out.print("�̸�: " + member.getName() + " ");
			System.out.println();
		} else {
			System.out.println("��ȸ�� ȸ�� ����");
		}

	}

}
