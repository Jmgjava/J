package org.java.collectionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		System.out.println("Vector");

//		Vector<MemberDto> members = new Vector<MemberDto>();
		Vector<MemberDto> members = new Vector<MemberDto>();
//		List<MemberDto> members=new Vector<MemberDto>();

		members.add(new MemberDto(10, "m1"));
		members.add(new MemberDto(20, "m2"));
		members.add(new MemberDto(30, "m3"));
		members.add(new MemberDto(40, "m4"));
		members.add(new MemberDto(50, "m5"));
		System.out.println(members);
		// 조회 방법
		// for -> 객체, 기본자료형
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}

		System.out.println();
		// foreach -> 객체
		for (MemberDto member : members) {
			System.out.println(member);
		}

		System.out.println();

		// Iterator -> 리스트형 객체를 조회
		// Iterator<요소타입> = 컬렉션.iterator();
		Iterator<MemberDto> iter = members.iterator();
		// Iterator조회할 요소가 있으면 while문 실행
		while (iter.hasNext()) {
			// 요소 타입
			MemberDto dto = iter.next();// 하나씩 요소를 조회
			System.out.println(dto);
		}

	}
}
