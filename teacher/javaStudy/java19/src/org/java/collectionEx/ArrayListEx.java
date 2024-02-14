package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		// ArrayList -> List

//		 ArrayList<String> list=new ArrayList<String>();
		List<String> list = new ArrayList<String>();

		list.add(new String("m1"));
		list.add("m2");
		list.add("m3");
		list.add("m4");
		list.add("m4");

		// for -> 갯수를 정할 수 있다. -> 배열(갯수정해졌다)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		// foreach -> 확장형 for문 -> 자동 저장(크기)
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		// Iterator
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println();

//		 List<MemberDto> members=new ArrayList<MemberDto>();
		List<MemberDto> members = new ArrayList<MemberDto>();

		members.add(new MemberDto("m1", "11"));
		members.add(new MemberDto("m2", "21"));
		members.add(new MemberDto("m3", "31"));
		members.add(new MemberDto("m4", "21"));
		members.add(new MemberDto("m5", "31"));
		System.out.println();
		System.out.println(members);
		// foreach
		for (MemberDto member : members) {
			System.out.println(member.getUserId() + ", " + member.getUserPw());
		}
		System.out.println();
		// Iterator
		Iterator<MemberDto> iter2 = members.iterator();
		while (iter2.hasNext()) {
			MemberDto member = iter2.next();
			System.out.println(member.getUserId() + ", " + member.getUserPw());
		}
		System.out.println();
		// forEach -> 모든 요소를 조회 -> 람다식 (Stream, forEach)
		members.forEach(member -> {
			System.out.println(member.getUserId() + ", " + member.getUserPw());
		});

	}
}
