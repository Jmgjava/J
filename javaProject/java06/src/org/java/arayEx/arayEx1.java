package org.java.arayEx;

public class arayEx1 {

	public static void main(String[] args) {

		System.out.println("�迭 -> []");
		// int�� �����͸� ������ �� �ִ� �迭 arrInt�� �����ߴ�.
		// int�� ������ 5���� ������ �� �ִ� �迭�� ����
		// �迭�� �̸� �� arrInt �� �迭�� �ּҰ��� ����
		int[] arrInt = new int[5];

		// �ʱ�ȭ, 0~4���� -> push
//		arrInt[0] = 10;
//		arrInt[1] = 20;
//		arrInt[2] = 30;
//		arrInt[3] = 40;
//		arrInt[4] = 50;
//		arrInt[5]=60;

		// for�� ����Ͽ� �迭
		for (int i = 0; i < 5; i++) {
			// i -> 0,1,2,3,4
			// 10,20,30,40,50,
			arrInt[i] = i * 10 + 10;
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		// �迭�� ��� ��ȸ -> pop
//		System.out.println("arrInt[0]=" + arrInt[0]);// 0����(index) ���(element)
//		System.out.println("arrInt[1]=" + arrInt[1]);// 1����(index) ���(element)
//		System.out.println("arrInt[2]=" + arrInt[2]);// 2����(index) ���(element)
//		System.out.println("arrInt[3]=" + arrInt[3]);// 3����(index) ���(element)
//		System.out.println("arrInt[4]=" + arrInt[4]);// 4����(index) ���(element)
		// ArrayIndexOutOfBoundsException -> ����(Exception) �߻�
//		System.out.println("arrInt[5]="+arrInt[5]);// 5����(index) ���(element)

		// 2. �迭 ����

		int[] arrInt2 = new int[] { 100, 200, 300, 400, 500 };

		arrInt2[0] = 1;
		System.out.println("�迭�� �̸�: " + arrInt2);
//		System.out.println("arrInt[0]=" + arrInt2[0]);// 0����(index) ���(element)
//		System.out.println("arrInt[1]=" + arrInt2[1]);// 1����(index) ���(element)
//		System.out.println("arrInt[2]=" + arrInt2[2]);// 2����(index) ���(element)
//		System.out.println("arrInt[3]=" + arrInt2[3]);// 3����(index) ���(element)
//		System.out.println("arrInt[4]=" + arrInt2[4]);// 4����(index) ���(element)
		for (int a = 0; a < 5; a++) {
			System.out.println("arrInt2["+a+"]="+arrInt2[a]);
		}

		// 3. �迭 ����
		int[] arrInt3 = { 11, 22, 33, 44, 55 };

		System.out.println(arrInt3);
		System.out.println("�迭�� �̸�: " + arrInt3);
//		System.out.println("arrInt[0]=" + arrInt3[0]);// 0����(index) ���(element)
//		System.out.println("arrInt[1]=" + arrInt3[1]);// 1����(index) ���(element)
//		System.out.println("arrInt[2]=" + arrInt3[2]);// 2����(index) ���(element)
//		System.out.println("arrInt[3]=" + arrInt3[3]);// 3����(index) ���(element)
//		System.out.println("arrInt[4]=" + arrInt3[4]);// 4����(index) ���(element)
		
		for (int b = 0; b < 5; b++) {
			System.out.println("arrInt3["+b+"]="+arrInt3[b]);
		}
	}
}
