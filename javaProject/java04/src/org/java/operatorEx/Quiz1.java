
package org.java.operatorEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		System.out.println("=== Ȧ ¦ ===");
		// Scanner�� �̿��ؼ� ������ �Է��� Ȧ¦���α׷��� �����Ͻÿ�.
		// Scanner, if��, ���������, ���Կ�����
		// ��°��� "¦���Դϴ�.", "Ȧ���Դϴ�." ���� ����غ��ÿ�.
		// �������� 2�� �������� �� �������� 0�̸� ¦��

		Scanner scn = new Scanner(System.in);

		System.out.println("���� �� �Է�");
		int num1 = scn.nextInt(); // ���� �� �Է�

		if (num1 % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}

		scn.close();

	}

}
