package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PDelete implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("ȸ�� ����");

		Scanner input = new Scanner(System.in);

		System.out.println("������ No �Է�: ");
		int no = input.nextInt();

		PDao dao = PDao.getInstance();

		int result = dao.pDelete(no);

		if (result != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
	}
}
