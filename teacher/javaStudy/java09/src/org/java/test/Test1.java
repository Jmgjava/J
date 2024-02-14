package org.java.test;


import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		RegisterDto member1 = new RegisterDto();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		while (bool) {
			System.out.println("회원가입을 실행 하시겠습니까?"
					+ "\nwhile문 종료-> exit,"
					+ "\n회원가입 실행-> yes, no");
			String order = input.next();
			if (order.equals("yes")) {
				System.out.println("회원가입 실행");
				// 아이디 비번 나이 입력하고 콘솔에 출력
				// setters getters tostring이용
				// 다시 처음으로
				System.out.print("아이디: ");
				String id = input.next();
				member1.setId(id);
				
				System.out.print("비밀번호: ");
				String password = input.next();
				member1.setPassword(password);
				
				System.out.print("나이: ");
				int age = input.nextInt();
				member1.setAge(age);
				
				// 등록정보
				System.out.println();
				String info = member1.toString();
				System.out.println(info);

			} else if (order.equals("no")) {
				System.out.println("회원가입 실행x");

			} else if (order.equals("exit")) {
				System.out.println("while문 종료");
				bool = false; // true->false
			} else {
				System.out.println("입력값 오류\n 다시 입력하세요");
			}

		}input.close();
	}

}
