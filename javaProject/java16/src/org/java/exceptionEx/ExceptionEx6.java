package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {

		System.out.println("Exception");

		Scanner scn = new Scanner(System.in);
		int[] arrInt = new int[5];
		System.out.println("==1==");

		try {
//			for (int i = 0; i < 6; i++) {
//				System.out.println(arrInt[i]);
//			}
			System.out.println("==2==");

			System.out.println("���� �Է�: ");
			int num = scn.nextInt();
			System.out.println("�Է°�: " + num);
			System.out.println("==3==");

			System.out.println("�������");
			System.out.println("==4==");

		} catch (InputMismatchException e2) {
			System.out.println("==5-1==");
			System.out.println("Ÿ���� ���� ����");
			e2.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("==5-2==");
			System.out.println("�迭 �ʰ�");
			e1.printStackTrace();

		} catch (Exception e) {
			System.out.println("==5-3==");
			System.out.println("�� 2���� ���� �� ��� ����");
			e.printStackTrace();

		} finally {
			System.out.println("==6==");
			System.out.println("������ ����");

		}

		System.out.println("==7==");
		System.out.println("���α׷� ���� ����");
	}

}
