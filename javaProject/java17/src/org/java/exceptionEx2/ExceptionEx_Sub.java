package org.java.exceptionEx2;

import java.io.IOException;
import java.sql.SQLException;

interface in1 {
	void indb() throws SQLException, IOException; // 추상 메소드 ( public abstract 스킵 )
}

// 추상화 -> 클래스들의 공통적인 요소를 뽑아서 상위 클래스를 만드는 것

class In1Sub1 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub1 indb() method");
	}
}

class In1Sub2 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub2 indb() method");

	}
}

class In1Sub3 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub3 indb() method");

	}
}

//class A {
//
//	void m1() {
//
//		try {
//			// IllegalArgumentException **입력받은 인자(매개인자)가 틀릴 경우
//			// 비밀번호 오류, 검색어 , 화가이비...
//			// 아이디 찾기 -> DB테이블에 저장된 아이디가 없음 -> 예외 발생
//			// Exception ex1 = new Exception();
//			throw new IllegalArgumentException("아이디가 없습니다."); // 예외를 고의로 발생
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("정상 종료 m1");
//	}
//}
//
//class B {
//
//	void m2() throws SQLException, IOException {
//		System.out.println("예외가 잇는 메소드");
//	}
//}

public class ExceptionEx_Sub {

	public static void main(String[] args) throws SQLException, IOException {

		in1 i1 = new In1Sub1();
		i1.indb();

		i1 = new In1Sub2();
		i1.indb();

		i1 = new In1Sub3();
		i1.indb();

//		System.out.println("예외 처리 방법");
//
//		B b1 = new B();
//		b1.m2(); // 예외가 존재하는 메소드를 사용 할 때는 예외를 처리 후 사용
//
//		A a1 = new A();
//		a1.m1();
//
//		// 1.try-catch 문
//		try {
//			int num = 10 / 0;
//
//			System.out.println("예외 없이 정상 실행");
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException");
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("catch문 이외의 모든 예외 처리");
//			e.printStackTrace();
//		} finally {
//			System.out.println("예외와 상관없이 무조건 실행");
//		}

	}

}
