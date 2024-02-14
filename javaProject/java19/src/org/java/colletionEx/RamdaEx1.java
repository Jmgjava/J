package org.java.colletionEx;

interface In1 {
	abstract void m1();
}

interface In2 {
	abstract void m2(int num1, int num2);
}

interface In3 {
	abstract void m3(int num1);
}

//class In1Sub implements In1 {
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//	}
//}

public class RamdaEx1 {

	public static void main(String[] args) {

//		In3 in3 = (int num1) -> {
//			System.out.println(num1);
//		};
//		In3 in3 = (int num1) -> System.out.println(num1);
		In3 in3 = num1 -> System.out.println(num1);

		System.out.println("람다식");

		// 익명 클래스 -> 하나의 역할 -> 인터페이스 구현객체
		In1 in1 = new In1() {
			@Override
			public void m1() {
				System.out.println("익명 클래스 In1 오버라이딩");
			}
		};
		in1.m1();

		// 익명 클래스 -> 하나의 역할 -> 인터페이스 구현객체 In2 구현

		In2 i2 = new In2() {

			@Override
			public void m2(int num1, int num2) {
				System.out.println("익명 클래스In2 오버라이딩 " + (num1 + num2));
			}
		};
		i2.m2(1, 2);

		// 람다식
		// 1. 구현 명령문이 하나면 {}생략 가능
		In1 in11 = () -> System.out.println("람다식 구현(익명 메소드)");

		in11.m1();

		In2 in22 = (int num1, int num2) -> {
			System.out.println("람다식 구현(익명 메소드)");
			System.out.println(num1 + num2);
		};
		in22.m2(10, 20);

	}
}
