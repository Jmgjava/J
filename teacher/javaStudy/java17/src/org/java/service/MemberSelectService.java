package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ����ȸ");

		MemberDao dao = new MemberDao();
		// ȸ�� ��ȸ -> DB ���̺� ��ȸ get
		MemberDto member = dao.select();

		if (member != null) {
			System.out.println("��ȸ�� ȸ���� �ֽ��ϴ�.");
		} else {
			System.out.println("��ȸ�� ȸ���� �����ϴ�.");
		}

	}

}
