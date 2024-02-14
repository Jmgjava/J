package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx3 {

	public static void main(String[] args) {
		
		System.out.println("비교 연산자");
		
		int num1=10;
		int num2=20;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2); // 같은가?
		System.out.println(num1!=num2); // 같지 않은가?
		// 조건 하나인 if문 조건이 true일 경우에만 메인 실행
		if(num1<num2) {
			System.out.println("num1이 num2보다 큽니다.");
		}
		
		//조건이 두개
		if(num1>num2) {
			System.out.println("num1이 num2보다 큽니다.");
		}else {
			System.out.println("num1이 num2보다 크지 않습니다.");			
		}
		
		// 아이디가 일치하는지 확인
		
		String userId="m1111";
		
		Scanner scn=new Scanner(System.in);
		System.out.println("아이디: ");
		// . <- ***객체 접근 연산자
		String input=scn.next();
		
		// 아이디가 일치하면 -> "중복아이디입니다" 콘솔에 출력
		// 아이디가 일치하지않으면 -> "아이디를 사용할 수 있습니다" 콘솔에 출력
		
		if(userId.equals(input)) {
			System.out.println("중복아이디입니다.");
		} else {
			System.out.println("아이디를 사용할 수 있습니다");
		}
		
		
		
	}
}
