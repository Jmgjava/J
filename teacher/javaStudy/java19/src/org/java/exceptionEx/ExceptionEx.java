package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

class A {

	void m1() throws ArithmeticException {

//		System.out.println(5/0);	

//		throw new SQLException();

		try {
			// ���ܸ� ������.
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionEx {

	public static void main(String[] args) {

		int[] arr = new int[5];
		try {
			System.out.println(3 / 1);// ���ܹ߻��� �Ǹ� 1
			System.out.println("�������1");
//			arr[6]=10;
			arr[4] = 10;
			System.out.println("�������2");
		} catch (ArithmeticException e) {// ���� ó�� 2
			e.printStackTrace();// ���ܸ� ó���ϰ� �������
//			System.out.println("0���� ���������ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) { // ��翹�� ó��
			e.printStackTrace();
		} finally {
			System.out.println("���ܿ� ������� ������ ����");
			// DB���� �� �� -> �������Ŀ��� �ݵ�� DB������ ����
		}

		System.out.println("���α׷� ���� ����");

	}
}
