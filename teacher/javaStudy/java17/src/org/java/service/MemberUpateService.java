package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberUpateService implements MemberService{

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원수정");
		
		MemberDao dao= new MemberDao();
		int result=dao.update();
		
		if(result!=1) {
			System.out.println("회원수정 Fail!");
		}else {
			System.out.println("회원수정 Success!");
		}
		
	}

}
