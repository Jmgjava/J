package org.java.exceptionEx;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("Exception");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버OK!");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버NO!");
			e.printStackTrace();
		}

		System.out.println("프로그램 정상종료");

	}
}
