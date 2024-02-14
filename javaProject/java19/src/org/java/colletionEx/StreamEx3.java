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

		// 2. ���
//		stream1.forEach(System.out::println);
		
//		stream1.forEach(element -> {
//			System.out.println(element);
//		});

		// 3. ���͸�(����)
		stream1
			.filter(el -> el.contains("a")) // �˻���
//			.map(el -> el.toUpperCase()) 	// �˻������빮�ڷ� ����
					// ��Ҹ� ���� �빮�ڷ� ����
			.map(String::toUpperCase) 		// �˻����� �빮�ڷ� ����
			.sorted() 						// ����(��������)
			.collect(Collectors.toList())	// ������� List�� ����
			.forEach(System.out::println); 	// �����

		stream1
		.map(String::toUpperCase) 		// �˻����� �빮�ڷ� ����
		.collect(Collectors.toList());	// ������� List�� ����

	}

}
