package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopDelete implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("��ǰ ����");

		Scanner input = new Scanner(System.in);
		System.out.println("������ no �Է�");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();
		
		// === ���� Ȯ�� === //
		// ��ǰ(��ǰ��ȣ)�� �մ��� ���� ��ȸ select count(*) from shop0131
		// -> 1�̸� ��ǰ ���� 0 �̸� ��ǰ ����
		int isShop = dao.sExist(no);

		if (isShop != 1) {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�.");
			return; // executeQueryService() ����
		}
		// === ���� Ȯ�� === //

		int result = dao.sDelete(no);

		if (result != 1) {
			System.out.println("��ǰ ���� ����");
		} else {
			System.out.println("��ǰ ���� ����!");
		}

	}

}
