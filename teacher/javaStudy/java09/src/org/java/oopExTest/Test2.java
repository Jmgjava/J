package org.java.oopExTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 아이디, 비빌번호, 나이 입력하고
		// 콘솔에 id: m11, password: m11, age:11 출력 하고
		// setters,getters이용
		// 다시 처음으로 돌아가도록 작성해 보세요

		// 회원가입 후에 로그인 실행
		// 1. 로그인 실행
		// 아이디와 비빌번호가 동시에 일치하면 -> "로그인 성공" -> 로그인에 대한 while문 종료
		// 아이디와 비빌번호가 동시에 일치않으면 -> "로그인 실패"->
		// 2. 로그인 없이 종료 -> 전체 while문 종료
		// 3. 이외에는 다시 로그인 -> 로그인에 대한 while문

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		// while(true) -> break;
		while (bool) {

			System.out.println("회원가입을 실행 하시겠습니까? " + "\n while문 종료(exit), 회원가입실행(yes), 회원가입종료(no)");
			String order = input.next();

			if (order.equals("yes")) {

				System.out.println("회원가입 실행 ");
				System.out.print("아이디 입력: ");
				String userId = input.next();
				member1.setId(userId);

				System.out.print("비빌번호 입력: ");
				String password = input.next();
				member1.setPassword(password);

				System.out.print("나이 입력: ");
				int age = input.nextInt();
				member1.setAge(age);

				System.out.println();

				int i = 0;

				// 로그인
				while (true) {
					System.out.println("로그인 실행 하겠습니까? yes(실행),exit(전체while종료)");
					String q = input.next();

					if (q.equals("yes")) {
						System.out.println("로그인 실행");

						System.out.print("아이디: ");
						String userId2 = input.next();

						System.out.print("비밀번호: ");
						String userPw2 = input.next();

//						if(i>=5) {
//							System.out.println("로그인 에러 5회 초과로 종료 하겠습니다.");
//							bool=false;
//							break;
//							
//						}

						if (userId.equals(userId2) && password.equals(userPw2)) {
							System.out.println("로그인 성공, 즐거운 쇼핑 되세요~");
							// bool=false; //전체 while문 종료
							break;// 로그인에 대한 while문
						} else {
							System.out.println("로그인 실패, 다시로그인 하세요");
							i++;
						}

					} else if (q.equals("exit")) {
						System.out.println("전체 while문 종료");
						bool = false;
						break;
					} else {
						System.out.println("입력 오류 -> 다시입력");
					}
				}

			} else if (order.equals("no")) {
				System.out.println("회원가입 실행 X, 다른 작업 -> ");
			} else if (order.equals("exit")) {
				System.out.println("while종료");
				bool = false;// true -> false
				// while(true) -> break;
			} else {
				System.out.println("입력값 오류-> 다시 입력 하세요");
			}
			System.out.println("전체 while문 다시 시작!!");
		}

		input.close();

	}
}
