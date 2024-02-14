package org.java.basicApi;

import java.util.Scanner;

public class StringBufferEx {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);		
//		System.out.println("입력: ");
//		String inStr = input.next();
//		System.out.println("출력값: "+inStr);
		System.out.println("StringBuffer");

		// String 원본을 수정 X
		String str1 = "java";// java2024
		String str2 = str1.concat("2024");// 새로운 문자열 생성
		System.out.println(str1);
		System.out.println(str2);

		StringBuffer sf1 = new StringBuffer("java");
		System.out.println(sf1);

		// 특정문자열 추가 -> 무조건 마지막 바로 뒤에
		sf1.append("2024");// 원본문자열이 수정
		System.out.println(sf1);

		// 문자열 삭제 (시작번지,끝번지) -> 시작번지부터 끝번지 앞까지 삭제
//		sf1.delete(3, 4); //0<= <4 
		sf1.delete(0, 4); // 0<= <4 -> 0123
		System.out.println(sf1);
		// 특정위치에 문자열 추가
		sf1.insert(0, "JAVA");// 0번지에 "JAVA"추가
		System.out.println(sf1);
		// 2024뒤에 PROJECT를 추가 해보세요
//		sf1.append("PROJECT");
		sf1.insert(8, "PROJECT");
		System.out.println(sf1);

		// 역순 -> 원본 문자열 반대로 정렬
		sf1.reverse();
		System.out.println(sf1);
		sf1.reverse();
		System.out.println(sf1);

		// 특정문자열을 -> 변환 해라
		sf1.replace(0, 4, "ORACLE");// 0~3번지 바꾸고자 하면 0,4
		System.out.println(sf1);

		// 2024-> 2025 바꿔보세요
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

		// StringBuffer -> String
		StringBuffer sf3 = new StringBuffer("String 예시");
		// String.valueOf(sf3);// -> 특정객체를 String으로 변환

		String sf3ToSt = sf3.toString();
		System.out.println(sf3ToSt + " << String");

	}
}
