package org.java.test;


import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		// 1. 로그인 실행
		// 아이디와 비밀번호가 동시에 일치하면 로그인성공->로그인에 대한 while문
		// 동시에 일치하지 않으면 로그인 실패
		// 2. 로그인 없이 종료->while문 종료
		// 3. 이외에는 다시 로그인->로그인에 대한 while문

		RegisterDto member2 = new RegisterDto();

		Scanner input = new Scanner(System.in);
		boolean bool = true;
		while (bool) {
			System.out.println("회원가입을 실행하시겠습니까?\n회원가입 실행은->yes,no 종료->exit");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("회원가입 실행");
				System.out.println("아이디 입력: ");
				String id = input.next();
				member2.setId(id);

				System.out.println("비밀번호 입력: ");
				String password = input.next();
				member2.setPassword(password);

				System.out.println("나이 입력: ");
				int age = input.nextInt();
				member2.setAge(age);

				while (true) {
					System.out.println("로그인 실행하시겠습니까 실행-> yse 실행x-> no 종료->exit");
					String join = input.next();

					if (join.equals("yes")) {
						System.out.println("로그인실행");

						System.out.println("아이디 입력: ");
						String userid = input.next();

						System.out.println("비밀번호 입력: ");
						String userpw = input.next();

						if (userid.equals(id) && password.equals(userpw)) {
							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("로그인 실패 다시 로그인하세요");
						}

					} else if (join.equals("no")) {
						System.out.println("로그인 종료");
						break;
				

					} else if (join.equals("exit")) {
						System.out.println("while문 종료");
						break;

					}

				}

			} else if (order.equals("no")) {
				System.out.println("회원가입 실행x");
			} else if (order.equals("exit")) {
				System.out.println("회원가입 while문 종료");
				bool = false;
			} else {
				System.out.println("입력값 오류 다시 실행 해 주세요");
			}

		}

	}

}
