package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopInsert implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("��ǰ ���");

		Scanner input = new Scanner(System.in);
		System.out.println("no �Է�: ");
		int no = input.nextInt();
		System.out.println("title �Է�: ");
		String title = input.next();
		System.out.println("detail �Է�: ");
		String detail = input.next();
		System.out.println("writer �Է�: ");
		String writer = input.next();
		System.out.println("isFile �Է�: ");
		int isfile = input.nextInt();

		// �̱���
		ShopDao dao = ShopDao.getInstance();

		// 1. �Ű����� ������
//		int result = dao.sInsert(int no, String title, String detail, String writer, int isfile)

		// 2. ��ü -> DTO (���, ���� �� ���)
		ShopDto board = new ShopDto(no, title, detail, writer, isfile);

		// === ���� Ȯ�� === //
		// ��ǰ(��ǰ��ȣ)�� �մ��� ���� ��ȸ select count(*) from shop0131
		// -> 1�̸� ��ǰ ���� 0 �̸� ��ǰ ����
		int isShop = dao.sExist(board.getNo());

		if (isShop == 1) {
			System.out.println("ȸ������ ����.�̹� ������ �ֽ��ϴ�");
			return; // executeQueryService() ����
		}
		// === ���� Ȯ�� === //

		int result = dao.sInsert(board);

		if (result != 1) {
			System.out.println("��ǰ ��� ����");
		} else {
			System.out.println("��ǰ ��� ����!");
		}

	}

}
