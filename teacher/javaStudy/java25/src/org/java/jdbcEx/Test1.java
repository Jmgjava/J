package org.java.jdbcEx;

import java.util.ArrayList;
import java.util.List;

import org.java.dto.MemberDto;

public class Test1 {

	public static void main(String[] args) {
		
		List<MemberDto> members=new ArrayList<MemberDto>();
		
		members.add(new MemberDto("m1", "112", 11, "s1"));
		members.add(new MemberDto("m2", "212", 21, "s2"));
		
		System.out.println(members.isEmpty());
		
		if(members.isEmpty()) {
			System.out.println("조회할 목록이 없습니다.");
		}else {
			for(MemberDto member: members) {
				System.out.println(member.getUserId());
			}
		}
		
		List<MemberDto> members2=null;
		
		System.out.println(members2);
		if(members2==null) {			
			System.out.println("조회할 목록이 없습니다.");
		}
		
		
	}
}
