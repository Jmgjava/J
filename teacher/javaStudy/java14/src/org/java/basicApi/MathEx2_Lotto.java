package org.java.basicApi;

public class MathEx2_Lotto {

	public static void main(String[] args) {
		System.out.println("Math -> 로또");

		// 1~45 -> 배열 0~44번지 저장
		int[] lotto = new int[45];
		int size = lotto.length;
		// lotto배열에 1~45까지
		for (int i = 0; i < size; i++) {
			lotto[i] = i + 1;
			System.out.print(lotto[i] + " ");
		}
		int temp = 0;

		for (int i = 0; i < 10000; i++) {
			int idx = (int) (Math.random() * 45);
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		System.out.println(lotto);
		for (int i = 0; i < size; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("추천 번호");
		// lotto배열 0번지 5번
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
