package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excutQueryService() throws SQLException, IOException {

		System.out.println("회원가입");

		// Dao -> insert()
		
		// 싱글톤 -> 매서드 호출 방법
		MemberDao dao = MemberDao.getInstance();
		dao.insert();
		
		
		
		
	}

}
