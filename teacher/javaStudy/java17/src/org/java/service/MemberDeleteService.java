package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService{

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ��Ż��");
		
		MemberDao dao= new MemberDao();
		int result=dao.delete();
		
		if(result!=1) {
			System.out.println("ȸ��Ż�� Fail!");
		}else {
			System.out.println("ȸ��Ż�� Success!");
		}
		
	}

}