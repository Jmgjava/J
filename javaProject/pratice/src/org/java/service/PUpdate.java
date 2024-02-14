package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PUpdate implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("ȸ�� ����");

		Scanner input = new Scanner(System.in);

		System.out.println("������ No �Է�: ");
		int no = input.nextInt();
		System.out.println("ID �Է�: ");
		String userID = input.next();
		System.out.println("Pw �Է�: ");
		String userPw = input.next();
		System.out.println("Age �Է�: ");
		int age = input.nextInt();
		System.out.println("Name �Է�: ");
		String name = input.next();

		PDao dao = PDao.getInstance();

		PDto board = new PDto(no, userID, userPw, age, name);

		int result = dao.pUpdate(board);

		if (result != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
	}

}
