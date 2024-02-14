package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectOneService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		
		System.out.println("ȸ�� ��ȸ");
		
		System.out.println("��ȸ�� ���̵� �Է�");
		
		Scanner input=new Scanner(System.in);
		
		String userId=input.next();
		
		MemberDao dao= MemberDao.getInstance();
		
		MemberDto member=dao.selectOne(userId);
		
		if(member!=null) {
			System.out.print("���̵�: " + member.getUserId());
			System.out.print(", �����ȣ: " + member.getUserPw());
			System.out.print(", ����: " + member.getAge());
			System.out.println(", �̸�: " + member.getName());			
		}else {
			System.out.println("��ȸ ȸ�� �����ϴ�!");
		}
		
		
	}

}
