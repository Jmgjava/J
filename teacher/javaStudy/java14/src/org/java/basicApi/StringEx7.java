package org.java.basicApi;

import java.util.Scanner;

public class StringEx7 {

	public static void main(String[] args) {
		System.out.println("String");

		String str1 = "java";
		String str2 = "2024";
		// ���ڿ�1+���ڿ�2 -> ���ο� ���ڿ� ** ������ ������ ����
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1);

		// Ư�� ���ڿ��� ���ԵǾ� �ִ���? -> �˻�
		String search = "java";
		String oldContent = "java project";
		// �����ڿ����� ã�� Ű����
		boolean result = oldContent.contains(search); // ������(�������� ����)
		System.out.println(result);

		if (result == true) {
			System.out.println("java �˻� �� �� �ֽ��ϴ�.");
		} else {
			System.out.println("java�� �˻� �� �� �����ϴ�. ");
		}
		// ��û ���ڿ��� ���Ѵ� ��ġ���� ��ȸ(���ڿ� ����) -> ���� ��Ʈ�ѷ����� Ȱ��

		String requestURL = "/insert.do";
		// ����1
		int size = requestURL.length(); // ��ü ���ڿ� ����
		int valSize = ".do".length(); // ������ ������ ���ڿ� ����
		int startIdx = size - valSize; // ������ ������ ���ڿ� ù��°�ε���

		// ���ڿ� ���ڷ� 3�� ���� .do
		// substring(�ε���) -> ��ü����-3 -> ������ ���۹���
		System.out.println(requestURL.substring(startIdx));

		// ������ Ư��(�ݺ����ڿ�)���ڿ��� �����ϰ� 0��������(ó��) ����
		// /insert.do, modify.do,memberUpdate.do
		// substring(0, �����ù��ڿ�����)
		// ��ü���� -������ ������ ���ڿ� ���� -> startIdx -> �����ù��ڿ�����
		System.out.println(requestURL.substring(0, startIdx));

		System.out.println("���ڿ� �Է�(���� .do�� �����ߵȴ�)");

		Scanner input = new Scanner(System.in);
		String requestInput = input.next();

		System.out.println("�ԷµȰ�: " + requestInput);

		// .do�� ������ ���ڿ�
		String rsStr = requestInput.substring(0, requestInput.length() - 3);
		System.out.println(".do������ ���ڿ�: " + rsStr);

	}
}
