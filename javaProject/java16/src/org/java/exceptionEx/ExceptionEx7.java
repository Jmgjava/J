package org.java.exceptionEx;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println("Exception throw");

		try {
			System.out.println("예외를 던졌다.");

			String userId = null;

//			Exception e1= new Exception("예외발생");
//			throw e;
//			throw new Exception("에러 메세지");

			// 1.회원가입 2.로그인 3.아이디체크 4.검색
			if (userId == null) // 일치하지 않으면, null
				throw new IllegalArgumentException("아이디가 없습니다");
//			System.out.println("정상 실행");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

		System.out.println("정상 종료");
	}

}
