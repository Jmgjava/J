package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;

public class PExist implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원 유무 확인");

		Scanner input = new Scanner(System.in);

		System.out.println("확인할할 회원 No: ");
		int no = input.nextInt();

		PDao dao = PDao.getInstance();

		int result = dao.pExist(no);

		if (result != 1) {
			System.out.println("회원가입 가능");
		} else {
			System.out.println("회원가입 불가.이미 존재하는 회원입니다.");
		}
	}

}
