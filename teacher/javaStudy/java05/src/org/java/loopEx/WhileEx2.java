package org.java.loopEx;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		System.out.println("while");
		System.out.println("������");

		int i = 1;

		while (i < 9) {
			i++;
			System.out.println(i + "���Դϴ�");

			int j = 0;// 0123456789 -> �ٽ� �ʱ�ȭ ���Ѿ� �ȴ�. j-> 0
			while (j < 9) {
				j++;
				System.out.print(i + "*" + j + "=" + (i * j));
			}
			// j-> 10
		}

		System.out.println();

		// Scaner�̿�, ���� 2��
		// ù��° ����, �ι�° ���ڸ� �Է� �޾Ƽ�(������)
		// ù��° ���ں��� �ι�° ���ڱ��� �ֿܼ� ���
		// ����) 1, 5 -> 1,2,3,4,5 // while��
		// ������ ù��° ����<�ι�° ���� // if��
		// �� ������ false�� "ù��° ���ڴ� �ݵ�� �ι�° ���ں��� �۾ƾߵȴ�" �ֿܼ� ���
		// if,while�� �̿��ؼ� ���� �غ�����,
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���۴�: ");
		int firstNum = scn.nextInt();

		System.out.print("����: ");
		int secondNum = scn.nextInt();

		if (firstNum < secondNum) {
			while (firstNum <= secondNum) {
				
				System.out.println(firstNum + "���Դϴ�");

				int j = 0;
				while (j < 9) {
					j++;
					System.out.println(firstNum + "*" + j + "=" + (firstNum * j));
				}
				firstNum++;
			}

		} else {
			System.out.println("ù��° ���ڴ� �ݵ�� �ι�° ���ں��� �۾ƾߵȴ�");
		}

	}
}
