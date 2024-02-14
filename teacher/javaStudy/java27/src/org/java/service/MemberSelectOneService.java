package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOneService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("ȸ����ȸ(�Ѹ�-> ȸ����ȣ)");

		Scanner input = new Scanner(System.in);

		System.out.println("ȸ����ȣ");// 123,,,
		int no = input.nextInt();

		MemberDao dao = MemberDao.getInstance();
		// -> ȸ����ȣ(�⺻Ű) ȸ���� �̹� �ִ��� Ȯ��
		int isMember = dao.isNoChecked(no);
		
		if (isMember == 0) {
			System.out.println("��ȸ �� ȸ���� �����ϴ�.");
			return;
//			throw new IllegalArgumentException("��ȸ ��ȣ�� ����");//spring boot
		}			
		
		MemberDto member = dao.selectOne(no);

		if (member != null) {
			System.out.print("ȸ����ȣ: " + member.getNo());
			System.out.print("���̵�: " + member.getUserId());
			System.out.print(", �����ȣ: " + member.getUserPw());
			System.out.print(", ����: " + member.getAge());
			System.out.println(", �̸�: " + member.getName());
		} else {
			System.out.println("��ȸ�� ȸ���� ����.");
		}

	}

}
