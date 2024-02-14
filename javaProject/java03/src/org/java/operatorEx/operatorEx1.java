package org.java.operatorEx;

import java.util.Scanner;

// java.lang -> 자바의 기본 패키지 -> 자동으로 import
//import java.lang.*;

public class operatorEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("산술 연산자");
		
		int num1=10;
		int num2=3;
		System.out.println(num1+"+"+num2+"="+(num1+num2)); // 덧셈
		System.out.println(num1+"-"+num2+"="+(num1-num2)); // 뺄셈
		System.out.println(num1+"*"+num2+"="+(num1*num2)); // 곱하기
		System.out.println(num1+"/"+num2+"="+((double)num1/num2)); // 나누기
		System.out.println(num1+"%"+num2+"="+(num1%num2)); // 나머지
		
		System.out.println("두 정수를 입력 받아서 +-*/% 연산을 수행하시오.");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		int inputNum1=scn.nextInt();
		
		System.out.println("두번째 정수: ");
		int inputNum2=scn.nextInt();
		
		System.out.println(inputNum1+"+"+inputNum2+"="+(inputNum1+inputNum2));
		System.out.println(inputNum1+"-"+inputNum2+"="+(inputNum1-inputNum2));
		System.out.println(inputNum1+"*"+inputNum2+"="+(inputNum1*inputNum2));
		System.out.println(inputNum1+"/"+inputNum2+"="+((double)inputNum1/inputNum2));
		System.out.println(inputNum1+"%"+inputNum2+"="+(inputNum1%inputNum2));
		
		scn.close();
		
		
	}
}
