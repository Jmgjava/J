package org.java.exceptionEx;

public class ExceptionEx8 {

	public static void main(String[] args) {
		System.out.println("Exception");
		
		String userId=null;
		
		try {
			System.out.println("예외를 던졌다.");			
//			Exception e=new Exception("예외 발생");
//			throw e;			
//			throw new Exception("에러메시지");
			//1회원가입.2로그인,3아이디체크,4검색,,,,
			if(userId==null) // 일치 하지 않으면, null
				throw new IllegalArgumentException("아이디가 없습니다");
//			System.out.println("정상실행");			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상 종료");
	}
}
