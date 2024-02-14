package org.java.arrayEx;

public class arayEx8 {
	public static void main(String[] args) {
		System.out.println("다차원 배열");

		int[][] arr1 = new int[5][3];

		System.out.println("행 수: " + arr1.length);
		System.out.println("열 수: " + arr1[0].length);
		System.out.println("총 요소수: " + arr1[0].length * arr1.length);
		System.out.println("총 byte수: " + arr1[0].length * arr1.length * 4);

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

		System.out.println("================= 성적표 출력 ===================");
		// 국어, 영어, 수학, 총점, 평균

		int[][] score = { { 45, 26, 80 }, { 15, 71, 48 }, { 55, 51, 59 }, { 66, 67, 60 }, { 100, 92, 97 } };

		System.out.println("*************** 기말고사 성적표 ******************");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");

		int kor = 0; // 국어 [행][0]
		int math = 0; // 수학 [행][1]
		int eng = 0; // 영어 [행][2]

//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);

		int num = 0; // 번호

		for (int i = 0; i < score.length; i++) {
			num++;
			System.out.print(num + "\t"); // 번호

			int sum = 0; // 총점
			double avg = 0.0; // 평균

			// 국어 [i][0]
			kor += score[i][0]; // 국어
			math += score[i][1]; // 수학
			eng += score[i][2]; // 영어

			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");

				sum += score[i][j]; // 총점-> 국어+영어+수학

			}

			// 총점
			System.out.print(sum + "\t");

			// 평균
			avg = (double) sum / score[i].length;
//			System.out.print(avg + "\t");
									// 	  "%.2f", 숫자
			String avgStr = String.format("%.2f", avg);
			System.out.print(avgStr);

			System.out.println();
		}

		System.out.println("부문별합계\t" + kor + "\t" + math + "\t" + eng);
		System.out
				.println("부문평균\t" + (kor / score.length) + "\t" + (math / score.length) + "\t" + (eng / score.length));

	}

}
