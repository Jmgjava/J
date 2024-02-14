package org.java.conditionEx;

import java.util.Scanner;

public class SwichEx1 {

	public static void main(String[] args) {
		System.out.println("switch");

		Scanner scn = new Scanner(System.in);
		System.out.println("1~5의 값을 입력: ");
		int num = scn.nextInt();
		

		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("값이 없습니다.");
		}
		
		scn.close();
	}
}
