package org.java.test;


import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		// 1. �α��� ����
		// ���̵�� ��й�ȣ�� ���ÿ� ��ġ�ϸ� �α��μ���->�α��ο� ���� while��
		// ���ÿ� ��ġ���� ������ �α��� ����
		// 2. �α��� ���� ����->while�� ����
		// 3. �̿ܿ��� �ٽ� �α���->�α��ο� ���� while��

		RegisterDto member2 = new RegisterDto();

		Scanner input = new Scanner(System.in);
		boolean bool = true;
		while (bool) {
			System.out.println("ȸ�������� �����Ͻðڽ��ϱ�?\nȸ������ ������->yes,no ����->exit");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("ȸ������ ����");
				System.out.println("���̵� �Է�: ");
				String id = input.next();
				member2.setId(id);

				System.out.println("��й�ȣ �Է�: ");
				String password = input.next();
				member2.setPassword(password);

				System.out.println("���� �Է�: ");
				int age = input.nextInt();
				member2.setAge(age);

				while (true) {
					System.out.println("�α��� �����Ͻðڽ��ϱ� ����-> yse ����x-> no ����->exit");
					String join = input.next();

					if (join.equals("yes")) {
						System.out.println("�α��ν���");

						System.out.println("���̵� �Է�: ");
						String userid = input.next();

						System.out.println("��й�ȣ �Է�: ");
						String userpw = input.next();

						if (userid.equals(id) && password.equals(userpw)) {
							System.out.println("�α��� ����");
							break;
						} else {
							System.out.println("�α��� ���� �ٽ� �α����ϼ���");
						}

					} else if (join.equals("no")) {
						System.out.println("�α��� ����");
						break;
				

					} else if (join.equals("exit")) {
						System.out.println("while�� ����");
						break;

					}

				}

			} else if (order.equals("no")) {
				System.out.println("ȸ������ ����x");
			} else if (order.equals("exit")) {
				System.out.println("ȸ������ while�� ����");
				bool = false;
			} else {
				System.out.println("�Է°� ���� �ٽ� ���� �� �ּ���");
			}

		}

	}

}
