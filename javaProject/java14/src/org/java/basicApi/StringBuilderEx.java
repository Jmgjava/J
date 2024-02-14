package org.java.basicApi;

public class StringBuilderEx {

	public static void main(String[] args) {
		// StringBuffer -> 거의 유사
		// OpenAPI -> 데이터를 불러올 때 사용 StringBuilder, StringBuffer
		// OpenAPI 제공처에서 개발자에게 사용법 제시

		System.out.println("StringBuilder");

//		StringBuffer sf1 = new StringBuffer("java");
		StringBuilder sb1 = new StringBuilder("java");
		System.out.println(sb1);

		sb1.append("2024");
		System.out.println(sb1);

		sb1.delete(0, 4);
		System.out.println(sb1);

		sb1.insert(0, "java");
		System.out.println(sb1);

		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

	}
}
