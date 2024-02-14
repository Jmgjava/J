package org.java.arayEx;

public class arayEx3 {

	public static void main(String[] args) {
		System.out.println("배열");
		// for-each문 -> 선택된 객체(배열)형 리스트의 모든 요소를 조회
		// 반복문 -> 객체형 반복문

		int[] arrInt = new int[5];
		for (int i = 0; i < arrInt.length; i++) {
//			if(i==5) break;
//			System.out.println(i);
			arrInt[i] = i;// 0~4
			if (arrInt[i] % 2 == 0)
				System.out.println(arrInt[i]);
		}
		System.out.println("==============================================");
		// for-each -> 객체형 반복문
		// 전체 배열의 요소를 조회
		for (int el : arrInt) {
			// 짝수는 2의 배수이다
			// if(el%2==0) System.out.println(el);
			// 짝수는 자연수 중에서 2로 나누어 떨어지는 수
			if (el % 2 == 0) {
				if (el != 0)
					System.out.println(el);
			}
		}

	}

}
