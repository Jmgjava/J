package org.java.basicApi;

import java.util.Scanner;

public class StringBufferEx1 {

	public static void main(String[] args) {
		System.out.println("StringBuffer");

//		Scanner input = new Scanner(System.in);
//		String key = input.next();

		// String ������ ���� X
		String str1 = "java";
		String str2 = str1.concat("2024"); // ���ο� ���ڿ� ����

		System.out.println(str1);
		System.out.println(str2);

		StringBuffer sf1 = new StringBuffer("java");
		System.out.println(sf1);

		// Ư�� ���ڿ� �߰�
		sf1.append("2024"); // �������ڱ��� ����
		System.out.println(sf1);

		// ���ڿ� ����
		sf1.delete(0, 4); // 0 <= <4 => 0123
		System.out.println(sf1);

		// Ư����ġ�� ���ڿ� �߰�
		sf1.insert(0, "java"); // 0������ java�߰�
		System.out.println(sf1);

		// 2024 �ڿ� PROJECT�� �߰�
		sf1.insert(sf1.length(), "PROJECT");
		System.out.println(sf1);

		// ���� -> ���� ���ڿ� �ݴ�� ����
		sf1.reverse();
		System.out.println(sf1);
		sf1.reverse();
		System.out.println(sf1);

		// Ư�����ڿ��� -> ��ȯ�ض�
		sf1.replace(0, 4, "ORACLE"); // 0 ~ 3 ���� �ٲٰ��� �ϸ� 0, 4 - 1
		System.out.println(sf1);

		sf1.replace(6, 10, "2025");
		System.out.println(sf1);

		// substring -> Ư�� ���ڿ� ����
		int size = sf1.length();
		int pSize = "PROJECT".length();
		int startIdx = size - pSize;

		// ���� �ջ� ����
		System.out.println(sf1.substring(startIdx));
		System.out.println(sf1);

		// ó������ Ư�� ��ġ���� ����
		System.out.println(sf1.substring(0, startIdx));

		// StringBuffer -> String ��ȯ
		StringBuffer sf3 = new StringBuffer("String ����");
//		String.valueOf(sf3); // -> Ư�� ��ü�� String������ ��ȯ
		
		String sf33 = sf3.toString(); // String ��ȯ
		System.out.println(sf33+" << String");

	}

}
