package org.java.arayEx;

public class arayEx4 {

	public static void main(String[] args) {
		System.out.println("������ �迭");

		int[][] arrInt1 = new int[2][5];

		int row_count = arrInt1.length;
		int col_count = arrInt1[0].length;
		int sum_count = row_count * col_count;

		System.out.println(row_count);// �� ����
		System.out.println(col_count);// �� ����
		System.out.println(sum_count);// ��ü ��� ����

		System.out.println();

		int startNum = 0;
		int sumNum = 0;
		double avg = 0.0;

		for (int i = 0; i < row_count; i++) {

//			System.out.println(i + "���Դϴ�");
			for (int j = 0; j < col_count; j++) {

				startNum++;
				// ��
				arrInt1[i][j] = startNum;

				System.out.print(arrInt1[i][j] + " ");

				sumNum = sumNum + arrInt1[i][j];// ���� �հ�
			}
			System.out.println();

		}
		// ���
		avg = (double) sumNum / sum_count;
		System.out.println("������ �迭�� �հ�: " + sumNum);
		System.out.println("������ �迭�� ���: " + avg

		);

//		// 0��
//		arrInt1[0][0] = 1;
//		arrInt1[0][1] = 2;
//		arrInt1[0][2] = 3;
//		arrInt1[0][3] = 4;
//		arrInt1[0][4] = 5;
//		// 1��
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