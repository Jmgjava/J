package org.java.exceptionEx;

public class ExceptionEx2 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int[] arrInt = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(arrInt[i]);
			}
			System.out.println("���ܰ� �߻�x");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ���� �߻��� ó��
			e.printStackTrace();
		} finally {
			System.out.println("���ܹ߻����λ������ ����");
		}
		
		System.out.println("���α׷� ��������");

	}

}
