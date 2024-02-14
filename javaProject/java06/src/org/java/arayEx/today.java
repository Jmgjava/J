package org.java.arayEx;

public class today {

	public static void main(String[] args) {

		int work[] = new int[24];

		int m = 0;

		for (int i = 0; i < work.length; i++) {
			work[i] = i + 1;
//			System.out.println(work[i]);

			int num = (int) (Math.random() * work.length);

			m = work[num];
			work[num] = work[0];
			work[0] = m;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(work[i]);
		}
	}
}
