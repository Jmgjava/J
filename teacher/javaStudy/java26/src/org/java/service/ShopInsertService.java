package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopInsertService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("��ǰ���");

		Scanner input = new Scanner(System.in);

		System.out.print("��ǰ��ȣ: ");
		int no = input.nextInt();

		System.out.print("��ǰ��: ");
		String title = input.next();

		System.out.print("��ǰ�󼼳���: ");
		String detail = input.next();

		System.out.print("��ǰ�����: ");
		String writer = input.next();

		System.out.print("��ǰ�̹��� �߰�(1,0): ");
		int isFile = input.nextInt();

		// �̱���
		ShopDao dao = ShopDao.getInstance();

		// 1. �Ű����� ����
//		int result = dao.shopInsert(no, title, detail, writer, isFile);

		// 2. ��ü -> Dto -> ���, ����
		ShopDto shop = new ShopDto(no, title, detail, writer, isFile);

		int isShop = dao.isShop(shop.getNo());

		if (isShop != 0) {
			System.out.println("�̹� ���� ��ǰ(��ǰ��ȣ)�� ��� �Ǿ� �ֽ��ϴ�.");
			return;
		}

//		int result2 = dao.shopInsertDto(new ShopDto(no, title, detail, writer, isFile));
		int result2 = dao.shopInsertDto(shop);

		if (result2 != 1) {
			System.out.println("��ǰ��� ����");
		} else {
			System.out.println("��ǰ��� ����");
		}

	}
}
