package org.java.ioEx;

import java.util.Scanner;

public class ioEx1 {

	public static void main(String[] args) {
		System.out.println("IO");

		Scanner input = new Scanner(System.in);

		System.out.println("�Է�: ");

		String results= input.next();
		
		System.out.println(results);
		
		input.close();
	}

}
