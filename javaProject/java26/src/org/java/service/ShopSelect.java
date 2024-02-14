package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelect implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("��ǰ ��ȸ");

		ShopDao dao = ShopDao.getInstance();
		List<ShopDto> members = dao.sSelect();

		System.out.println("======for-each��=====");
		if (members.isEmpty()) {
			System.out.println("��ȸ�� ��ǰ�� �����ϴ�.");
		} else {
			System.out.println("��ü ��ǰ���");
			for (ShopDto member : members) {
				System.out.print("��ǰ��ȣ: " + member.getNo() + " ");
				System.out.print("��ǰ����: " + member.getTitle() + " ");
				System.out.print("��ǰ����: " + member.getDetail() + " ");
				System.out.print("��ǰ�����: " + member.getWriter() + " ");
				if (member.getIsfile() != 1) {
					System.out.print("��ǰ �̹��� ����");
				} else {
					System.out.print("�̹��� ���� " + member.getIsfile());
				}
				System.out.println();
			}

			System.out.println("=====forEach��=====");
			members.forEach(member -> {
				System.out.print("��ǰ��ȣ: " + member.getNo() + " ");
				System.out.print("��ǰ����: " + member.getTitle() + " ");
				System.out.print("��ǰ����: " + member.getDetail() + " ");
				System.out.print("��ǰ�����: " + member.getWriter() + " ");
				if (member.getIsfile() != 1) {
					System.out.print("��ǰ �̹��� ����");
				} else {
					System.out.print("�̹��� ���� " + member.getIsfile());
				}
				System.out.println();
			});
			
		}
	}

}
