package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelect implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("ȸ����ȸ");

//		List<MemberDao> list = new ArrayList<MemberDao>();
//		list.add(new MemberDto(null, null, 0, null));

		// 1. ��ü ��ȸ
		MemberDao dao = MemberDao.getInstance();
		
		
		List<MemberDto> members = dao.select();
	
		
		
		if(members.isEmpty()) {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		}else {
			for(MemberDto member:members) {
				System.out.print("���̵�: "+member.getUserId()+" ");
				System.out.print("��й�ȣ: "+member.getUserPW()+" ");
				System.out.print("����: "+member.getAge()+" ");
				System.out.print("�̸�: "+member.getName()+" ");
				System.out.println();
			}
		}


	}

}
