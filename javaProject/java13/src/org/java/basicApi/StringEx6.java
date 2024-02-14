package org.java.basicApi;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {

		// Scanner�� �̿��ؼ� �Է°��� ".do"�� ������ ȸ������ ����(while)
		// �Է°��� "exit" -> ��ü while�� ����
		// �Է°��� .do, exit �̿ܤ��� ���� �Է��ϸ� -> �ٽ��Է� �ܼ�

		// ���� while�� -> ".do��" ȸ������ ����
		// "/insert.do"�ԷµǸ� /insert -> "ȸ������"
		// "/update.do"�ԷµǸ� /update -> "ȸ������"
		// "/select.do"�ԷµǸ� /select -> "ȸ����ȸ"
		// "/delete.do"�ԷµǸ� /delete -> "ȸ������"
		// �߸� �Է��ϸ�. -> "�ٽ� �Է����ּ���"
		// "exit.do" �ԷµǸ� -> ��ü while���� ����

		Scanner scn = new Scanner(System.in);
		System.out.println("����� ��û ���� �Դϴ�. ( .do �Է� )");

		boolean bool = true;
		while (bool) {
			System.out.println("��û���� �Է�: ");
			
			String input = scn.next();
//			System.out.println(input);
			
			String d1 = input.substring(input.length() - 3); // .do
//			System.out.println(d1);

			if (d1.equals(".do")) {
//				System.out.println("��û ���� ->" + input);
				String fi = input.substring(0, input.length() - 3);
//				System.out.println(".do���� ->" + fi);

				if (fi.equals("/insert")) {
					System.out.println("ȸ������");
				} else if (fi.equals("/update")) {
					System.out.println("ȸ������");
				} else if (fi.equals("/select")) {
					System.out.println("ȸ����ȸ");
				} else if (fi.equals("/delete")) {
					System.out.println("ȸ������");
				} else {
					System.out.println("�ٽ��Է�");
				}
			} else if (input.equals("/exit.do")) {
				System.out.println("���α׷� ����");
				bool = false;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}
}
