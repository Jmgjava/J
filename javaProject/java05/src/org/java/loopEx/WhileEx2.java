package org.java.loopEx;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		System.out.println("while");
		System.out.println("������");

		int i = 1;

		while (i < 9) {
			i++;
			System.out.println(i + "���Դϴ�.");

			int j = 0; // 0123456789 -> �ٽ� �ʱ�ȭ ���Ѿ� �Ѵ�. j -> 0
			while (j < 9) {
				j++;
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			// j -> 10
		}
		
		System.out.println("============================================");

		// Scanner�̿�, ���� 2��
		// ù ��° ����, �� ��° ���ڸ� �Է� �޾Ƽ�(������)
		// ù ��° ���ں��� �� ��° ���ڱ��� �ֿܼ� ���
		// ����) 1, 5 -> 1,2,3,4,5 // while��
		// ������ ù��° ����<�ι�° ���� // if��
		// �� ������ false�� "ù ��° ���ڴ� �ݵ�� �� ��° ���ں��� �۾ƾ��Ѵ�" �ֿܼ� ���
		// if,while�� �̿��ؼ� ���� �غ�����.

		Scanner scn = new Scanner(System.in);
		System.out.println("���� ��: ");
		int Num1 = scn.nextInt();

		System.out.println("�� ��: ");
		int Num2 = scn.nextInt();

		if (Num1 < Num2) {

			while (Num1 <= Num2) {
				System.out.println(Num1 + "���Դϴ�.");

				int j = 0;
				while (j < 9) {

					j++;
					System.out.println(Num1 + "*" + j + "=" + (Num1 * j));
				}
				Num1++;
			}
		}

	}

}
