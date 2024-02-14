package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectOne implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		// 1. ��ǰ ��ȣ�� �˻� (no)
 		System.out.println("��ǰ��ȣ�� �˻�");

		Scanner input = new Scanner(System.in);

		System.out.println("��ȸ�� ��ǰ no �Է�: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();

		ShopDto board = new ShopDto();

		// === ���� Ȯ�� === //
		// ��ǰ(��ǰ��ȣ)�� �մ��� ���� ��ȸ select count(*) from shop0131
		// -> 1�̸� ��ǰ ���� 0 �̸� ��ǰ ����
		int isShop = dao.sExist(no);

		if (isShop != 1) {
			System.out.println("��ȸ�� ��ǰ�� �������� �ʽ��ϴ�.");
			return; // executeQueryService() ����
		}
		// === ���� Ȯ�� === //

		ShopDto result = dao.sSelectOne(no);

		if (result != null) {
			System.out.println("��ǰ ��ȣ :" + result.getNo());
			System.out.println("��ǰ ���� :" + result.getTitle());
			System.out.println("��ǰ ���� :" + result.getDetail());
			System.out.println("��ǰ ����� :" + result.getWriter());
			if (result.getIsfile() != 1) {
				System.out.print("��ǰ �̹��� ����");
			} else {
				System.out.print("�̹��� ���� " + result.getIsfile());
			}
		} else {
			System.out.println("��ȸ�� ��ǰ�� �����ϴ�.");
		}



	}

}
