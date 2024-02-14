package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberExist implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("유무 확인");

		Scanner input = new Scanner(System.in);

		System.out.println("확인할 No 입력");
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();

		int result = dao.mExist(no);
		
		if(result!=1) {
			System.out.println("회원가입 가능");
		}else {
			System.out.println("회원가입 불가.이미 존재하는 회원입니다.");
		}

	}

}
