package org.java.operatorEx;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {
		System.out.println("비교연산자");
		
		int num1=30;
		int num2=20;
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);// 같으냐?
		System.out.println(num1!=num2);// 같지 않지?
		
		// 조건 하나인 if문 조건이 true일 때만 실행
		if(num1>num2) {
			System.out.println("num1이 num2보다 큽니다.");
		}
		
		//조건이 두개
		if(num1>num2) {			
			System.out.println("num1이 num2보다 큽니다.");
		}else {			
			System.out.println("num1이 num2보다 크지 않다.");
		}
		
		// 아이디가 일치 확인		
		String userId="m1111";
		
		Scanner scn=new Scanner(System.in);
		System.out.print("아이디를 입력: ");
		// . -> 객체 접근 연산자
		String input=scn.next();
//		int rs=scn.nextInt();
		
		// 조건문(if~else) .equals()  사용해서
		// 아이디가 일치하면 -> "중복아이디입니다" 콘솔에 출력
		// 아이디가 일치 않으면 -> "아이디 사용할수 있습니다" 콘솔에 출력 
		
		if(userId.equals(input)) {
			System.out.println("중복아이디입니다");
		}else {
			System.out.println("아이디 사용할수 있습니다");
		}
		
		
		
	}
}
