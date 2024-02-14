package org.java.basicApi;

public class StringEx5 {

	public static void main(String[] args) {

		// .do 제외한 문자열을 추출 -> 하나의 메소드 substring()
		String query1 = "/register.do"; // -> /register
		String query2 = "/list.do"; // -> /list
		String query3 = "/modify.do"; // -> /modify
		String query4 = "/memberDelete.do"; // -> /memberDelete

		// ***특정문자열, substring(0, 가져올 문자열개수);
		// 0번지부터 문자열을 가져올 때는 (0, 가져올 문자열갯수)
		System.out.println(query1.substring(0, query1.length() - 3));
		System.out.println(query2.substring(0, query2.length() - 3));
		System.out.println(query3.substring(0, query3.length() - 3));
		System.out.println(query4.substring(0, query4.length() - 3));

		// 특정 문자열 끝문자열(문자수3개) .do -> 콘솔에 표시 substring(가져올 시작번지)
		// 가져올 시작번지 -> 전체문자열 길이 - 가져올문자열 개수
		System.out.println(query1.substring(query1.length() - 3));
		System.out.println(query2.substring(query2.length() - 3));
		System.out.println(query3.substring(query3.length() - 3));
		System.out.println(query4.substring(query4.length() - 3));
		
		//

	}
}
