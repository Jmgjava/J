package org.java.colletionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		System.out.println("Vector");

		// 다형성 -> 부모타입의 객체 참조변수 -> 자식객체
		// 오버로딩(생성자), 오버라이딩(상속)
		List<MemberDto> members = new Vector<MemberDto>();
//						members = new Stack<MemberDto>();

		members.add(new MemberDto(11, "m11"));
		members.add(new MemberDto(21, "m21"));
		members.add(new MemberDto(31, "m31"));
		members.add(new MemberDto(41, "m41"));
		members.add(new MemberDto(51, "m51"));

		System.out.println("for-each");
		for (MemberDto i : members) {
//			System.out.println(i);
			System.out.println("회원 나이: " + i.getA());
			System.out.println("회원 이름: " + i.getName());
		}

		System.out.println();
		// name -> m1
		for (MemberDto i : members) {
			// name이 m1인 회원을 출력
			if (i.getName().equals("m11")) {
				System.out.println("이름: " + i.getName());
				System.out.println("이름이 m11인 사람의 나이: " + i.getA());
			}
		}
		System.out.println();
		// 회원나이가 30이상의 회원들을 조회
		for (MemberDto i : members) {
			if (i.getA() >= 30) {
				System.out.println("나이가 30 이상인 회원: "+i.getName());
			}
		}

		System.out.println();

		System.out.println("Iterator");
		// Iterator -> 직렬화 -> Session, Cookie
		// 컬렉션 요소 타입
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto dto = iter.next();
			System.out.println("회원 나이: " + dto.getA());
			System.out.println("회원 이름: " + dto.getName());
		}

	}

}
