package org.java.arayEx;

public class arayEx4 {

	public static void main(String[] args) {
		System.out.println("다차원 배열");

		int[][] arrInt1 = new int[2][5];

		int row_count = arrInt1.length;
		int col_count = arrInt1[0].length;
		int sum_count = row_count * col_count;

		System.out.println(row_count);// 행 개수
		System.out.println(col_count);// 열 개수
		System.out.println(sum_count);// 전체 요소 개수

		System.out.println();

		int startNum = 0;
		int sumNum = 0;
		double avg = 0.0;

		for (int i = 0; i < row_count; i++) {

//			System.out.println(i + "행입니다");
			for (int j = 0; j < col_count; j++) {

				startNum++;
				// 열
				arrInt1[i][j] = startNum;

				System.out.print(arrInt1[i][j] + " ");

				sumNum = sumNum + arrInt1[i][j];// 누적 합계
			}
			System.out.println();

		}
		// 평균
		avg = (double) sumNum / sum_count;
		System.out.println("다차원 배열의 합계: " + sumNum);
		System.out.println("다차원 배열의 평균: " + avg

		);

//		// 0행
//		arrInt1[0][0] = 1;
//		arrInt1[0][1] = 2;
//		arrInt1[0][2] = 3;
//		arrInt1[0][3] = 4;
//		arrInt1[0][4] = 5;
//		// 1행
//		arrInt1[1][0] = 6;
//		arrInt1[1][1] = 7;
//		arrInt1[1][2] = 8;
//		arrInt1[1][3] = 9;
//		arrInt1[1][4] = 10;
//
//		System.out.print(arrInt1[0][0]);
//		System.out.print(arrInt1[0][1]);
//		System.out.print(arrInt1[0][2]);
//		System.out.print(arrInt1[0][3]);
//		System.out.print(arrInt1[0][4]);
//		System.out.println();
//		System.out.println("============");
//		System.out.print(arrInt1[1][0]);
//		System.out.print(arrInt1[1][1]);
//		System.out.print(arrInt1[1][2]);
//		System.out.print(arrInt1[1][3]);
//		System.out.print(arrInt1[1][4]);

	}
}
