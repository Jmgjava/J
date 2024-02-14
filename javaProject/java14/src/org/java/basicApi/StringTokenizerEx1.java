package org.java.basicApi;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		System.out.println("StringTokenizer");

		String url = "userId=m1111&userPw=1111&userName=김모씨";
		// 구분자(기호) & 룸 이용해서 토큰분리
		StringTokenizer token = new StringTokenizer(url, "&");
		int total = token.countTokens(); // 전체 토큰의 갯수
		System.out.println(total); // userId=m111, userPw=1111, userName=김모씨

		// 문자열의 모든 토큰을 조회 -> while
		// 토큰이 존재하면
		while (token.hasMoreTokens()) {
			// 문자열의 토큰을 하나씩 조회
			String element = token.nextToken(); // 문자열의 토큰을 하나씩 조회
			System.out.println(element);
		}

		System.out.println("================");
		String phone = "010-2345-6789";

		// while문 이용해서 구분자(-)를 제외하고 출력
		StringTokenizer number = new StringTokenizer(phone, "-");
		while (number.hasMoreTokens()) {
			String num = number.nextToken();
			System.out.println(num);
		}

	}

}
