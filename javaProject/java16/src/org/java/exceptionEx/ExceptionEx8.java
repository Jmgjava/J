package org.java.exceptionEx;

public class ExceptionEx8 {

	static void m1() throws Exception {
		System.out.println("에외 발생 메소드");
	}

//	public static void main(String[] args) throws Exception { // 2.-----
	public static void main(String[] args) {

		System.out.println("Exception method");

		// 예외 메소드를 구현

		// 1.try-catch 문
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

		// 2. main 부문에 throws 추가
//		m1();

	}

}
