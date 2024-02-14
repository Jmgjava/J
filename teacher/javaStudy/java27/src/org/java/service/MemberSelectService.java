package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements MemberService{

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("ȸ����ȸ(��üȸ��)");
		
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> members= dao.selectAll();
		
		// �ֿܼ� ���  foreach��
		if(members.isEmpty()) {
			System.out.println("��ȸ�� ȸ���� �����ϴ�.");
		}else {
			for(MemberDto member: members) {
				System.out.print("ȸ����ȣ: " + member.getNo());
				System.out.print("���̵�: " + member.getUserId());
				System.out.print(", �����ȣ: " + member.getUserPw());
				System.out.print(", ����: " + member.getAge());
				System.out.println(", �̸�: " + member.getName());
			}
		}
		
	}
}
