package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListEx2 {

	public static void main(String[] args) {
		System.out.println("ArrayList");

		List<MemberDto> members = new ArrayList<MemberDto>();

		members.add(new MemberDto(15, "m1"));
		members.add(new MemberDto(24, "m2"));
		members.add(new MemberDto(36, "m3"));
		members.add(new MemberDto(43, "m4"));
		members.add(new MemberDto(59, "m5"));

		System.out.println(members);
		// for-each
		for (MemberDto i : members) {
			System.out.print("이름: " + i.getName() + " ");
			System.out.println("나이: " + i.getA());
		}
		System.out.println();
		// Iterator
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto dto = iter.next();
			System.out.print("이름: " + dto.getName() + " ");
			System.out.println("나이: " + dto.getA());
		}

		System.out.println();
		System.out.println("회원가입");
		List<MemberDto> members2 = new ArrayList<MemberDto>();
		// while문 이용해서 5명의 회원을 등록하고 foreach문으로 콘솔에 출력

		Scanner scn = new Scanner(System.in);
		boolean bool = true;
		int cnt = 0;
		Iterator<MemberDto> iter1 = members2.iterator();

		while (bool) {

//			cnt++;
//
//			System.out.println("횟수: " + cnt);
//
//			System.out.println("나이 입력: ");
//			int age = scn.nextInt();
//			System.out.println("이름 입력: ");
//			String name = scn.next();
//			members2.add(new MemberDto(age, name));

//			2. if
			System.out.println("List 갯수: " + members2.size());
			if (members2.size() != 5) {
				System.out.println("나이 입력: ");
				int age = scn.nextInt();
				System.out.println("이름 입력: ");
				String name = scn.next();
				members2.add(new MemberDto(age, name));
			} else {
				bool = false;
			}
//			if (cnt >= 5)
//				bool = false;
		}

//		System.out.println("이름: "+members2.get(0).getName());
//		System.out.println("이름: "+members2.get(0).getA());

		for (MemberDto i : members2) {
			System.out.print("이름 :" + i.getName() + " ");
			System.out.println("나이 :" + i.getA());
		}

	}

}
