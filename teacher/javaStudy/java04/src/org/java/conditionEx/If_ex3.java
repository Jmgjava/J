package org.java.conditionEx;

import java.util.Scanner;

public class If_ex3 {

	public static void main(String[] args) {
		System.out.println("if");

//		����,����,������ ����� 90�̻��̸� "A"�� �ֿܼ� ���
//		����,����,������ ����� 80�̻��̸� "B"�� �ֿܼ� ���
//		����,����,������ ����� 70�̻��̸� "C"�� �ֿܼ� ���
//		����,����,������ ����� 60�̻��̸� "D"�� �ֿܼ� ���
//		����,����,������ ����� 60�̸��̸� "F"�� �ֿܼ� ���
//		����,����, ���� ������ ���� �Է� �޾Ƽ� ��� ���

		Scanner scn = new Scanner(System.in);

		System.out.print("��������: ");
		int kor = scn.nextInt();

		System.out.print("��������: ");
		int eng = scn.nextInt();

		System.out.print("��������: ");
		int math = scn.nextInt();
		// ���հ�
		int sum = kor + eng + math;
		// �����
		int subject = 3;

		// ���
		double avg = (double) sum / subject;

		System.out.println("���հ�: " + sum + ", �����: " + subject + ", ���: " + avg);

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}

		scn.close();

	}
}
