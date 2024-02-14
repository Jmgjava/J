package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

interface In1 {
	abstract void indb() throws SQLException,IOException;	
}
//추상화 -> 공통 ,공유
class In1Sub1 implements In1{
	@Override
	public void indb() throws SQLException, IOException {		}
	}
class In1Sub2 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}
class In1Sub3 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
}

class In1Sub4 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
}

public class ExceptionEx_Sub {
	public static void main(String[] args) throws SQLException, IOException{		
		In1 i1=new In1Sub1(); 
		i1.indb();		
		i1=new In1Sub2();
		i1.indb();
		i1=new In1Sub3();
		i1.indb();		
		i1=new In1Sub4();
		i1.indb();
		
		
		
		
		
//		B b = new B();
//		b.m2();// 예외가 존재 하는 매서드를 사용 할때는 예외를 처리 후 사용
//
//		A a1 = new A();
//		a1.m1();
//
//		System.out.println("예외 처리 방법");
//		// 1. try~catch
//		try {
//			int num = 10 / 0;
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

		System.out.println("정상 종료");
	}
}




//class A {
//
//	void m1() {
//
////		Exception ex1=new Exception();
//
//		try {
//			// 아이디 찾기 -> DB테이블 저장된 아이디가 없으면
//			throw new IllegalArgumentException("아이디가 없습니다."); // 예외를 고의로 발생
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("정상 종료  m1");
//
//	}
//}
//
//class B {
//
//	void m2() throws SQLException, IOException {
//		System.out.println("예외가 있는 매서드");
//	}
//}
