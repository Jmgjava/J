package org.java.arrayEx;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {		
		
		System.out.println("������ �迭");

		int[][] arr1 = new int[5][3];// 5�� 3��

		System.out.println("���: " + arr1.length);
		System.out.println("����: " + arr1[0].length);
		System.out.println("�ѿ��: " + (arr1[0].length * arr1.length));
		System.out.println("�ѹ���Ʈ��: " + (arr1[0].length * arr1.length * 4));

		int startNum = 0;
		// ��
		for (int i = 0; i < arr1.length; i++) {
			// ��
			for (int j = 0; j < arr1[i].length; j++) {
				startNum++;
				arr1[i][j] = startNum;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======== ����ǥ ��� ================");
		// ����,����, ����, ����, ���
		//
		int[][] score = {
				// ���� ���� ����
				{ 100, 55, 87 }, { 98, 44, 78 }, { 96, 87, 94 }, { 85, 78, 66 }, { 90, 86, 60 } };
		System.out.println("============== �⸻��� ����ǥ ================");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("============================================");

		int kor = 0; // ���� [��][0]
		int eng = 0; // ���� [��][1]
		int math = 0;// ���� [��][2]
		int sum2 = 0;// ��ü ������ �հ�

//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);

		int num = 0; // ��ȣ

		for (int i = 0; i < score.length; i++) {

			num++;
			System.out.print(num + "\t"); // ��ȣ

			int sum = 0;// ����
			double avg = 0.0;// ���

			// ���� [i][0]
			kor += score[i][0];// ����
			eng += score[i][1];// ����
			math += score[i][2];// ����

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];// ����-> ����+����+����
			}
			// ����
			System.out.print(sum + "\t");
			// ���
			avg = (double) sum / score[i].length;
//			avg=sum/score[i].length;
//			System.out.print(avg);			
			// "%.2f", ����
			String avgStr = String.format("%.2f", avg);
			System.out.print(avgStr);

			// ���� �հ�
			sum2 += sum;

			System.out.println();
		}

		System.out.println("============================================");
		System.out.println("�ι���\t" + kor + "\t" + eng + "\t" + math + "\t" + sum2);
		System.out.println("�ι����\t" + ((double) kor / score.length) + "\t" + ((double) eng / score.length) + "\t"
				+ ((double) math / score.length) + "\t" + ((double) sum2 / score.length));
		System.out.println("============================================");

	}
}
