package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		
		System.out.println("È¸¿øÅ»Åð");
		
		//DAO
		MemberDao dao = new MemberDao();
		int result = dao.delete();
		
		if(result!=1) {
			System.out.println("È¸¿øÅ»Åð ½ÇÆÐ");
		}else {			
			System.out.println("È¸¿øÅ»Åð ¼º°ø");
		}
	}

}
