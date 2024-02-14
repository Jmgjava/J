package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopExist implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("��ǰ ���� Ȯ��");


		Scanner input = new Scanner(System.in);

		System.out.println("��ȸ�� ��ǰ no �Է�: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();
		int result = dao.sExist(no);

		if (result != 1) {
			System.out.println("��ǰ�� �����ϴ�.");
		} else {
			System.out.println("��ǰ�� �ֽ��ϴ�.");
		}

	}

}
