package org.java.ioEx;

import java.util.Scanner;

public class IoEx1 {

	public static void main(String[] args) {
		System.out.println("IO");
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("�Է�: ");
		
		String result=input.next();
		
		System.out.println(result);
		
		input.close();
	}
}
