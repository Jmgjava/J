package org.java.loopEx;

import java.util.Scanner;

public class LoopEx2 {
	public static void main(String[] args) {

		System.out.println("�ݺ���");

		// 1���� 10���� �߿��� ¦���� �ֿܼ� ���

		// 1. if-else
		for (int i = 1; i <= 10; i++) {
//			if(i%2==0) {
//				System.out.println("¦��: "+i);
//			}else {
//				System.out.println("Ȧ��: "+i);
//			}

			// 2. continue
			if (i % 2 == 0) {
				System.out.println("¦��: " + i);
				continue;
			}
		}

		System.out.println("while");

		Scanner scn = new Scanner(System.in);

		// ���� ADMIN�� �Է��ϸ� -> "����� ������ ADMIN�Դϴ�" ���
		// exit �Է��ϸ� while�� ����
		// �� ���� �� exit�̿��� ���ڸ� �Է��ϸ� "�ٽ� �Է��ϼ���" ���
		// while�� �̿��ؼ� �ۼ�, ���ǹ� switch,if

		boolean i=true;
		
		while (i) {
			System.out.println("������ �Է��ϼ���(ADMIN, MEMBER, SELLER)");
			String userId = scn.next();

			
			switch (userId) {
			
		
			
			case "ADMIN":
				System.out.println("����� ������ ADMIN�Դϴ�");
				break;

			case "MEMBER":
				System.out.println("����� ������ MEMBER�Դϴ�");
				break;

			case "SELLER":
				System.out.println("����� ������ SELLER�Դϴ�");
				break;

			case "EXIT":
				System.out.println("���α׷� ����");
				i=false;
				break;

			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}
//		System.out.println("main ����");
		

	}

}
