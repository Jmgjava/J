package org.java.basicApi;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class StringEx7 {

	public static void main(String[] args) {
		System.out.println("String");

		String str1 = "java";
		String str2 = "2024";
		// ���ڿ�1 + ���ڿ�2 = ���ο� ���ڿ� *** ������ ��������
		String str3 = str1.concat(str2);
		System.out.println(str3);

		// Ư�� ���ڿ��� ���ԵǾ� �ִ°�? -> �˻�
		String search = "java";
		String oldcontent = "javaproject";
		// �����ڿ�.contains(ã�� Ű����)
		boolean result = oldcontent.contains(search); // ������(�������� ����)
		if (result == true) {
			System.out.println("java ���Ե� ��� ����");
		} else {
			System.out.println("java �� ���Ե� ��� ����");
		}
		// ��û ���ڿ��� ���ϴ� ��ġ���� ��ȸ(���ڿ� ����) -> ���� ��Ʈ�ѷ����� Ȱ��

		String requestURL = "insert.do";
		// ����1
		int size = requestURL.length(); // ��ü ���ڿ� ����
		int valSize = ".do".length(); // ������ ������ ���ڿ� ����
		int startidx = size - valSize; // ������ ������ ���ڿ� ù��° �ε���

		// ���ڿ� ���ڷ� 3�� ���� .do
		// substring(�ε���) -> ��ü���� -3 -> ������ ���۹���
		System.out.println(requestURL.substring(startidx));

		// ������ Ư��(�ݺ����ڿ�)���ڿ��� �����ϰ� 0��������(ó��) ����
		// /insert.do, modify.do, memberUpdate.do
		// substring(0, �����ù��ڿ�����);
		// ��ü���� - ������ ������ ���ڿ� ���� -> startidx -> �����ù��ڿ�����
		System.out.println(requestURL.substring(0, startidx));

		System.out.println("���ڿ��Է�(���� .do�� ��������)");

		Scanner scn = new Scanner(System.in);

		String input = scn.next();
		System.out.println("�Էµ� ��: " + input);

		int fullSize = input.length();
		int doSize = ".do".length();
		String lastSize = input.substring(0, fullSize - doSize);

		if (input.contains(".do")) {
			System.out.println(".do ������ ���ڿ�: " + lastSize);
		} else {
			System.out.println(".do�� ���ԵǾ� ���� �ʽ��ϴ�.");
		}

	}

}
