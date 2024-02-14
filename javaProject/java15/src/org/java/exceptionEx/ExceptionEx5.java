package org.java.exceptionEx;

public class ExceptionEx5 {

	public static void main(String[] args) {

		System.out.println("Exception");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버가 정상적으로 로드되었습니다.");

		} catch (ClassNotFoundException e1) {
			System.out.println("드라이버가 존재하지 않습니다.");
			e1.printStackTrace();

		} catch (Exception e) {
			System.out.println("모든 예외 처리");

		}
		System.out.println("프로그램 정상종료");

	}

}
