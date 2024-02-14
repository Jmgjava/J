package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;

import org.java.memberdao.MemberDao;

public class MemberUpdateService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원수정");
		
		//DAO
		MemberDao dao = new MemberDao();
		int result =dao.update();
		
		if(result!=1) {
			System.out.println("회원수정실패");
		}else {
			System.out.println("회원수정성공");
		}
	}
}
