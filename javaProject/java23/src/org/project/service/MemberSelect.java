package org.project.service;

import java.io.IOException;
import java.sql.SQLException;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelect implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원조회");

		MemberDao dao = MemberDao.getInstance();
		dao.select();

	}

}
