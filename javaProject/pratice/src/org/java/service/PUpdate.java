package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PUpdate implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원 수정");

		Scanner input = new Scanner(System.in);

		System.out.println("수정할 No 입력: ");
		int no = input.nextInt();
		System.out.println("ID 입력: ");
		String userID = input.next();
		System.out.println("Pw 입력: ");
		String userPw = input.next();
		System.out.println("Age 입력: ");
		int age = input.nextInt();
		System.out.println("Name 입력: ");
		String name = input.next();

		PDao dao = PDao.getInstance();

		PDto board = new PDto(no, userID, userPw, age, name);

		int result = dao.pUpdate(board);

		if (result != 1) {
			System.out.println("회원수정 실패");
		} else {
			System.out.println("회원수정 성공");
		}
	}

}
