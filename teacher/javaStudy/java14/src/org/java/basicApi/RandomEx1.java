package org.java.basicApi;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {

		System.out.println("Random");
		Random rd = new Random();

		// 정수
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100));// 0~99 정수
		System.out.println(rd.nextInt(45)); // 0~44
		// 실수
		System.out.println(rd.nextDouble());// 0 실수 <1

	}
}
