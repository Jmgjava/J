package org.java.exceptionEx;

public class ExceptionEx9 {

	static void m1() throws Exception{
		System.out.println("예외 발생 매서드");
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Exception");
		
		// 예외 매서드를 구현
		//1. try~catch		
//		try {
//			m1();
//		} catch (Exception e) {			
//			e.printStackTrace();
//		}finally {
//			System.out.println("finally");
//		}
		//2. throws 예외 설정
		m1();
		
	}
}
