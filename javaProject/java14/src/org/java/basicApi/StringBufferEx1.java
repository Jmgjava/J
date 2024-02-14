package org.java.basicApi;

import java.util.Scanner;

public class StringBufferEx1 {

	public static void main(String[] args) {
		System.out.println("StringBuffer");

//		Scanner input = new Scanner(System.in);
//		String key = input.next();

		// String 원본을 수정 X
		String str1 = "java";
		String str2 = str1.concat("2024"); // 새로운 문자열 생성

		System.out.println(str1);
		System.out.println(str2);

		StringBuffer sf1 = new StringBuffer("java");
		System.out.println(sf1);

		// 특정 문자열 추가
		sf1.append("2024"); // 원본문자길이 수정
		System.out.println(sf1);

		// 문자열 삭제
		sf1.delete(0, 4); // 0 <= <4 => 0123
		System.out.println(sf1);

		// 특정위치에 문자열 추가
		sf1.insert(0, "java"); // 0번지에 java추가
		System.out.println(sf1);

		// 2024 뒤에 PROJECT를 추가
		sf1.insert(sf1.length(), "PROJECT");
		System.out.println(sf1);

		// 역순 -> 원본 문자열 반대로 정렬
		sf1.reverse();
		System.out.println(sf1);
		sf1.reverse();
		System.out.println(sf1);

		// 특정문자열을 -> 반환해라
		sf1.replace(0, 4, "ORACLE"); // 0 ~ 3 번지 바꾸고자 하면 0, 4 - 1
		System.out.println(sf1);

		sf1.replace(6, 10, "2025");
		System.out.println(sf1);

		// substring -> 특정 문자열 추출
		int size = sf1.length();
		int pSize = "PROJECT".length();
		int startIdx = size - pSize;

		// 원본 손상 없이
		System.out.println(sf1.substring(startIdx));
		System.out.println(sf1);

		// 처음부터 특정 위치까지 추출
		System.out.println(sf1.substring(0, startIdx));

		// StringBuffer -> String 변환
		StringBuffer sf3 = new StringBuffer("String 예시");
//		String.valueOf(sf3); // -> 특정 객체를 Stringㄹ으로 변환
		
		String sf33 = sf3.toString(); // String 변환
		System.out.println(sf33+" << String");

	}

}
