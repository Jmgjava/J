package org.java.loopEx;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.println("for��");
		// ������

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "���Դϴ�.");
			// i ->2 -> 9��
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		System.out.println("9�ܺ��� 2�ܱ���");

		for (int q = 9; q >= 2; q--) {
			System.out.println(q + "��");

			for (int a= 2; a <= 9; a++) {
				System.out.println(q+"*"+a+"="+(q*a));
			}
		}

	}

}
