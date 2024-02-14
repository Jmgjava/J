package org.java.streamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		System.out.println("Stream");
		// 1. List 5명을 초기화
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(10, "김이름"));
		members.add(new Member(20, "이이름"));
		members.add(new Member(30, "박이름"));
		members.add(new Member(40, "손이름"));
		members.add(new Member(50, "강이름"));

		System.out.println(members);

		Stream<Member> stream = members.stream();

		stream.forEach(el -> {
			System.out.print("나이: " + el.getAge());
			System.out.println(" 이름: " + el.getName());
		});

		System.out.println();

		Stream<Member> stream2 = members.stream();
		// 클래스::클래스안의매서드
		// stream2요소 Member
		stream2.forEach(Member::toMemberEntity);
		
		

	}
}
