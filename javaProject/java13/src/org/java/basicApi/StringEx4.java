package org.java.basicApi;

public class StringEx4 {

	public static void main(String[] args) {
		System.out.println("String");
		System.out.println("substring -> 특정 문자열 추출");

		// 1. substring(인덱스) -> 인덱스부터 문자열 추출
		String str1 = "java 2024 project";

		System.out.println(str1.substring(10)); // 10번지부터추출
		// 공식 -> 전체문자열길이-가져올문자열(끝문자열)
		// -> 가져올 시작번지
		// substring(시작번지)
		String str2 = "123456789";
		int size = str2.length();
		System.out.println(size);
		int num = 3; // 가져올 마지막 문자열 갯수 (789)
		int index1 = size - num; // 문자에서 가져올 인덱스

		System.out.println(str2.substring(index1));

		String str3 = "member_.do";
		int str3Index = str3.length() - 3; // 전체길이에서 가져올 문자열갯수(마지막)
		System.out.println(str3.substring(str3Index));

		// 2. substring(시작번지, 끝번지-1) -> 문자열의 시작번지부터 끝번지-1까지의 사잇값(문자열)을 가져옴
		String str4 = "Java Oracle Project";

		System.out.println(str4.substring(0, 4)); // java
		System.out.println(str4.substring(5, 11)); // oracle
		System.out.println(str4.substring(12, 19)); // project

		String insert = "/member_insert.do";

		System.out.println(".do를 제외한 문자열을 추출하여 콘솔에 출력");
		// 1. substring(인덱스) -> 인덱스부터 문자열 추출

		// 2. substring(시작번지, 끝번지) -> 문자열의 시작번지부터 끝번지-1 문자열을 추출
		// 특정문자열에서 끝문자열을 제외하고 나머지 문자열을 추출 하려 할 때
		// 특정문자열.substring(0 , 가져올문자열개수-끝문자열수); // 0번지부터 문자열을 가져올 때는 (0, 가져올
		// 문자열 개수)
		// 전체 문자열길이 - 제외할 문자열의 길이 -> 14
		// 3 -> .do

		// 0번지 14개 문자열을 추출
		System.out.println(insert.substring(0, insert.length() - 3));

		int len = insert.length() - 3;
		System.out.println(len);
		System.out.println(insert.substring(len));

		// 특정문자열에서 0번지부터 특정문자열을 추출할 때(마지막 문자열을 제외하고)
		// 가져올 문자열 개수 -> 전체 문자열길이 - 마지막제외문자열 길이
		// 특정문자열.substring(0, 가져올 문자열개수) -> 제외할 문자열(마지막) 이외에
		// 0번지부터 문자열을 추출

		// 퀴즈 -> ".do" 제외하고 콘솔에 문자열을 표시하세요
		// 특정문자열.substring(0, 가져올문자열갯수);
		String s1 = "/index.do";
		System.out.println(s1.substring(0, s1.length() - 3));
		int ss1 = s1.length() - 3;
		String sss1 = s1.substring(0, ss1);
		System.out.println(sss1);

		String s2 = "/memberupdate.do";
		System.out.println(s2.substring(0, s2.length() - 3));

		String s3 = "/modify.do";
		System.out.println(s3.substring(0, s3.length() - 3));

		String s4 = "/admin_shop.do";
		System.out.println(s4.substring(0, s4.length() - 3));

		// ".do"로 끝나는 문자열
//		s4.substring(s4.length() - 3); // 마지막 세글자 . do

	}

}
