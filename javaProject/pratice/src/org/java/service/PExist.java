package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.PDao;

public class PExist implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("ȸ�� ���� Ȯ��");

		Scanner input = new Scanner(System.in);

		System.out.println("Ȯ������ ȸ�� No: ");
		int no = input.nextInt();

		PDao dao = PDao.getInstance();

		int result = dao.pExist(no);

		if (result != 1) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ �Ұ�.�̹� �����ϴ� ȸ���Դϴ�.");
		}
	}

}
