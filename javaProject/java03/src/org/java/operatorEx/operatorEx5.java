package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx5 {

	public static void main(String[] args) {
		
		System.out.println("논리 연산자");
		
		System.out.println("&&"); // 모든 조건이 true일때만 true
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		
		System.out.println("||"); // 하나 이상의 조건이 true면 true
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("^"); // 서로 다르면 true
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println("!"); // 반대 toggle-> 스위치
		System.out.println(!true);
		System.out.println(!false);
		
		//아이디와 비밀번호가 일치하면 로그인 성공 일치 하지 않으면 로그인 실패
		
		String Id="Id2222";
		String Pw="Pw2222";
		
		System.out.println(Id.equals("Id2222"));
		System.out.println(Pw.equals("Pw2222"));
		
		System.out.println(Id.equals("Id2222") && Pw.equals("Pw2222"));
		
		Scanner scn=new Scanner(System.in);
		System.out.println("아이디: ");
		String userId=scn.next();
		
		Scanner key=new Scanner(System.in);
		System.out.println("비밀번호: ");
		String userPw=key.next();
		
		if((Id.equals(userId))&&(Pw.equals(userPw))) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		scn.close();
		key.close();
		
		//아이디와 비밀번호를 입력받아서
		// 입력받은 아이디가 dbId와 입력받은 비밀번호 dbPw가 동시에 일치 하면
		// 콘솔에 "로그인 성공" 실패하 하면 "로그인 실패"가 출력되도록 프로그래밍 하시오.
		// Scanner, equals, &&, if~else문을 활용하여 작성하시오.
		
	}
}
