package org.java.loopEx;

import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {

		System.out.println("do-while");
		// �ݵ�� "�ѹ�"�� ���� �ؾߵǴ� ���
		
		
		int i = 0;

		do {
			i++;
			System.out.println(i);

		} while (i < 10);

		System.out.println();
		// ������

		System.out.println("������");
		int i2 = 2;
		do {
			System.out.println(i2 + "���Դϴ�.");
			int j = 2;
			do {
				System.out.print(" "+i2 + "X" + j + "=" + (i2 * j)+" ");
				j++;

			} while (j < 10);

			System.out.println();
			
			i2++;

		} while (i2 < 10);
		

	}

}
