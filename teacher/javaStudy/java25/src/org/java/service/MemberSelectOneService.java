package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOneService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		
		System.out.println("회원 조회");
		
		System.out.println("조회할 아이디 입력");
		
		Scanner input=new Scanner(System.in);
		
		String userId=input.next();
		
		MemberDao dao= MemberDao.getInstance();
		
		MemberDto member=dao.selectOne(userId);
		
		if(member!=null) {
			System.out.print("아이디: " + member.getUserId());
			System.out.print(", 비빌번호: " + member.getUserPw());
			System.out.print(", 나이: " + member.getAge());
			System.out.println(", 이름: " + member.getName());			
		}else {
			System.out.println("조회 회원 없습니다!");
		}
		
		
	}

}
