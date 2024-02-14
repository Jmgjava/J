package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ����ȸ");

//		List<MemberDto> list=new ArrayList<MemberDto>();
//		list.add(new MemberDto(null, null, 0, null))

		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> members = dao.select();

		if (members.isEmpty()) {
			System.out.println("��ȸ�� ȸ������� �����ϴ�.");
		} else {
			for (MemberDto member : members) {
				System.out.print("���̵�: " + member.getUserId());
				System.out.print(", �����ȣ: " + member.getUserPw());
				System.out.print(", ����: " + member.getAge());
				System.out.println(", �̸�: " + member.getName());
			}
		}

	}
}
