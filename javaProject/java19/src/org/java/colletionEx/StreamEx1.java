package org.java.colletionEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		System.out.println("Stream");

		String[] strArr = { "java", "oracle", "mysql", "servlet", "jsp" };

		System.out.println();
		System.out.println("원본");

		// 배열 -> List 변경
		List<String> strArrList = Arrays.asList(strArr);
		for (String i : strArrList) {
			System.out.println(i);
		}

		System.out.println();

		// 배열을 정렬
		Arrays.sort(strArr); // java jsp mysql oracle servlet
		// 컬렉션 정렬
		Collections.sort(strArrList); // java jsp mysql oracle servlet

		System.out.println("정렬 후 원본(원본이 변함)");

		for (String i : strArrList) {
			System.out.println(i);
		}

		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "jsp" };

		Stream<String> stream1 = Arrays.stream(strArr2); // 배열을 Stream 화
		Stream<String> stream2 = strArrList.stream();
		System.out.println();

		stream1.sorted().forEach(element -> {
			System.out.println(element);
		});

		System.out.println();
		stream1.sorted().forEach(System.out::println);
//             stram1 클래스에서 하나씩 뽑아서    ::  println 메소드에 집어넣음

//      *******************sort() 구문은 한번만 사용 가능*************************

//		stream2.sorted().forEach(element -> {
//			System.out.println(element);
//		});
//		stream2.sorted().forEach(System.out::println);
//             stram2 클래스에서 하나씩 뽑아서    ::  println 메소드에 집어넣음

	}
}
