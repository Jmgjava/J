package org.java.conditionEx;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		System.out.println("Switch��");

		System.out.println("���ĺ��Է� �Ͻÿ�.");
		Scanner scn = new Scanner(System.in);

		System.out.println("�Է�: ");
		String alpha = scn.next();

		switch (alpha) {
		case "a":
		case "A":
			System.out.println("A");
			break;
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("A,B,C ���� ��");
		}// break;
		
		scn.close();
		
	}

}
