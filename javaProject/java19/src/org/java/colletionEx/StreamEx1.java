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
		System.out.println("����");

		// �迭 -> List ����
		List<String> strArrList = Arrays.asList(strArr);
		for (String i : strArrList) {
			System.out.println(i);
		}

		System.out.println();

		// �迭�� ����
		Arrays.sort(strArr); // java jsp mysql oracle servlet
		// �÷��� ����
		Collections.sort(strArrList); // java jsp mysql oracle servlet

		System.out.println("���� �� ����(������ ����)");

		for (String i : strArrList) {
			System.out.println(i);
		}

		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "jsp" };

		Stream<String> stream1 = Arrays.stream(strArr2); // �迭�� Stream ȭ
		Stream<String> stream2 = strArrList.stream();
		System.out.println();

		stream1.sorted().forEach(element -> {
			System.out.println(element);
		});

		System.out.println();
		stream1.sorted().forEach(System.out::println);
//             stram1 Ŭ�������� �ϳ��� �̾Ƽ�    ::  println �޼ҵ忡 �������

//      *******************sort() ������ �ѹ��� ��� ����*************************

//		stream2.sorted().forEach(element -> {
//			System.out.println(element);
//		});
//		stream2.sorted().forEach(System.out::println);
//             stram2 Ŭ�������� �ϳ��� �̾Ƽ�    ::  println �޼ҵ忡 �������

	}
}
