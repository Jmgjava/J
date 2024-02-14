package org.java.collectionEx;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		System.out.println("Stream");

		String[] strArr = { "java", "oracle", "mysql", "servlet", "jsp" };
		// 배열 -> List 변경
		List<String> strArrList = Arrays.asList(strArr);

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		// 배열을 정렬
		Arrays.sort(strArr);// java jsp mysql oracle servlet
		// 컬렉션 정렬
		Collections.sort(strArrList);// java jsp mysql oracle servlet

		System.out.println(" 정렬후 원본 데이터가 변경이 된다.");

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println("Stream -> ");

		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "jsp" };
		List<String> strArrList2 = Arrays.asList(strArr);

		// 배열을 Stream화
		Stream<String> stream1 = Arrays.stream(strArr2);
		Stream<String> stream2 = strArrList2.stream();

		stream1.sorted().forEach(element -> {
			System.out.println(element);
		});
//		stream1.sorted().forEach(System.out::println);

		System.out.println("================");

//		stream2.sorted().forEach(element->{
//			System.out.println(element);
//		});
		stream2.sorted().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(" 정렬후 원본 데이터가 변경이 안 된다.");

		for (String str : strArrList2) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr2) {
			System.out.print(str + " ");
		}
		System.out.println();

	}
}
