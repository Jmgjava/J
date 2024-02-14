package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberCheck implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("조회할 상품 No 입력");

		Scanner input = new Scanner(System.in);

		System.out.println("조회할 No 입력: ");
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();

		MemberDto result = dao.sCheck(no);

		if (result != null) {
			System.out.print("No: " + result.getNo() + " ");
			System.out.print("Id: " + result.getUserId() + " ");
			System.out.print("Pw: " + result.getUserPw() + " ");
			System.out.print("Age: " + result.getAge() + " ");
			System.out.print("Name: " + result.getName() + " ");
			System.out.println();
		} else {
			System.out.println("조회할 회원이 없습니다.");
		}
	}

}
