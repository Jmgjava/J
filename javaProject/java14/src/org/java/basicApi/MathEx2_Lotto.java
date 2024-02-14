package org.java.basicApi;

public class MathEx2_Lotto {

	public static void main(String[] args) {
		System.out.println("Math -> 로또");

		// 1 ~ 45 -> 배열 0~44번지 지정
		int[] lotto = new int[45];
		int size = lotto.length;
		// 로또 배열에 1~45까지

		for (int i = 0; i < size; i++) {
			lotto[i] = i + 1;
			System.out.print(lotto[i] + " ");
		}

		System.out.println();
		int temp = 0;

		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}

		System.out.println("로또 추첨번호");

		for (int j = 0; j < 5; j++) {
			System.out.println(lotto[j]);
		}

	}

}
