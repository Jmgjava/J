package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {

		System.out.println("ȸ����ȸ");

		// DAO
		MemberDao dao = new MemberDao();
		// public MemberDto select() -> return member;
		MemberDto member = dao.select();
		
		if(member!=null) {
			System.out.println("ȸ����ȣ: "+member.getNo() );
			System.out.println("���̵�: "+member.getUserId() );
			System.out.println("�����ȣ: "+member.getUserPw() );
			System.out.println("�̸�: "+member.getName() );
			System.out.println("����: "+member.getAge() );
		}else {
			System.out.println("��ȸ�� ȸ�� �����ϴ�.");
		}

	}

}
