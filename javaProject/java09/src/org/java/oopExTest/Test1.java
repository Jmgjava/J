package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �� ) Scanner �̿��ؼ� ȸ�������ϰ� ȸ������ ������ �ܼ����
		// ���̵�, ��й�ȣ, ���̸� �Է��ϰ� -> �ֿܼ� id: m11, passward: m11, age:11
		// exit �ԷµǸ� while���� ����
		// while(true), ���ǹ�(if)

		// 1) ȸ������ �ϰڽ��ϱ�?
		// -> yes -> ���� -> ȸ������ -> ȸ�����
		// -> no -> ��������ʰ� -> ȸ������ ����
		// ** exit -> while���� ����

		// 2) close();

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

				boolean p = true;

				System.out.println("ȸ�������� �������ϴ�. ���α׷��� �����Ͻðڽ��ϱ�?\n yes or no");
				String out = input.next();
				while (p) {
					if (out.equals("no")) {
						System.out.println("�ٽ� ���ư��ϴ�.");
						p = false;
						break;

					} else if (out.equals("yes")) {
						System.out.println("���α׷� ����");
						bool = false;
						break;
					}
				}

			} else if (order.equals("no")) {
				System.out.println("ȸ������ ���� X");

			} else if (order.equals("exit")) {
				System.out.println("while�� ����");
				bool = false; // true -> false

			} else {
				System.out.println("�Է°� ����, �ٽ� �Է��ϼ���");
			}
			
			input.close();

		}

	}

}
