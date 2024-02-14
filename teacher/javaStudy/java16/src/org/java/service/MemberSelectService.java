package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {

		System.out.println("회원조회");

		// DAO
		MemberDao dao = new MemberDao();
		// public MemberDto select() -> return member;
		MemberDto member = dao.select();
		
		if(member!=null) {
			System.out.println("회원번호: "+member.getNo() );
			System.out.println("아이디: "+member.getUserId() );
			System.out.println("비빌번호: "+member.getUserPw() );
			System.out.println("이름: "+member.getName() );
			System.out.println("나이: "+member.getAge() );
		}else {
			System.out.println("조회할 회원 없습니다.");
		}

	}

}
