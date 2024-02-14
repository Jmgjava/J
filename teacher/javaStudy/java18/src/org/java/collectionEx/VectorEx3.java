package org.java.collectionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		System.out.println("Vector");

		// 다형성 -> 부모타입의 객체 참조 변수 -> 자식객체
		// 오버로딩(생성자), 오버라이딩(상속)
		List<MemberDto> members = new Vector<MemberDto>();
//		  				members= new Stack<MemberDto>();		
		members.add(new MemberDto(11, "m1"));
		members.add(new MemberDto(21, "m2"));
		members.add(new MemberDto(31, "m3"));
		members.add(new MemberDto(41, "m4"));
		members.add(new MemberDto(51, "m5"));
		// forX

		// foreach
		for (MemberDto member : members) {
//			System.out.println(member);
			System.out.print("회원 나이: " + member.getAge());
			System.out.println(" 회원 이름: " + member.getName());
		}
		System.out.println();

		// name -> m1 -> 리스트 중에서 조건에 맞는 요소를 조회
		for (MemberDto member : members) {
			// name이 m1인 회원를 출력
			if (member.getName().equals("m1")) {
				System.out.println("이름: " + member.getName());
				System.out.println("나이: " + member.getAge());
			}
		}
		System.out.println();
		// 회원나이가 30이상의 회원들을 조회
		System.out.println("30세이상의 회원 목록");
		for (MemberDto member : members) {
			if (member.getAge() >= 30) {
				System.out.print("회원 나이: " + member.getAge());
				System.out.println(" 회원 이름: " + member.getName());
			}
		}

		System.out.println();

		// Iterator -> 직렬화 -> Session, Cookie
		// 컬렉션 요소 타입
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto m1 = iter.next();
			if (m1.getAge() >= 30) {
				System.out.print("회원 나이: " + m1.getAge());
				System.out.println(" 회원 이름: " + m1.getName());
			}
		}

	}
}
