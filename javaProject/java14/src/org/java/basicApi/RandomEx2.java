package org.java.basicApi;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		System.out.println("Random");

		Random rd = new Random();

		// 5������ -> ������ �������� ����
		for (int i = 0; i < 5; i++) {
			int rdInt = rd.nextInt();
			System.out.println(rd.nextInt(100));
			System.out.println(Integer.toBinaryString(rdInt));
			// 2���� ���ڿ�
		}

		System.out.println(Integer.toBinaryString(10));

		// 5�� ���� -> ������ ������ ����
		for (int i = 0; i < 5; i++) {
			System.out.println(rd.nextInt(45));
		}

		System.out.println();

		System.out.println();
		// 5�� ���� -> ���� �Ҽ��� 2�ڸ�
		for (int i = 0; i < 5; i++) {
			System.out.printf("%.2f \n", rd.nextDouble());
		}

		System.out.printf("%d+%d=%d", 5, 15, (5 + 15));

	}

}
