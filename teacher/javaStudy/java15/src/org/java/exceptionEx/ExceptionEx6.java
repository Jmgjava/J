package org.java.exceptionEx;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("Exception");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹�OK!");

		} catch (ClassNotFoundException e) {
			System.out.println("����̹�NO!");
			e.printStackTrace();
		}

		System.out.println("���α׷� ��������");

	}
}
