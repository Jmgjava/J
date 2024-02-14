package org.java.loopEx;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		System.out.println("for문");
		// 구구단 시작단,끝단을 입력받아서(정수) 구구단을 출력
		// 예) 시작단 4, 끝단 7 -> 4단,5단,6단, 7단이 콘솔에 출력
		// 2*1=1,,,,,,,,,,7*9=63
		// 단. 조건이 시작단이 끝단보다 작아야 된다.
		// 만약에 시작단이 끝단보다 작지 않으면 "시작단은 끝단보다 작아야합니다" 출력
		// if~else ,for 사용 
		Scanner scn=new Scanner(System.in);
		
		System.out.print("시작단 입력: ");
		int startNum=scn.nextInt();// 비료연산자 -> int형  

		System.out.print("끝단 입력: ");
		int endNum=scn.nextInt();// 비료연산자 -> int형
		
		if(startNum<endNum) {
			System.out.println("시작단:"+startNum+", 끝단: "+endNum);			
			
			for(int i=startNum;i<=endNum;i++) {
				
				System.out.println(i+"단입니다");
				
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
			
		}else {
			System.out.println("시작단은 끝단보다 작아야합니다");
		}		
		
		
	}
}
