package org.java.loopEx;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		System.out.println("for��");

//		// 0~10 ������ ���
//		for (int i = 0; i < 10; i++) {
//
//			if (i == 9) {
//				// i�� 8���� Ŭ ���� ����
//				System.out.print(i);
//			} else
//				System.out.print(i + ",");
//		}

		// 9~0 1���� �ݺ���

		System.out.println("���� 9~0");

		for (int i = 9; i >= 0; i--) {
			// break ��� i==0�� ��� 0 -> for�� ����
			if (i == 0) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ",");
		} // break
		
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
			// 1 < 5 - > 1234
			// 1 <= 5 -> 12345
			for (int i = Num1; i <= Num2; i++) {
				// i -> 1,2,3,4,5 <-> 5
				if (i == Num2) {
					System.out.print(i); // 5--5
					break; // �������� ��츸 ���� �ϰ�
				}
				// break�� ������ ��ɹ��� ���� ���� �ʴ´�.
				System.out.print(i + ",");
			} // break;
		} else {
			System.out.println("ù ��° ���ڴ� �ݵ�� �� ��° ���ں��� �۾ƾ��Ѵ�");
		}
		
		scn.close();
		
		
		
		
		
		
	}
}
