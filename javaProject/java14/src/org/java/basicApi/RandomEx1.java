package org.java.basicApi;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {

		System.out.println("Random");
		Random rd1 = new Random();

		// ����
		System.out.println(rd1.nextInt());
		System.out.println(rd1.nextInt(45)); // 0~44
		System.out.println(rd1.nextInt(100));// 0~ 99 ����
		// ���
		System.out.println(rd1.nextDouble()); // 0 �Ǽ� < 1
	}

}
