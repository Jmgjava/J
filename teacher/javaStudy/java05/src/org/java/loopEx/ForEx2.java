package org.java.loopEx;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.println("for��");
		// ������
		System.out.println("2��~9�ܱ���");
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "���Դϴ�");

			// i-> 2 -> 9��
			for (int j = 1; j <= 9; j++) {
				// 2*1,2*2,,, 2*9
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			// i++ -> 3456789
		}
		System.out.println();

		// 9�ܺ��� 2�ܱ��� �ֿܼ� ���
		System.out.println("9��~2�ܱ���");
		for (int i = 9; i >= 2; i--) {
			// 9 , 8 765432
			System.out.println(i + "���Դϴ�");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}
}
