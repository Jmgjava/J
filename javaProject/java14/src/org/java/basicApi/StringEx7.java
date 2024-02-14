package org.java.basicApi;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class StringEx7 {

	public static void main(String[] args) {
		System.out.println("String");

		String str1 = "java";
		String str2 = "2024";
		// 문자열1 + 문자열2 = 새로운 문자열 *** 원본은 변동없음
		String str3 = str1.concat(str2);
		System.out.println(str3);

		// 특정 문자열이 포함되어 있는가? -> 검색
		String search = "java";
		String oldcontent = "javaproject";
		// 원문자열.contains(찾을 키워드)
		boolean result = oldcontent.contains(search); // 시퀀스(연속적인 순서)
		if (result == true) {
			System.out.println("java 포함된 결과 있음");
		} else {
			System.out.println("java 가 포함된 결과 없음");
		}
		// 요청 문자열을 원하는 위치에서 조회(문자열 추출) -> 서블릿 컨트롤러에서 활용

		String requestURL = "insert.do";
		// 공식1
		int size = requestURL.length(); // 전체 문자열 길이
		int valSize = ".do".length(); // 마지막 가져올 문자열 길이
		int startidx = size - valSize; // 마지막 가져올 문자열 첫번째 인덱스

		// 문자열 끝자로 3개 추출 .do
		// substring(인덱스) -> 전체길이 -3 -> 가져올 시작번지
		System.out.println(requestURL.substring(startidx));

		// 마지막 특정(반복문자열)문자열을 제외하고 0번지부터(처음) 추출
		// /insert.do, modify.do, memberUpdate.do
		// substring(0, 가져올문자열갯수);
		// 전체길이 - 마지막 제외할 문자열 길이 -> startidx -> 가져올문자열갯수
		System.out.println(requestURL.substring(0, startidx));

		System.out.println("문자열입력(끝은 .do로 끝나야함)");

		Scanner scn = new Scanner(System.in);

		String input = scn.next();
		System.out.println("입력된 값: " + input);

		int fullSize = input.length();
		int doSize = ".do".length();
		String lastSize = input.substring(0, fullSize - doSize);

		if (input.contains(".do")) {
			System.out.println(".do 제외한 문자열: " + lastSize);
		} else {
			System.out.println(".do가 포함되어 있지 않습니다.");
		}

	}

}
