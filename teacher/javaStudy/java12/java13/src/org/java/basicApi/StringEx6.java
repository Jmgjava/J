package org.java.basicApi;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {

		// Scanner�̿��ؼ� �Է°��� ".do" �� ȸ������ ����(while)
		// �Է°��� "exit" -> ����while�� ����
		// �Է°��� .do, exit�̿��� ���� �Է��ϸ� -> �ٽ� �Է� �ܼ�
		// ".do" �� ȸ������ ����
		// "/insert.do" �ԷµǸ� /insert -> "ȸ������" �ܼ�
		// "/select.do" �ԷµǸ� /select-> "ȸ����ȸ" �ܼ�
		// "/udpate.do" �ԷµǸ� /udpate-> "ȸ������" �ܼ�
		// "/delete.do" �ԷµǸ� /delete-> "ȸ��Ż��" �ܼ�
		// "/fdsafda.do" �߸� /fdsafd -> "�ٽ� �Է� ���ּ���"
		// "/exit.do" �ԷµǸ� /exit-> ��üwhile���� ����

		System.out.println("����� ��û ���� �Դϴ�.(/inset.do �Է�)");
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.print("��û�����Է�: ");

			String order = input.next();
			// System.out.println(order);

			String rsOrder = order.substring(order.length() - 3);// �� 3
			// System.out.println(rsOrder);

			// ".do" -> ȸ��, ".board"-> �Խ���, ".sh" -> ��ǰ, ".ad"-> ������

			if (rsOrder.equals(".do")) {

				// System.out.println("��û����-> "+order);
				String url = order.substring(0, order.length() - 3);
				// System.out.println(".do ���� -> "+url);

				if (url.equals("/insert")) {
					System.out.println("ȸ������");
				} else if (url.equals("/update")) {
					System.out.println("ȸ������");
				} else if (url.equals("/select")) {
					System.out.println("ȸ����ȸ");
				} else if (url.equals("/delete")) {
					System.out.println("ȸ��Ż��");
				} else {
					System.out.println("URL�Է¿���-> �ٽ� �Է� ���ּ���");
				}

			} else if (order.equals("exit")) {
				System.out.println("���� ����");
				bool = false;
			} else {
				System.out.println("�ٽ� �Է� ���ּ���");
			}

		}

	}
}
