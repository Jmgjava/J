package org.java.basicApi;

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println("Math");

		double ran1 = Math.random();// 0<= <1
		System.out.println((int) ran1);

//		for(int i=0;i<100;i++) {
//			System.out.println((int)(Math.random()*45)+" ");
//		}
		System.out.println("=======================");
		System.out.println(Math.min(100, 200));// 최솟값
		System.out.println(Math.max(100, 200));// 최댓값
		System.out.println(Math.abs(-50));// 절대값(양수)
		System.out.println(Math.ceil(11.2));// 올림 -> 페이징
		System.out.println(Math.floor(11.2));// floor 내림 -> 페이징
		System.out.println(Math.round(11.5));// 반올림 56789
		System.out.println(Math.round(11.2));// 반올림 01234

	}
}

