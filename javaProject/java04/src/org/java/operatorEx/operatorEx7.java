package org.java.operatorEx;

public class operatorEx7 {

	public static void main(String[] args) {
		System.out.println("삼항연산자");

		int num1 = 10;

		System.out.println(num1 > 10 ? 1 : 0);

		// ↑ ↓ 같은 의미 ( == )
		
		if (num1 > 10) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
