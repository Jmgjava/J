package org.java.oopEx;

import java.util.Scanner;

public class ClassBasicEx4Main {

	public static void main(String[] args) {
		ClassBasic4 c1 = new ClassBasic4();

		c1.method1();
		c1.method1();

		c1.method2(10, 200);
		c1.method2(3045, 55);

		// �޼ҵ��� ��ȯ���� ȣ��(call)�� �� �� ��ġ���� ��ȯ �Ѵ�.
		int m1 = c1.method3();
		System.out.println(m1);
		System.out.println(c1.method3() + 150);
		String s1 = c1.method31();
		System.out.println(c1.method31());

		int sum = c1.method4(100, 20);
		System.out.println("�հ�: " + sum);
		System.out.println(c1.method4(100, 200));

		Scanner scn = new Scanner(System.in);

		System.out.println("����1: ");
		int num1 = scn.nextInt();

		System.out.println("����2: ");
		int num2 = scn.nextInt();
		
		int sum2=c1.method4(num1, num2);
		
		System.out.println("�հ�: "+sum2);
	}

}
