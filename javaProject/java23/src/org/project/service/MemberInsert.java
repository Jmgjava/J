package org.project.service;

import java.io.IOException;
import java.sql.SQLException;

import org.project.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("»∏ø¯∞°¿‘");

		// Dao -> insert()
		
		// ΩÃ±€≈Ê ∆–≈œ
		MemberDao dao = MemberDao.getInstance();
		dao.insert();
	}

}
