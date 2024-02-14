package org.java.streamEx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		System.out.println("Stream");

		String[] arrStr1 = { "java1", "java2", "java3" };
		// 배열을 List화 -> javascript
//		Arrays.asList("java1","java2","java3");
		List<String> list1 = Arrays.asList(arrStr1);

		// foreach
		for (String el : list1) {
			System.out.println(el);
		}
		System.out.println();

		// Iterator
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			String el = iterator.next();
			System.out.println(el);
		}

		System.out.println();

		// Stream
		Stream<String> stream1 = list1.stream();// 리스트객체를 Stream으로 저장
//		stream1.forEach(el->System.out.println(el));
		stream1.forEach(el -> System.out.println(el));

		System.out.println();

//		list1.stream().forEach(el->System.out.println(el));

		list1.stream().forEach(el -> System.out.println(el));

		System.out.println();
		// el생략 가능 객체::객체매서드
		// 리스트의 모든 요소가 클래스에 있는 매서드를 실행
		list1.stream().forEach(System.out::println);

	}
}
