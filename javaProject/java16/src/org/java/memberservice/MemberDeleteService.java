package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;

import org.java.memberdao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ������");

		// DAO
		MemberDao dao = new MemberDao();
		int result = dao.delete();

		if (result != 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
