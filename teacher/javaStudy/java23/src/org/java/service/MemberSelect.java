package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberSelect implements MemberService{

	@Override
	public void excutQueryService() throws SQLException, IOException {

		System.out.println("È¸¿øÁ¶È¸");
		// ½Ì±ÛÅæ -> "°´Ã¼¸¦ ÇÑ¹ø¸¸ »ý¼º"
		MemberDao dao= MemberDao.getInstance();
		dao.select();
	}
}
