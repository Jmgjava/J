package org.java.basicApi;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx3 {

	public static void main(String[] args) {
		System.out.println("자동 boxing");

		int i = 10; // i -> int
		Integer i1 = i; // int -> Integer (boxing)

		// Primitive Type 기본자료형
		byte b = 10;
		short s = 10;
		int j = 10;
		long l = 10;
		float f = 1.1f;
		double d = 1.1;
		char ch = 'c';
		boolean bool = true;

		// 기본 자료형 -> 객체형(Wrapper) -> boxing
		Byte by1 = b;
		Short sh1 = s;
		Integer jn1 = j;
		Long lo1 = l;
		Float fl1 = f;
		Double do1 = d;
		Character ch1 = ch;
		Boolean bl1 = bool;

		System.out.println(by1);
		System.out.println(sh1);
		System.out.println(jn1);
		System.out.println(lo1);
		System.out.println(fl1);
		System.out.println(do1);
		System.out.println(ch1);
		System.out.println(bl1);

		System.out.println();

		System.out.println(i1 == j);

		// 컬렉션 프레임워크(컬렉션) -> 객체를 그룹화

		List<Integer> list = new ArrayList<Integer>();
	}

}
