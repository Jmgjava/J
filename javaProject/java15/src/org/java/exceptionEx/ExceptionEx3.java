package org.java.exceptionEx;

import java.util.Scanner;

public class ExceptionEx3 {

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
		} catch (ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
		} catch (Exception e1) { // 0���� ������
			e1.printStackTrace();
		} finally {
			System.out.println("����");
		}
	}

}
