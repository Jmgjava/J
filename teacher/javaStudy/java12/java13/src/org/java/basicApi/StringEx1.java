package org.java.basicApi;

public class StringEx1 {

	public static void main(String[] args) {

		System.out.println("String");
		// 생성방법
		String str1 = new String("java2024"); // new 객체
		String str2 = "java2024"; // 리터널 **** 값만 필요
		// char[] 이용해서 생성
		char[] ch1 = { 'j', 'a', 'v', 'a', '2', '0', '2', '4' };
		String str3 = new String(ch1);

		System.out.println(str1 + ", " + str2 + "," + str3);
		System.out.println("주소 비교");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);

		System.out.println("값 비교");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));

	}
}
