package org.java.loopEx;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		// Scanner�̿�, ���� 2��
		// ù ��° ����, �� ��° ���ڸ� �Է� �޾Ƽ�(������)
		// ù ��° ���ں��� �� ��° ���ڱ��� �ֿܼ� ���
		// ����) 1, 5 -> 1,2,3,4,5 // for��
		// for (int i=ù ��°; ù ��° < �� ��°; i++)
		// ������ ù��° ����<�ι�° ���� // if��
		// �� ������ false�� "ù ��° ���ڴ� �ݵ�� �� ��° ���ں��� �۾ƾ��Ѵ�" �ֿܼ� ���
		// if,for�� �̿��ؼ� ���� �غ�����.

		Scanner scn = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է�: ");
		int Num1 = scn.nextInt();

		System.out.println("�� ��° ���� �Է�: ");
		int Num2 = scn.nextInt();

		if (Num1 < Num2) {
			for (int i = Num1; i <= Num2; i++) {
				if (i == Num2) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
			}
		} else {
			System.out.println("ù ��° ���ڴ� �ݵ�� �� ��° ���ں��� �۾ƾ��Ѵ�");
		}

		scn.close();

	}
}