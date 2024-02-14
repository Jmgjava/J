package org.java.basicApi;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println("String");

		System.out.println("subString()");

		String str1 = "Java 2024 Project";
		System.out.println("substring(인덱스) -> 문자열의 인덱스부터 반환(return(get))");
		System.out.println(str1.length()); // 17
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(10));
		System.out.println("project".length()); // project 길이

		// 10 3 < - 끝자리 가져올 문자열
		// 10 - 3 => 7 -> 인덱스 번호 7 -> 실제 문자열 순서(8번째)
		String insert = "/member_insert.do";
		String dolength = ".do";

		// 공식 -> 전체문자열길이-가져올문자열(끝문자열)
		// -> 가져올 시작번지
		// substring(시작번지)
		System.out.println(insert.length());
		System.out.println(insert.substring(7));

		// 전체 문자열 길이 - ".do"
		System.out.println(insert.length() - dolength.length());
		int index = insert.length() - dolength.length();
		System.out.println(insert.substring(index));

		System.out.println("===퀴즈===");

		// 퀴즈
		// update, select, delete 문자열에서 마지막 .do 를 콘솔에 출력
		// substring() 이용해야함

		String update = "/member_update.do";
		int up = update.length() - ".do".length();
		System.out.println(update.substring(up));

		String select = "/member_select.do";
		int se = select.length() - ".do".length();
		System.out.println(update.substring(se));

		String delete = "/member_delete.do";
		int de = delete.length() - ".do".length();
		System.out.println(update.substring(de));
		
		// 문제

		System.out.println("사용자 요청 정보 입력");

		Scanner scn = new Scanner(System.in);

		System.out.println("입력(반드시 끝에 .do 입력) : ");

		String query = scn.next();
		System.out.println(query);

		// query에서 .do만 query2에 저장
		int index2 = query.length()	-".do".length();
		String query2 = query.substring(index2); // .do
		
		System.out.println(query2);



	}

}
