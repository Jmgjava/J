package org.java.controller;

import java.util.Scanner;

import org.java.service.ExcuteCommand;

public class ActionInsert extends ExcuteCommand {

	@Override
	public void excuteQueryCommand() {
		System.out.println("ȸ������");

//		boolean bool = true;

//		while (bool) {

		Scanner input = new Scanner(System.in);

		System.out.println("ȸ�� no: ");
		int no = input.nextInt();

		System.out.println("ȸ�� ID: ");
		String id = input.next();

		System.out.println("ȸ�� PW: ");
		String pw = input.next();

		System.out.println("ȸ�� ����: ");
		int age = input.nextInt();

		System.out.println("ȸ�� Name: ");
		String name = input.next();

		System.out.println("ȸ�� Phone: ");
		String phone = input.next();

		// ȸ������ ȸ�������� �Է�
		System.out.println("ȸ����ȣ: " + no);
		System.out.println("ȸ��ID: " + id);
		System.out.println("ȸ��PW: " + pw);
		System.out.println("ȸ������: " + age);
		System.out.println("ȸ���̸�: " + name);
		System.out.println("ȸ����ȣ: " + phone);
//		}
	}

}
