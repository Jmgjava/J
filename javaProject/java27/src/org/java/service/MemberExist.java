package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberExist implements MemberService {

	@Override
	public void executequeryService() throws IOException, SQLException {
		System.out.println("���� Ȯ��");

		Scanner input = new Scanner(System.in);

		System.out.println("Ȯ���� No �Է�");
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();

		int result = dao.mExist(no);
		
		if(result!=1) {
			System.out.println("ȸ������ ����");
		}else {
			System.out.println("ȸ������ �Ұ�.�̹� �����ϴ� ȸ���Դϴ�.");
		}

	}

}
