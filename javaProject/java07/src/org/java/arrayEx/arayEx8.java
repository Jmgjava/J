package org.java.arrayEx;

public class arayEx8 {
	public static void main(String[] args) {
		System.out.println("������ �迭");

		int[][] arr1 = new int[5][3];

		System.out.println("�� ��: " + arr1.length);
		System.out.println("�� ��: " + arr1[0].length);
		System.out.println("�� ��Ҽ�: " + arr1[0].length * arr1.length);
		System.out.println("�� byte��: " + arr1[0].length * arr1.length * 4);

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

		System.out.println("================= ����ǥ ��� ===================");
		// ����, ����, ����, ����, ���

		int[][] score = { { 45, 26, 80 }, { 15, 71, 48 }, { 55, 51, 59 }, { 66, 67, 60 }, { 100, 92, 97 } };

		System.out.println("*************** �⸻��� ����ǥ ******************");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");

		int kor = 0; // ���� [��][0]
		int math = 0; // ���� [��][1]
		int eng = 0; // ���� [��][2]

//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);

		int num = 0; // ��ȣ

		for (int i = 0; i < score.length; i++) {
			num++;
			System.out.print(num + "\t"); // ��ȣ

			int sum = 0; // ����
			double avg = 0.0; // ���

			// ���� [i][0]
			kor += score[i][0]; // ����
			math += score[i][1]; // ����
			eng += score[i][2]; // ����

			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");

				sum += score[i][j]; // ����-> ����+����+����

			}

			// ����
			System.out.print(sum + "\t");

			// ���
			avg = (double) sum / score[i].length;
//			System.out.print(avg + "\t");
									// 	  "%.2f", ����
			String avgStr = String.format("%.2f", avg);
			System.out.print(avgStr);

			System.out.println();
		}

		System.out.println("�ι����հ�\t" + kor + "\t" + math + "\t" + eng);
		System.out
				.println("�ι����\t" + (kor / score.length) + "\t" + (math / score.length) + "\t" + (eng / score.length));

	}

}
