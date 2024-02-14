package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("���� Exception");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("���ڸ� �Է�: ");
			int num2 = input.nextInt();
			System.out.println(num2); // �߸��� ���� �Է�
			System.out.println(num1 / num2); // 0���� ����
			System.out.println(arrInt[5]); // �迭 �ε��� �ʰ�
			System.out.println("OK");

		} catch (ArithmeticException e4) { // 0���� ���� ��
			e4.printStackTrace();

		} catch (InputMismatchException e3) { // �Է°� Ÿ�� ����
			e3.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e2) { // �迭 �ε��� ����
			e2.printStackTrace();

		} catch (Exception e1) {
			// ���� �����̿��� ��� ���ܸ� ó��
			e1.printStackTrace();
			System.out.println("��� ���� ó��");

		} finally {
			System.out.println("�⺻ ����");

		}
	}

}
