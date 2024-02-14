package org.java.operatorEx;

import java.util.Scanner;

// java.lang -> 자바의 기본 패키지->자동으로 import
// import java.lang.*;// 생략

public class OperatorEx1 {

	public static void main(String[] args) {
	
		System.out.println("산술연산자");
		
		int num1=10;
		int num2=3;
		// 10+20=30
		// 문자열+숫자-> "문자열숫자"
		System.out.println(num1+"+"+num2+"="+(num1+num2));// 더하기
		System.out.println(num1+"-"+num2+"="+(num1-num2));// 빼기
		System.out.println(num1+"*"+num2+"="+(num1*num2));// 곱하기
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));// 나누기
		System.out.println(num1+"%"+num2+"="+(num1%num2));// 나머지
		
		System.out.println("두 정수를 입력을 받아서 +-*/% 연산을 수행 하시오.");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("첫번째정수: ");
		int inputNum1=scn.nextInt();

		System.out.print("두번째정수: ");
		int inputNum2=scn.nextInt();
		
		System.out.println(inputNum1+"+"+inputNum2+"="+(inputNum1+inputNum2));// 더하기
		System.out.println(inputNum1+"-"+inputNum2+"="+(inputNum1-inputNum2));// 빼기
		System.out.println(inputNum1+"*"+inputNum2+"="+(inputNum1*inputNum2));// 곱하기
		System.out.println(inputNum1+"/"+inputNum2+"="+((double)inputNum1/inputNum2));// 나누기
		System.out.println(inputNum1+"%"+inputNum2+"="+(inputNum1%inputNum2));// 나머지
		
		
		scn.close();
		
		
		
	}
}
