package org.java.arayEx;

public class lotto {
	public static void main(String[] args) {

		int lotto[] = new int[45];

		int miss = 0;

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);

			int num = (int) (Math.random() * lotto.length);

			miss = lotto[num];
			lotto[num] = lotto[0];
			lotto[0] = miss;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}

	}

}
