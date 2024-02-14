package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {
	
	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원삭제");
		
	}
	
	

}
