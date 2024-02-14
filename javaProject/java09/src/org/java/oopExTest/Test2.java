package org.java.oopExTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 아이디, 비밀번호, 나이 입력하고
		// 콘솔에 id: m11, password: 111, age: 11 출력하고
		// setter, getter 이용
		// 다시 처음으로 돌아가도록 작성

		// 회원가입 후에 로그인 실행
		// 1. 로그인 실행
		// 아이디와 비밀번호가 동시에 일치하면 -> "로그인 성공" -> 로그인에 대한 while문
		// 하나라도 일치하지 않으면 -> "로그인 실패" -> 로그인에 대한 while문
		// 2. 로그인 없이 종료 -> 전체 while문 종료
		// 3. 이외에는 다시 로그인 -> 로그인에 대한 while문

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("회원가입을 실행 하시겠습니까?" + "\n while문 종료는 exit, 회원가입 실행은 yes, 회원가입 종료는 no");
			// 아이디, 비밀번호, 나이 입력하고
			// 콘솔에 id : m11 , password : 11, age : 11 출력 하고
			// 다시 처음으로 돌아가도록 작성

			String order = input.next();

			if (order.equals("yes")) {
				System.out.println("회원가입 실행");

				System.out.println("id: ");
				String inputId = input.next();

				System.out.println("passward: ");
				String inputPw = input.next();

				System.out.println("age: ");
				int inputage = input.nextInt();

				RegisterDto r1 = new RegisterDto(inputId, inputPw, inputage);

				String info = r1.toString();

				System.out.println(info);

				while (true) {
					System.out.println("로그인 하시겠습니까? yes or exit");

					String an = input.next();

					if (an.equals("yes")) {
						System.out.println("로그인하세요.");

						System.out.println("아이디: ");
						String userId = input.next();

						System.out.println("비밀번호: ");
						String userPw = input.next();

						if (userId.equals(inputId) && userPw.equals(inputPw)) {
							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("로그인 실패. 다시 시도하세요");
						}
					} else if (an.equals("exit")) {
						System.out.println("while문 종료");
						bool = false;
						break;

					} else if (order.equals("no")) {
						System.out.println("회원가입 실행 X");

					} else if (order.equals("exit")) {
						System.out.println("while문 종료");
						bool = false; // true -> false

					} else {
						System.out.println("입력값 오류, 다시 입력하세요");
					}
					System.out.println("전체 while문 다시 시작");
				}

				input.close();

			}

		}

	}
}
