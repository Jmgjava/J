package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 예 ) Scanner 이용해서 회원가입하고 회원가입 정보를 콘솔출력
		// 아이디, 비밀번호, 나이를 입력하고 -> 콘솔에 id: m11, passward: m11, age:11
		// exit 입력되면 while문을 종료
		// while(true), 조건문(if)

		// 1) 회원가입 하겠습니까?
		// -> yes -> 실행 -> 회원가입 -> 회원출력
		// -> no -> 실행되지않고 -> 회원가입 종료
		// ** exit -> while문을 종료

		// 2) close();

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

				boolean p = true;

				System.out.println("회원가입이 끝났습니다. 프로그램을 종료하시겠습니까?\n yes or no");
				String out = input.next();
				while (p) {
					if (out.equals("no")) {
						System.out.println("다시 돌아갑니다.");
						p = false;
						break;

					} else if (out.equals("yes")) {
						System.out.println("프로그램 종료");
						bool = false;
						break;
					}
				}

			} else if (order.equals("no")) {
				System.out.println("회원가입 실행 X");

			} else if (order.equals("exit")) {
				System.out.println("while문 종료");
				bool = false; // true -> false

			} else {
				System.out.println("입력값 오류, 다시 입력하세요");
			}
			
			input.close();

		}

	}

}
