package org.java.loopEx;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {

		System.out.println("for��");
		// ������ ���۴�, ������ �Է¹޾Ƽ�(����) �������� ���
		// �� ) ���۴� 4, ���� 7 -> 4�� ���� 5,6,7 ���� �ֿܼ� ���
		// 4*4=16 ....... 7*9=63
		// ��, ������ ���۴��� ���ܺ��� �۾ƾ� �ȴ�.
		// ���࿡ ���۴��� ���ܺ��� ���� ������ "���۴��� ���ܺ��� �۾ƾ� �մϴ�." �ܼ� ���
		// if else��, for��

		Scanner scn = new Scanner(System.in);
		System.out.println("���۴� �Է�");
		int start = scn.nextInt(); // �񱳿����� -> int��

		System.out.println("���� �Է�");
		int last = scn.nextInt(); // �񱳿����� -> int��

		if (start < last) {
			
			System.out.println("���۴�: "+start+" ����: "+last);
			
			for (int i = start; i <= last; i++) {
				System.out.println(i + "��");

				for (int a = 2; a <= 9; a++) {
					System.out.println(i + "*" + a + "=" + (i * a));
				}
			}
		} else {
			System.out.println("���۴��� ���ܺ��� �۾ƾ� �մϴ�.");
		}

	}

}
