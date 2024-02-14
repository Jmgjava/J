package org.java.arrayEx;

public class arayEx5 {
	public static void main(String[] args) {

		System.out.println("배열");

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1~45 초기화
//			System.out.print(lotto[i]+" ");
		}

		int temp = 0;
		for (int i = 0; i < 1000; i++) {
			int idx = (int) (Math.random() * lotto.length);

			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		int j = 0;
		for (int i : lotto) {
			j++;
//			if (j % 5 == 0) {
//
//				System.out.println(i + " ");
//			} else {
//
//				System.out.print(i + " ");
//			}
			if (j % 5 == 0) {

				System.out.println(i + " ");
				continue;
			}
			System.out.print(i + " ");
		}//continue

		System.out.println();
		System.out.println("로또 당첨 번호");

		for (

				int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
