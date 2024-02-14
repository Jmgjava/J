package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopUpdateService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("��ǰ����");

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

		// 2. ��ü -> Dto -> ���, ����
		ShopDto shop = new ShopDto(no, title, detail, writer, isFile);

		// ��ǰ(��ǰ��ȣ)�� �ִ��� ���� ��ȸ select count(*) from shop0131 -> 1�̸� ��ǰ ����, 0�̸� ��ǰX
		int isShop = dao.isShop(shop.getNo());

		if (isShop != 1) {
			System.out.println("������ ��ǰ(��ǰ��ȣ)�� ���� ��ȸ �Ҽ� �����ϴ�.");
			return; // executeQueryService() ����			
//			throw new IllegalArgumentException("��ȸ�� ��ǰ��ȣ�� �����ϴ�"); // -> Spring boot 
		}

		int result = dao.shopUpdateDto(shop);

		if (result != 1) {
			System.out.println("��ǰ���� ����");
		} else {
			System.out.println("��ǰ���� ����");
		}

	}
}
