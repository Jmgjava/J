package org.java.oopExTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ���̵�, ��й�ȣ, ���� �Է��ϰ�
		// �ֿܼ� id: m11, password: 111, age: 11 ����ϰ�
		// setter, getter �̿�
		// �ٽ� ó������ ���ư����� �ۼ�

		// ȸ������ �Ŀ� �α��� ����
		// 1. �α��� ����
		// ���̵�� ��й�ȣ�� ���ÿ� ��ġ�ϸ� -> "�α��� ����" -> �α��ο� ���� while��
		// �ϳ��� ��ġ���� ������ -> "�α��� ����" -> �α��ο� ���� while��
		// 2. �α��� ���� ���� -> ��ü while�� ����
		// 3. �̿ܿ��� �ٽ� �α��� -> �α��ο� ���� while��

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("ȸ�������� ���� �Ͻðڽ��ϱ�?" + "\n while�� ����� exit, ȸ������ ������ yes, ȸ������ ����� no");
			// ���̵�, ��й�ȣ, ���� �Է��ϰ�
			// �ֿܼ� id : m11 , password : 11, age : 11 ��� �ϰ�
			// �ٽ� ó������ ���ư����� �ۼ�

			String order = input.next();

			if (order.equals("yes")) {
				System.out.println("ȸ������ ����");

				System.out.println("id: ");
				String inputId = input.next();

				System.out.println("passward: ");
				String inputPw = input.next();

				System.out.println("age: ");
				int inputage = input.nextInt();

				RegisterDto r1 = new RegisterDto(inputId, inputPw, inputage);

				String info = r1.toString();

				System.out.println(info);

				while (true) {
					System.out.println("�α��� �Ͻðڽ��ϱ�? yes or exit");

					String an = input.next();

					if (an.equals("yes")) {
						System.out.println("�α����ϼ���.");

						System.out.println("���̵�: ");
						String userId = input.next();

						System.out.println("��й�ȣ: ");
						String userPw = input.next();

						if (userId.equals(inputId) && userPw.equals(inputPw)) {
							System.out.println("�α��� ����");
							break;
						} else {
							System.out.println("�α��� ����. �ٽ� �õ��ϼ���");
						}
					} else if (an.equals("exit")) {
						System.out.println("while�� ����");
						bool = false;
						break;

					} else if (order.equals("no")) {
						System.out.println("ȸ������ ���� X");

					} else if (order.equals("exit")) {
						System.out.println("while�� ����");
						bool = false; // true -> false

					} else {
						System.out.println("�Է°� ����, �ٽ� �Է��ϼ���");
					}
					System.out.println("��ü while�� �ٽ� ����");
				}

				input.close();

			}

		}

	}
}
