package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberUpdate implements MemberService {

	@Override
	public void excutQueryService() throws SQLException, IOException {

		System.out.println("ȸ������");
		// �̱��� -> "��ü�� �ѹ��� ����"
		MemberDao dao= MemberDao.getInstance();
		dao.update();
		
	}
}
