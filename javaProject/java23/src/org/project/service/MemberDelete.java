package org.project.service;

import java.io.IOException;
import java.sql.SQLException;

import org.project.dao.MemberDao;

public class MemberDelete implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ������");

		MemberDao dao = MemberDao.getInstance();
		dao.delete();

	}

}
