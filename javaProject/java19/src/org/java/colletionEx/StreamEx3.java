package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {
		System.out.println("Stream");

		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("ab1");
		list.add("c1");
		list.add("d1");
		list.add("e1");

		// 1. stream
		Stream<String> stream1 = list.stream();

		// 2. 출력
//		stream1.forEach(System.out::println);
		
//		stream1.forEach(element -> {
//			System.out.println(element);
//		});

		// 3. 필터링(가공)
		stream1
			.filter(el -> el.contains("a")) // 검색값
//			.map(el -> el.toUpperCase()) 	// 검색값을대문자로 변경
					// 요소를 각각 대문자로 변경
			.map(String::toUpperCase) 		// 검색값을 대문자로 변경
			.sorted() 						// 정렬(오름차순)
			.collect(Collectors.toList())	// 결과값을 List에 저장
			.forEach(System.out::println); 	// 결과값

		stream1
		.map(String::toUpperCase) 		// 검색값을 대문자로 변경
		.collect(Collectors.toList());	// 결과값을 List에 저장

	}

}
