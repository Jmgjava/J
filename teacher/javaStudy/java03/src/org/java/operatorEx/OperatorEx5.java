package org.java.operatorEx;

public class OperatorEx5 {

	public static void main(String[] args) {

		System.out.println("논리연산자");

		System.out.println("&&"); // 조건이 모두 true일때만 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("||"); // 조건이 하나이상 true 이상 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("^"); // 서로 다르면 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("!"); // 반대 toggle -> 스위치
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("=======================");

		// 아이디와 비빌번호가 일치 하면 로그인 성공 일치 하지 않으면 로그인 실패

		String userId = "m1111";
		String userPw = "1111";

		System.out.println(userId.equals("m1111"));// true
		System.out.println(userPw.equals("1111"));// true

		System.out.println(userId.equals("m21111") && userPw.equals("1111"));

		if (userId.equals("m1111") && userPw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println("=======Quiz======");

		// 아이디 와 비빌번호를 입력 받아서
		// 입력받은 아이디가 dbId와 입력받은 비빌번호가 dbPw가 동시에 일치 하면
		// 콘솔에 "로그인 성공" 실패 하면 "로그인 실패"가 출력 되도록 프로그래밍 하시오.
		// Scanner, equals, &&, if~else문 를 활용 하여 작성 하시오
		// 입력 받은 값을 변수명은 임의로 작성
		String dbId = "green";
		String dbPw = "1111";

	}
}
