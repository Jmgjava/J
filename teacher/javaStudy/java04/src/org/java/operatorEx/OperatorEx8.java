package org.java.operatorEx;

public class OperatorEx8 {

	public static void main(String[] args) {
		System.out.println("단항연산자");

		int i = 10;
		// 1. ++
		System.out.println(i++);// 선처리 후증가 10
		System.out.println(i);// 11
		System.out.println(++i);// 선증가 후처리
		System.out.println(i);// 12
		// 2. --
		System.out.println(i--);// 선처리 후감소 12
		System.out.println(i);// 11
		System.out.println(--i);// 선감소 후처리 10
		System.out.println(i);// 10

		System.out.println("---------------------");
		// 1~10 까지 콘솔에 출력
		System.out.println(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		System.out.println(10);

		System.out.println("---------------------");

		// 보통 for문은 0부터 시작 -> 배열의 번지가 0번지 시작
		for (int i2 = 0; i2 < 1000; i2++) {
			// 조건식이 true면 명령문을 실행 하고
			// 1증가
			// 1부터 10까지
//			int i3=(i2+1)*10;
			int i3 = i2 + 1;
			System.out.println(i3 + " ");

		}

	}
}
