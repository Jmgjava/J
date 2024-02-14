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
		System.out.println("회원조회");

//		List<MemberDao> list = new ArrayList<MemberDao>();
//		list.add(new MemberDto(null, null, 0, null));

		// 1. 전체 조회
		MemberDao dao = MemberDao.getInstance();
		
		
		List<MemberDto> members = dao.select();
	
		
		
		if(members.isEmpty()) {
			System.out.println("조회할 목록이 없습니다.");
		}else {
			for(MemberDto member:members) {
				System.out.print("아이디: "+member.getUserId()+" ");
				System.out.print("비밀번호: "+member.getUserPW()+" ");
				System.out.print("나이: "+member.getAge()+" ");
				System.out.print("이름: "+member.getName()+" ");
				System.out.println();
			}
		}


	}

}
