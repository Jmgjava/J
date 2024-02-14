package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원조회");

		MemberDao dao = new MemberDao();
		// 회원 조회 - > DB테이블 조회 get
		MemberDto member=dao.select();
		
		if(member!=null) {			
			System.out.println("조회할 대상 있음");
		}else {
			System.out.println("조회할 대상 없음");
		}
	}

}
