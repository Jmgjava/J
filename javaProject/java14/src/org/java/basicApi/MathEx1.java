package org.java.basicApi;

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println("Math");

		double ran1 = Math.random(); // 0 <= <1 => 0.???
		System.out.println(ran1);
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int) Math.random() * 45 + " ");
//		}
		System.out.println("==============================");
		System.out.println(Math.min(100, 200)); // 최소값
		System.out.println(Math.max(100, 200)); // 최대값
		System.out.println(Math.abs(100)); // 절대값(상수)
		System.out.println(Math.ceil(99.2)); // 올림
		System.out.println(Math.floor(99.8)); // 내림
		System.out.println(Math.round(11.5)); // 반올림
		System.out.println(Math.round(11.2)); // 반올림

	}

}
