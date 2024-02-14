package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOneService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원조회(한명-> 회원번호)");

		Scanner input = new Scanner(System.in);

		System.out.println("회원번호");// 123,,,
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();
		// -> 회원번호(기본키) 회원이 이미 있는지 확인
		int isMember = dao.isNoChecked(no);
		
		if (isMember == 0) {
			System.out.println("조회 할 회원이 없습니다.");
			return;
//			throw new IllegalArgumentException("조회 번호가 없다");//spring boot
		}			
		
		MemberDto member = dao.selectOne(no);

		if (member != null) {
			System.out.print("회원번호: " + member.getNo());
			System.out.print("아이디: " + member.getUserId());
			System.out.print(", 비빌번호: " + member.getUserPw());
			System.out.print(", 나이: " + member.getAge());
			System.out.println(", 이름: " + member.getName());
		} else {
			System.out.println("조회할 회원이 없다.");
		}

	}

}
