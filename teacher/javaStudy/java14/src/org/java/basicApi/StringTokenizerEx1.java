package org.java.basicApi;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {

		System.out.println("StringTokenizer");

		String url = "userId=m111&userPw=1111&userName=김이름";

		// 구분자(기호) &를 이용해서 토큰 분리
		StringTokenizer token = new StringTokenizer(url, "&");
		int total = token.countTokens();// 전체 토큰의 갯수

		System.out.println(total);// userId=m111, userPw=1111 , userName=김이름

		// 문자열의 모든 토큰을 조회 -> while
		// 토큰이 존재 하면 while문 실행 has~
		while (token.hasMoreTokens()) {
			// 문자열의 토큰을 하나씩 조회
			String elToken = token.nextToken(); // next~
			System.out.println(elToken);
		}

		System.out.println("====================");
		String phone = "010-1234-5678";

		// while문이용해서 콘솔에 구분자(-)를 제외하고 출력 해보세요

		StringTokenizer token2 = new StringTokenizer(phone, "-");

		System.out.println(token2.countTokens());
		while (token2.hasMoreTokens()) {
			String elToken = token2.nextToken();
			System.out.println(elToken);
		}

	}

}
