package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ����ȸ");

		// DAO
		MemberDao dao = new MemberDao();
		MemberDto member = dao.select();

		if (member != null) {
			System.out.println("ȸ����ȣ: " + member.getNo());
			System.out.println("ȸ��Id: " + member.getUserId());
			System.out.println("ȸ��Pw: " + member.getUserPw());
			System.out.println("ȸ���̸�: " + member.getName());
			System.out.println("ȸ������: " + member.getAge());
		}
	}
}
