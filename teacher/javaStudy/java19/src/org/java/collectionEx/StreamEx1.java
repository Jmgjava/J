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
		// �迭 -> List ����
		List<String> strArrList = Arrays.asList(strArr);

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		// �迭�� ����
		Arrays.sort(strArr);// java jsp mysql oracle servlet
		// �÷��� ����
		Collections.sort(strArrList);// java jsp mysql oracle servlet

		System.out.println(" ������ ���� �����Ͱ� ������ �ȴ�.");

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

		// �迭�� Streamȭ
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

		System.out.println(" ������ ���� �����Ͱ� ������ �� �ȴ�.");

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
