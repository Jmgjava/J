package org.java.conditionEx;

import java.util.Scanner;

public class if_ex3 {

	public static void main(String[] args) {
		System.out.println("����");

		/*
		 *** ����
		 *** 
		 * ���� ���� ���α׷� ����, ����, ������ ����� 95�̻��̸� ��S���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 90�̻��̸� ��A���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 85�̻��̸� ��B+���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 80�̻��̸� ��B���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 75�̻��̸� ��C+���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 70�̻��̸� ��C���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 65�̻��̸� ��D+���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 60�̻��̸� ��D���� �ֿܼ� ���
		 * 
		 * ����, ����, ������ ����� 60�̸��̸� ��F���� �ֿܼ� ���
		 * 
		 * ����, ����, ���� ������ ���� �Է� �޾Ƽ� ����� ���
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("����: ");
		int Kor = scn.nextInt();

		System.out.println("����: ");
		int Eng = scn.nextInt();

		System.out.println("����: ");
		int Math = scn.nextInt();

		int sum = Kor + Eng + Math;

		int sub = 3;

		double avg = (double) sum / sub;

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println(avg + " S");
			} else {
				System.out.println(avg + " A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println(avg + " B+");
			} else {
				System.out.println(avg + " B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println(avg + " C+");
			} else {
				System.out.println(avg + " C");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println(avg + " D+");
			} else {
				System.out.println(avg + " D");
			}
		} else {
			System.out.println(avg + " F");
		}

		scn.close();

	}

}
