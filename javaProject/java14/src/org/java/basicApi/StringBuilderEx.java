package org.java.basicApi;

public class StringBuilderEx {

	public static void main(String[] args) {
		// StringBuffer -> ���� ����
		// OpenAPI -> �����͸� �ҷ��� �� ��� StringBuilder, StringBuffer
		// OpenAPI ����ó���� �����ڿ��� ���� ����

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
