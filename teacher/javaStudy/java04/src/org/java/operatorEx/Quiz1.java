package org.java.operatorEx;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		System.out.println("=== Ȧ¦ =====");

		// Scanner�� �̿��ؼ� ������ �Է¹޾Ƽ� Ȧ¦���α׷��� ���� �Ͻÿ�.
		// Scanner, if��, ���������, ���Կ�����
		// ��°��� "¦���Դϴ�", "Ȧ���Դϴ�" ���� ����غ�����
		// 2�� �������� �� �������� 0�̸� ¦��, ������ Ȧ��

		Scanner scn = new Scanner(System.in);

		System.out.print("������ �Է�: ");
		int num1 = scn.nextInt();// ���� �� �Է�

		if (num1 % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		scn.close();

	}
}