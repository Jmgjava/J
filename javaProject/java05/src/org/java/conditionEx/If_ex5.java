package org.java.conditionEx;

import java.util.Scanner;

public class If_ex5 {

	public static void main(String[] args) {
		System.out.println("if��");
		// �����ͺ��̽��� ���� �Ǿ� �ִ� ���̵�, ��й�ȣ
		String dbId = "root";
		String dbPw = "1234";

		// ���̵�, ��й�ȣ�� �Է¹޾Ƽ� �Ѵ� true��� "�α��� ����"
		// ���̵�, ��й�ȣ�� �Է¹޾Ƽ� �ϳ��� false��� "�α��� ����"

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է�: ");
		String userId = scn.next();
		System.out.println("��й�ȣ �Է�: ");
		String userPw = scn.next();

		// ���̵�� ��й�ȣ�� ���� ���
		if (dbId.equals(userId)) {
			if (dbPw.equals(userPw)) {
				System.out.println("�α��� ����");
			} else {
				// ��й�ȣ�� Ʋ��
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				System.out.println("�α��� ����");
			}
		} else { // ���̵� Ʋ��
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			System.out.println("�α��� ����");
		}
		// -> ����, �ΰ� -> �����ӿ�ũȭ ��Ŵ -> Spring Security
		// �α��� ����, ����(ROLE), oAuth2.0
		
		scn.close();
	}

}
