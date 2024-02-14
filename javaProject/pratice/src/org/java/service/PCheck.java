package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PCheck implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원 개별 조회");

		Scanner input = new Scanner(System.in);

		System.out.println("조회할 회원 No: ");
		int no = input.nextInt();

		PDao dao = PDao.getInstance();

		PDto result = dao.pCheck(no);

		if (result != null) {
			System.out.print("No: " + result.getNo() + " ");
			System.out.print("ID: " + result.getUserId() + " ");
			System.out.print("Pw: " + result.getUserPw() + " ");
			System.out.print("Age: " + result.getAge() + " ");
			System.out.print("Name: " + result.getName() + " ");
			System.out.println();
		}else {
			System.out.println("조회할 회원이 존재하지 않습니다");
		}
	}

}
