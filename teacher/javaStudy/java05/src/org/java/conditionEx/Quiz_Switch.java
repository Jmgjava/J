package org.java.conditionEx;

import java.util.Scanner;

public class Quiz_Switch {

	public static void main(String[] args) {
		System.out.println("switch-> �˻�");

		// �˻� ����(subject)�� ������ !=null, !=""
		String subject = null;// �˻� ����

		System.out.print("�˻����� �Է�: ");
		Scanner scn = new Scanner(System.in);
		subject = scn.next();

		// �˻��� -> itemName(��ǰ��), itemDetail(��ǰ�󼼳���),writer(�����)
		String itemName = "��ǰ1";
		String itemDetail = "��ǰ1�󼼳���";
		String writer = "��ǰ1�����";

		if (subject != null) {
			switch (subject) {
			case "��ǰ��":
				System.out.println("�˻� ��ǰ��: " + itemName);
				break;
			case "��ǰ�󼼳���":
				System.out.println("��ǰ�󼼳���: " + itemDetail);
				break;
			case "��ǰ�����":
				System.out.println("��ǰ�����: " + writer);
				break;
			default:
				System.out.println("��ǰ �˻� ����");
			}

		} else {
			System.out.println("�˻� ������ ����!");
		}

	}
}
