package org.java.oopEx;

import java.util.Scanner;

public class ClassBasicEx4Main {

	public static void main(String[] args) {
		ClassBasic4 c1 = new ClassBasic4();

		c1.method1();
		c1.method1();

		c1.method2(10, 200);
		c1.method2(3045, 55);

		// 메소드의 반환값을 호출(call)한 후 그 위치에서 반환 한다.
		int m1 = c1.method3();
		System.out.println(m1);
		System.out.println(c1.method3() + 150);
		String s1 = c1.method31();
		System.out.println(c1.method31());

		int sum = c1.method4(100, 20);
		System.out.println("합계: " + sum);
		System.out.println(c1.method4(100, 200));

		Scanner scn = new Scanner(System.in);

		System.out.println("숫자1: ");
		int num1 = scn.nextInt();

		System.out.println("숫자2: ");
		int num2 = scn.nextInt();
		
		int sum2=c1.method4(num1, num2);
		
		System.out.println("합계: "+sum2);
	}

}
