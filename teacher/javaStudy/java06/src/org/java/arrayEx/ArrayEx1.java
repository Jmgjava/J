package org.java.arrayEx;

public class ArrayEx1 {

	public static void main(String[] args) {

		System.out.println("�迭 -> []");

		// 1. �迭 ���� ��� -> new
		// int�������͸� ���� �Ҽ� �ִ� �迭 arrInt�� ���� �ߴ�.
		// int�� ������ 5���� �����Ҽ� �ִ� �迭�� ����
		// �迭�� �̸� -> arrInt -> �迭�� �ּҰ��� ����
		int[] arrInt = new int[5];

//		int i1 = 10;
//		int i2 = 20;
//		int i3 = 30;
//		int i4 = 40;
//		int i5 = 50;

		// �ʱ�ȭ, 0~4���� -> push
//		arrInt[0]=10;
//		arrInt[1]=20;
//		arrInt[2]=30;
//		arrInt[3]=40;
//		arrInt[4]=50;
//		arrInt[5]=60;//ArrayIndexOutOfBoundsException -> ����(Exception) �߻�		

		// �迭�� ��� ��ȸ -> pop
//		System.out.println("arrInt[0]="+arrInt[0]);// 0����(index) ���(element)
//		System.out.println("arrInt[1]="+arrInt[1]);// 1����(index) ���(element)
//		System.out.println("arrInt[2]="+arrInt[2]);// 2����(index) ���(element)
//		System.out.println("arrInt[3]="+arrInt[3]);// 3����(index) ���(element)
//		System.out.println("arrInt[4]="+arrInt[4]);// 4����(index) ���(element)	
		// ArrayIndexOutOfBoundsException -> ����(Exception) �߻�
//		System.out.println("arrInt[5]="+arrInt[5]);// 5����(index) ���(element)	

		// for
		for (int i = 0; i < 5; i++) {
			// i-> 0,1,2,3,4
			// 10,20,30,40,50
			// 0*10 ,1*10,2*10 ,3*10, 4*10
			// 0 ,10, 20 ,30,40
			arrInt[i] = i * 10 + 10;

			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println();

		// 2. �迭 ����
		int[] arrInt2 = new int[] { 10, 20, 30, 40, 50 };

		arrInt2[0] = 100;
		System.out.println("�迭�� �̸�: " + arrInt2);
//		System.out.println("arrInt2[0]="+arrInt2[0]);// 0����(index) ���(element)
//		System.out.println("arrInt2[1]="+arrInt2[1]);// 1����(index) ���(element)
//		System.out.println("arrInt2[2]="+arrInt2[2]);// 2����(index) ���(element)
//		System.out.println("arrInt2[3]="+arrInt2[3]);// 3����(index) ���(element)
//		System.out.println("arrInt2[4]="+arrInt2[4]);// 4����(index) ���(element)	

		for (int i = 0; i < 5; i++) {
			System.out.println("arrInt2[" + i + "]=" + arrInt2[i]);
		}

		System.out.println();

		// 3.�迭 ����
		int[] arrInt3 = { 10, 20, 30, 40, 50 };

		System.out.println(arrInt3);
		System.out.println("�迭�� �̸�: " + arrInt3);
//		System.out.println("arrInt3[0]="+arrInt3[0]);// 0����(index) ���(element)
//		System.out.println("arrInt3[1]="+arrInt3[1]);// 1����(index) ���(element)
//		System.out.println("arrInt3[2]="+arrInt3[2]);// 2����(index) ���(element)
//		System.out.println("arrInt3[3]="+arrInt3[3]);// 3����(index) ���(element)
//		System.out.println("arrInt3[4]="+arrInt3[4]);// 4����(index) ���(element)

		for (int i = 0; i < 5; i++) {
			System.out.println("arrInt3[" + i + "]=" + arrInt3[i]);
		}

	}
}
