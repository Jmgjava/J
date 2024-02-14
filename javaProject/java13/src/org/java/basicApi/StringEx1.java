package org.java.basicApi;

public class StringEx1 {

	public static void main(String[] args) {

		System.out.println("String");

		// 생성방법
		String str1 = new String("String"); // new 객체
		String str2 = "String"; // 리터럴 *** 값만 필요

		// char[] 이용해서 생성
		char[] ch = { 'S', 't', 'r', 'i', 'n', 'g' };
		String str3 = new String(ch);

		System.out.println(str1 + "," + str2 + "," + str3);

		System.out.println("주소 비교");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);

		System.out.println("값만비교");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));

	}

}
