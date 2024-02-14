package org.java.scannerEx;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("Scanner");
		
		// 정수 2개를 입력을 받아서 연산 실행		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int firstNum=scn.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int secondNum=scn.nextInt();
		
		int sum=firstNum+secondNum;
		
		System.out.println(firstNum+"+"+secondNum+"="+(firstNum+secondNum) );
		System.out.println(firstNum+"+"+secondNum+"="+sum );
		
		// 두수의 평균을 출력 해보세 -> 55,  50    -> 52.5
		
		double avg=(double)sum/2;  // double / int  -> double/double
		System.out.println("평균: "+avg);
		
		
	}
}
