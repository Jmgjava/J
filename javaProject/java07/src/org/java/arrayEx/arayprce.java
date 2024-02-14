package org.java.arrayEx;

public class arayprce {

	public static void main(String[] args) {

		int[][] score = { { 71, 81, 91 }, { 72, 82, 92 }, { 73, 83, 93 }, { 74, 84, 94 }, { 75, 85, 95 } };

		System.out.println("*************** 기말고사 성적표 ******************");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");

		int kor = 0;
		int math = 0;
		int eng = 0;

		int sum = 0;
		double avg = 0;

		int num = 0;

		for (int i = 0; i < score.length; i++) {
			num++;
			System.out.print(num + "\t");

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];

			}
			System.out.print(sum + "\t");


			avg = (double)(sum / score[i].length);
			System.out.print(avg + "\t");

			System.out.println();
		}
	}
}
