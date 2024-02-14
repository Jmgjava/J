package org.java.colletionEx;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		System.out.println("Vector iterator");

		Vector<MemberDto> members = new Vector<MemberDto>();
//		Lisy<MemberDto> 이름 = new List<MemberDto>();
		members.add(new MemberDto(10, "m1"));
		members.add(new MemberDto(20, "m2"));
		members.add(new MemberDto(30, "m3"));
		members.add(new MemberDto(40, "m4"));
		members.add(new MemberDto(50, "m5"));
		System.out.println(members);

		System.out.println("for문");
		// 조회방법
		// for
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}

		System.out.println("for-each문");
		// for-each -> 객체
		for (MemberDto i : members) {
			System.out.println(i);
		}

		System.out.println("Iterator");
		// Iterator -> 리스트형 객체를 조회
		// Iterator<요소타입> 이름 = 컬렉션.Iterator();
		Iterator<MemberDto> iter = members.iterator();
		// Iterator 조회할 요소가 있으면 while문 실행
		while (iter.hasNext()) {
			// 요소 타입
			MemberDto dto = iter.next(); // 하나씩 요소를 조회
			System.out.println(dto);
		}

	}

}
