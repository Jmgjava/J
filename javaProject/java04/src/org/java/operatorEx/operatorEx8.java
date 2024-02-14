package org.java.operatorEx;

public class operatorEx8 {

	public static void main(String[] args) {
		System.out.println("단항 연산자");

		int i = 10;

		System.out.println(i++); // 선 처리 후 증가 10
		System.out.println(i);// 11
		System.out.println(++i); // 선 처리 후 증가
		System.out.println(i);// 12

		System.out.println(i--); // 선 처리 후 증가 12
		System.out.println(i);// 11
		System.out.println(--i); // 선 처리 후 증가 10
		System.out.println(i);// 10

		System.out.println("-----------------------------");

		// 1부터 10까지 콘솔에 출력

		// 보통 for문은 0부터 시작 -> 배열의 번지가 0번지부터 시작
		for (int ii = 0; ii < 10; ii++) {
			// 조건식이 true면 명령문 실행하고
			// 1 증가 (ii++)
			// 1부터 10까지

			int iii = ii + 1;
			System.out.println(iii + " ");
		}

	}

}
