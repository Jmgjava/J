package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ������");

		Scanner input = new Scanner(System.in);

		System.out.println("ȸ����ȣ");// 123,,,
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();
		// -> ȸ����ȣ(�⺻Ű) ȸ���� �̹� �ִ��� Ȯ��
		int isMember = dao.isNoChecked(no);

		if (isMember == 0) {
			System.out.println("���� �� ȸ���� �����ϴ�.");
			return;
//			throw new IllegalArgumentException("��ȸ ��ȣ�� ����");//spring boot
		}

		int result = dao.delete(no);

		if (result != 1) {
			System.out.println("ȸ������ Fail!");
		} else {
			System.out.println("ȸ������ Success!");
		}

	}
}
