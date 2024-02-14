package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		// while(true) -> break;
		while (bool) {
			System.out.println("회원가입을 실행 하시겠습니까? " + " \n while문 종료(exit), 회원가입실행(yes), 회원가입종료(no)");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("회원가입 실행 ");
				// 아이디, 비빌번호, 나이 입력하고
				// 콘솔에 id: m11, password: m11, age:11 출력 하고
				// setters,getters이용, toString 이용
				// 다시 처음으로 돌아가도록 작성해 보세요
				System.out.print("아이디 입력: ");
				String userId = input.next();
				member1.setId(userId);

				System.out.print("비빌번호 입력: ");
				String passWord = input.next();
				member1.setPassword(passWord);

				System.out.print("나이 입력: ");
				int age = input.nextInt();
				member1.setAge(age);

				System.out.println();
				// 등록정보
				String info = member1.toString();
				System.out.println(info);

			} else if (order.equals("no")) {
				System.out.println("회원가입 실행 X, 다른 작업 -> ");
			} else if (order.equals("exit")) {
				System.out.println("while종료");
				bool = false;// true -> false
				// while(true) -> break;
			} else {
				System.out.println("입력값 오류-> 다시 입력 하세요");
			}
		}

		input.close();

	}
}
