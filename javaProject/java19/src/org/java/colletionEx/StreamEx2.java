package org.java.colletionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class A {
	static void m1(int num) {
		System.out.println("ÀÔ·Â°ª: " + num);

	}
}

public class StreamEx2 {

	public static void main(String[] args) {
		System.out.println("Stream");

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		

		Stream<Integer> stream1 = list.stream();
		stream1.forEach(A::m1);

//		stream1.forEach(element -> {
//			A a = new A();
//			a.m1(element);
//		});

	}

}
