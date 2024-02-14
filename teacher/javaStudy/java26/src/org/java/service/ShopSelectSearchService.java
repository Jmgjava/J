package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectSearchService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("��ǰ �˻�");

		// 1. ��ǰ��ȣ -> ��ǰ �˻�
//		System.out.print("��ǰ�˻���ȣ: ");
//
//		Scanner input = new Scanner(System.in);
//		int no = input.nextInt();
//
//		ShopDao dao = ShopDao.getInstance();
//
//		int isShop = dao.isShop(no);
//
//		if (isShop != 1) {
//			System.out.println("��ȸ�� ��ǰ(��ǰ��ȣ)�� ����.");
//			return;
//		}
//		// ��ȣ�� �ش� �ϴ� ��ǰ�� ��ȸ -> get
//		ShopDto shop = dao.searchNo(no);
//
//		if (shop != null) {
//			System.out.print("��ǰ��ȣ: " + shop.getNo());
//			System.out.print(", ��ǰ��: " + shop.getTile());
//			System.out.print(", ��ǰ��: " + shop.getDetail());
//			System.out.print(", ��ǰ�����: " + shop.getWriter());
//			if (shop.getIsFile() != 1) {
//				System.out.println(",�̹���(0): ��ǰ�̹����� �����ϴ�.");
//			} else {
//				System.out.println(",�̹�����(1): " + shop.getIsFile());
//			}
//		} else {
//			System.out.println("��ȸ�� ��ǰ(��ǰ��ȣ)�� ����.");
//		}

		// 2.��ǰ����ڸ� �˻� -> ��ǰ����ڰ� ����� ��ǰ��ϸ� ��ȸ(�˻�)

		System.out.print("��ǰ����� �Է�: ");

		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.searchWriter(writer);

		// ����ڰ� �ִ��� üũ 		
		
		if (writerList.isEmpty()) {
			System.out.println("��ȸ ����� �����ϴ�.");
		} else {
			System.out.println("��ǰ���");
			for (ShopDto shop : writerList) {
				System.out.print("��ǰ��ȣ: " + shop.getNo());
				System.out.print(", ��ǰ��: " + shop.getTile());
				System.out.print(", ��ǰ��: " + shop.getDetail());
				System.out.print(", ��ǰ�����: " + shop.getWriter());
				if (shop.getIsFile() != 1) {
					System.out.println(",�̹���(0): ��ǰ�̹����� �����ϴ�.");
				} else {
					System.out.println(",�̹�����(1): " + shop.getIsFile());
				}
			}

		}

	}

}
