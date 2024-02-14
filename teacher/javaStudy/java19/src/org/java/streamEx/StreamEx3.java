package org.java.streamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		System.out.println("Stream");
		// 1. List 5���� �ʱ�ȭ
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(10, "���̸�"));
		members.add(new Member(20, "���̸�"));
		members.add(new Member(30, "���̸�"));
		members.add(new Member(40, "���̸�"));
		members.add(new Member(50, "���̸�"));

		System.out.println(members);

		Stream<Member> stream = members.stream();

		stream.forEach(el -> {
			System.out.print("����: " + el.getAge());
			System.out.println(" �̸�: " + el.getName());
		});

		System.out.println();

		Stream<Member> stream2 = members.stream();
		// Ŭ����::Ŭ�������Ǹż���
		// stream2��� Member
		stream2.forEach(Member::toMemberEntity);
		
		

	}
}
