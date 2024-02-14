package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		// ArrayList -> List

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add(new String("m1"));
		list1.add("m2");

		// for
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();

		// for-each -> 확장형 for문 -> 자동 저장(크기)
		for (String i : list1) {
			System.out.println(i);
		}

		System.out.println();

		Iterator<String> iter = list1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

		System.out.println();

//		ArrayList<MemberDto> list2 = new ArrayList<MemberDto>();
		List<MemberDto> list2 = new ArrayList<MemberDto>();

		list2.add(new MemberDto("m1", "1234"));
		list2.add(new MemberDto("m2", "2345"));
		list2.add(new MemberDto("m3", "3456"));
		list2.add(new MemberDto("m4", "4567"));
		list2.add(new MemberDto("m5", "5678"));

		System.out.println(list2);

		for (MemberDto i2 : list2) {
			System.out.println(i2);
			System.out.println("ID: " + i2.getId() + "\nPw: " + i2.getPw());
		}

		Iterator<MemberDto> iter2 = list2.iterator();
		while (iter2.hasNext()) {
			MemberDto member = iter2.next();
		}

		// for-each -> 모든 요소를 조회 -> 람다식 (Stream, forEach)
		list2.forEach(member -> {
			System.out.println("ID: " + member.getId() + "\nPw: " + member.getPw());
		});

	}
}
