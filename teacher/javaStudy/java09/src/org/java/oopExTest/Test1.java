package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		// while(true) -> break;
		while (bool) {
			System.out.println("ȸ�������� ���� �Ͻðڽ��ϱ�? " + " \n while�� ����(exit), ȸ�����Խ���(yes), ȸ����������(no)");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("ȸ������ ���� ");
				// ���̵�, �����ȣ, ���� �Է��ϰ�
				// �ֿܼ� id: m11, password: m11, age:11 ��� �ϰ�
				// setters,getters�̿�, toString �̿�
				// �ٽ� ó������ ���ư����� �ۼ��� ������
				System.out.print("���̵� �Է�: ");
				String userId = input.next();
				member1.setId(userId);

				System.out.print("�����ȣ �Է�: ");
				String passWord = input.next();
				member1.setPassword(passWord);

				System.out.print("���� �Է�: ");
				int age = input.nextInt();
				member1.setAge(age);

				System.out.println();
				// �������
				String info = member1.toString();
				System.out.println(info);

			} else if (order.equals("no")) {
				System.out.println("ȸ������ ���� X, �ٸ� �۾� -> ");
			} else if (order.equals("exit")) {
				System.out.println("while����");
				bool = false;// true -> false
				// while(true) -> break;
			} else {
				System.out.println("�Է°� ����-> �ٽ� �Է� �ϼ���");
			}
		}

		input.close();

	}
}
