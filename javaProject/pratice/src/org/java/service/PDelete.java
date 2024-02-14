package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PDelete implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원 삭제");

		Scanner input = new Scanner(System.in);

		System.out.println("삭제할 No 입력: ");
		int no = input.nextInt();

		PDao dao = PDao.getInstance();

		int result = dao.pDelete(no);

		if (result != 1) {
			System.out.println("회원삭제 실패");
		} else {
			System.out.println("회원삭제 성공");
		}
	}
}
