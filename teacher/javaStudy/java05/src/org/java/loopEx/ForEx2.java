package org.java.loopEx;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.println("for문");
		// 구구단
		System.out.println("2단~9단까지");
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단입니다");

			// i-> 2 -> 9번
			for (int j = 1; j <= 9; j++) {
				// 2*1,2*2,,, 2*9
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			// i++ -> 3456789
		}
		System.out.println();

		// 9단부터 2단까지 콘솔에 출력
		System.out.println("9단~2단까지");
		for (int i = 9; i >= 2; i--) {
			// 9 , 8 765432
			System.out.println(i + "단입니다");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}
}
