package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;

public class ShopDeleteService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("��ǰ����");

		// ��ǰ ��ȣ�� ���� ��ǰ�� ����
		Scanner input = new Scanner(System.in);

		System.out.print("��ǰ��ȣ: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();

		// ���� ��ǰ ���� Ȯ��
		int isShop = dao.isShop(no);
		if (isShop != 1) {
			System.out.println("������ ��ǰ(��ǰ��ȣ)�� �����ϴ�.");
			return;
		}
		// ������ ��ǰ�� ������ ����
		int result = dao.shopDelete(no);

		if (result != 1) {
			System.out.println("��ǰ���� ����");
		} else {
			System.out.println("��ǰ���� ����");
		}

	}
}
