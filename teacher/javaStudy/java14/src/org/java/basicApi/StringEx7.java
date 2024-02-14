package org.java.basicApi;

import java.util.Scanner;

public class StringEx7 {

	public static void main(String[] args) {
		System.out.println("String");

		String str1 = "java";
		String str2 = "2024";
		// 문자열1+문자열2 -> 새로운 문자열 ** 원본은 변동이 없다
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1);

		// 특정 문자열이 포함되어 있느냐? -> 검색
		String search = "java";
		String oldContent = "java project";
		// 원문자열에서 찾을 키워드
		boolean result = oldContent.contains(search); // 시퀀스(연속적인 순서)
		System.out.println(result);

		if (result == true) {
			System.out.println("java 검색 할 수 있습니다.");
		} else {
			System.out.println("java를 검색 할 수 없습니다. ");
		}
		// 요청 문자열을 원한는 위치에서 조회(문자열 추출) -> 서블릿 컨트롤러에서 활용

		String requestURL = "/insert.do";
		// 공식1
		int size = requestURL.length(); // 전체 문자열 길이
		int valSize = ".do".length(); // 마지막 가져올 문자열 길이
		int startIdx = size - valSize; // 마지막 가져올 문자열 첫번째인덱스

		// 문자열 끝자료 3개 추출 .do
		// substring(인덱스) -> 전체길이-3 -> 가져올 시작번지
		System.out.println(requestURL.substring(startIdx));

		// 마지막 특정(반복문자열)문자열을 제외하고 0번지부터(처음) 추출
		// /insert.do, modify.do,memberUpdate.do
		// substring(0, 가져올문자열갯수)
		// 전체길이 -마지막 제외할 문자열 길이 -> startIdx -> 가져올문자열갯수
		System.out.println(requestURL.substring(0, startIdx));

		System.out.println("문자열 입력(끝은 .do로 끝나야된다)");

		Scanner input = new Scanner(System.in);
		String requestInput = input.next();

		System.out.println("입력된값: " + requestInput);

		// .do를 제외한 문자열
		String rsStr = requestInput.substring(0, requestInput.length() - 3);
		System.out.println(".do제외한 문자열: " + rsStr);

	}
}
