package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx6 {

	public static void main(String[] args) {

		// ���̵�� ��й�ȣ�� �Է¹޾Ƽ�
		// �Է¹��� ���̵� dbId�� �Է¹��� ��й�ȣ dbPw�� ���ÿ� ��ġ �ϸ�
		// �ֿܼ� "�α��� ����" ������ �ϸ� "�α��� ����"�� ��µǵ��� ���α׷��� �Ͻÿ�.
		// Scanner, equals, &&, if~else���� Ȱ���Ͽ� �ۼ��Ͻÿ�.

		String Id = "id";
		String Pw = "pw";

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵�: ");
		String userId = scn.next();// return ��ȯ�ȴ� -> ���ڿ�

		System.out.println("��й�ȣ: ");
		String userPw = scn.next();

		if (userId.equals(Id) && (userPw.equals(Pw))) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		scn.close();
	}
}
