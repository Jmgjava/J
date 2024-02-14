package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService{

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원조회(전체회원)");
		
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> members= dao.selectAll();
		
		// 콘솔에 출력  foreach문
		if(members.isEmpty()) {
			System.out.println("조회할 회원이 없습니다.");
		}else {
			for(MemberDto member: members) {
				System.out.print("회원번호: " + member.getNo());
				System.out.print("아이디: " + member.getUserId());
				System.out.print(", 비빌번호: " + member.getUserPw());
				System.out.print(", 나이: " + member.getAge());
				System.out.println(", 이름: " + member.getName());
			}
		}
		
	}
}
