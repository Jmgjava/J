package org.java.basicApi;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		System.out.println("StringTokenizer");

		String url = "userId=m1111&userPw=1111&userName=���";
		// ������(��ȣ) & �� �̿��ؼ� ��ū�и�
		StringTokenizer token = new StringTokenizer(url, "&");
		int total = token.countTokens(); // ��ü ��ū�� ����
		System.out.println(total); // userId=m111, userPw=1111, userName=���

		// ���ڿ��� ��� ��ū�� ��ȸ -> while
		// ��ū�� �����ϸ�
		while (token.hasMoreTokens()) {
			// ���ڿ��� ��ū�� �ϳ��� ��ȸ
			String element = token.nextToken(); // ���ڿ��� ��ū�� �ϳ��� ��ȸ
			System.out.println(element);
		}

		System.out.println("================");
		String phone = "010-2345-6789";

		// while�� �̿��ؼ� ������(-)�� �����ϰ� ���
		StringTokenizer number = new StringTokenizer(phone, "-");
		while (number.hasMoreTokens()) {
			String num = number.nextToken();
			System.out.println(num);
		}

	}

}
