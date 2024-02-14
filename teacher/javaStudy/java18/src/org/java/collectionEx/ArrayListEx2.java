package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		System.out.println("ArrayList");

//		ArrayList<MemberDto> members= new ArrayList<MemberDto>();
		List<MemberDto> members = new ArrayList<MemberDto>();
//		MemberDto dto= new MemberDto();
//		dto.setAge(11);
//		dto.setName("m1");
		members.add(new MemberDto(11, "m1"));
		members.add(new MemberDto(21, "m2"));
		members.add(new MemberDto(31, "m3"));
		members.add(new MemberDto(41, "m4"));
		members.add(new MemberDto(51, "m5"));

		System.out.println(members);
		// foreach문 -> 확장형 for문
		for (MemberDto member : members) {
			System.out.print("나이: " + member.getAge());
			System.out.println(" 이름: " + member.getName());
		}
		System.out.println();
		// Iterator
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto member = iter.next();
			System.out.print("나이: " + member.getAge());
			System.out.println(" 이름: " + member.getName());
		}
		////////////////////////////////////////////////////
		System.out.println();
		System.out.println("회원가입");

		List<MemberDto> members2 = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);

		// while문이용해서 5명의 회원을 등록 하고 foreach문으로 콘솔에 출력
		boolean bool = true;

		int cnt = 0;

		while (bool) {
			// cnt++;
//			System.out.println("횟수: "+cnt);

			System.out.print("나이 입력: ");
			int age = input.nextInt();
			System.out.print("이름 입력: ");
			String name = input.next();

			members2.add(new MemberDto(age, name));
			for (MemberDto member : members2) {
				System.out.print("나이: " + member.getAge());
				System.out.println(", 이름: " + member.getName());
			}
			// 5번 실행 ->
//			if(cnt>=5 ) bool=false;

			System.out.println("List갯수: " + members2.size());
			if (members2.size() >= 5)
				bool = false;

		}

	}
}
