package org.java.arrayEx;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {		
		
		System.out.println("다차원 배열");

		int[][] arr1 = new int[5][3];// 5행 3열

		System.out.println("행수: " + arr1.length);
		System.out.println("열수: " + arr1[0].length);
		System.out.println("총요수: " + (arr1[0].length * arr1.length));
		System.out.println("총바이트수: " + (arr1[0].length * arr1.length * 4));

		int startNum = 0;
		// 행
		for (int i = 0; i < arr1.length; i++) {
			// 열
			for (int j = 0; j < arr1[i].length; j++) {
				startNum++;
				arr1[i][j] = startNum;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======== 성적표 출력 ================");
		// 국어,영어, 수학, 총점, 평균
		//
		int[][] score = {
				// 국어 영어 수학
				{ 100, 55, 87 }, { 98, 44, 78 }, { 96, 87, 94 }, { 85, 78, 66 }, { 90, 86, 60 } };
		System.out.println("============== 기말고사 성적표 ================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");

		int kor = 0; // 국어 [행][0]
		int eng = 0; // 영어 [행][1]
		int math = 0;// 수학 [행][2]
		int sum2 = 0;// 전체 총점의 합계

//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);

		int num = 0; // 번호

		for (int i = 0; i < score.length; i++) {

			num++;
			System.out.print(num + "\t"); // 번호

			int sum = 0;// 총점
			double avg = 0.0;// 평균

			// 국어 [i][0]
			kor += score[i][0];// 국어
			eng += score[i][1];// 영어
			math += score[i][2];// 수학

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];// 총점-> 국어+영어+수학
			}
			// 총점
			System.out.print(sum + "\t");
			// 평균
			avg = (double) sum / score[i].length;
//			avg=sum/score[i].length;
//			System.out.print(avg);			
			// "%.2f", 숫자
			String avgStr = String.format("%.2f", avg);
			System.out.print(avgStr);

			// 누적 합계
			sum2 += sum;

			System.out.println();
		}

		System.out.println("============================================");
		System.out.println("부문계\t" + kor + "\t" + eng + "\t" + math + "\t" + sum2);
		System.out.println("부문평균\t" + ((double) kor / score.length) + "\t" + ((double) eng / score.length) + "\t"
				+ ((double) math / score.length) + "\t" + ((double) sum2 / score.length));
		System.out.println("============================================");

	}
}
