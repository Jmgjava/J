package org.java.conditionEx;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		System.out.println("알파벳입력 하시오.");
		Scanner scn=new Scanner(System.in);
		
		System.out.print("입력: ");
		String alpha= scn.next();
		
		switch(alpha) {
		case "a":
			//break;
		case "A":
			System.out.println("A");
			break;// switch문 종료
		//if("a" || "A")
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("A,B,C이외의 값 입력");
		}//break;
		
		//. if(90>=) -> A
		//switch(값){
		//    case 99 , 98 , 97 ,96,95,94,93 ,92 ,91,90:
		
		//	}
		
		
		
		
	}
}
