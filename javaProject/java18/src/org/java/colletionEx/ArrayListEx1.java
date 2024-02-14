package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		// 객체만 지향
		// 순서가 있고 0~
		// 길이가 자동 설정
//		ArrayList<String> arrs = new ArrayList<String>();
		List<String> arrs = new ArrayList<String>();
		String s1 = "문자열1";
		arrs.add(s1);
		arrs.add(new String("문자열2"));
		arrs.add("문자열3");
		arrs.add("문자열4");
		arrs.add("문자열5");

		System.out.println("확장형 for문 -> for-each문");
		for (String i : arrs) {
			System.out.println(i);
		}

		System.out.println(arrs);
		System.out.println(arrs.size());
		System.out.println(arrs.contains("문자열1"));
		System.out.println(arrs.indexOf("문자열1"));
		System.out.println(arrs.isEmpty());
		System.out.println(arrs.remove(0));
		System.out.println(arrs);
		arrs.clear();
		System.out.println(arrs);

		// forEach -> 모든 컬렉션 요소를 조회, 타입을 X
		// 미리 타입을 인지한 상태에서 사용, 람다식
		arrs.forEach(element -> {
			if (element.equals("문자열1"))
				System.out.println(element);
		});

		// Iterator
		Iterator<String> iter = arrs.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}

}
