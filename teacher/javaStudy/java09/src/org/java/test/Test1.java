package org.java.test;


import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		while (bool) {
			System.out.println("ȸ�������� ���� �Ͻðڽ��ϱ�?"
					+ "\nwhile�� ����-> exit,"
					+ "\nȸ������ ����-> yes, no");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("ȸ������ ����");
				// ���̵� ��� ���� �Է��ϰ� �ֿܼ� ���
				// setters getters tostring�̿�
				// �ٽ� ó������
				System.out.print("���̵�: ");
				String id = input.next();
				member1.setId(id);
				
				System.out.print("��й�ȣ: ");
				String password = input.next();
				member1.setPassword(password);
				
				System.out.print("����: ");
				int age = input.nextInt();
				member1.setAge(age);
				
				// �������
				System.out.println();
				String info = member1.toString();
				System.out.println(info);

			} else if (order.equals("no")) {
				System.out.println("ȸ������ ����x");

			} else if (order.equals("exit")) {
				System.out.println("while�� ����");
				bool = false; // true->false
			} else {
				System.out.println("�Է°� ����\n �ٽ� �Է��ϼ���");
			}

		}input.close();
	}

}
