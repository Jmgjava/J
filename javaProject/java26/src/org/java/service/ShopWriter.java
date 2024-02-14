package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopWriter implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		// 2. ����ڷ� �˻� (writer)
		System.out.println("����� �Է�: ");
		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.sSelectWriter(writer);

		// ����ڰ� �ִ��� üũ

		if (writerList.isEmpty()) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		} else {
			System.out.println("��ǰ���");
			for (ShopDto writers : writerList) {
				System.out.print("��ǰ��ȣ: " + writers.getNo() + " ");
				System.out.print("��ǰ����: " + writers.getTitle() + " ");
				System.out.print("��ǰ����: " + writers.getDetail() + " ");
				System.out.print("��ǰ�����: " + writers.getWriter() + " ");
				if (writers.getIsfile() != 1) {
					System.out.print("��ǰ �̹��� ����");
				} else {
					System.out.print("�̹��� ���� " + writers.getIsfile());
				}
				System.out.println();
			}
		}

	}

}
