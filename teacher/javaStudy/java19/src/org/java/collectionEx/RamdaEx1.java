package org.java.collectionEx;

interface In1 {
	abstract void m1();
}

//구현객체
//class In2Sub implements In1{
//	@Override
//	public void m1() {}	
//}
interface In2 {
	abstract void m2(int num1, int num2);
}

interface In3 {
	abstract void m3(int num1);
}

public class RamdaEx1 {
	public static void main(String[] args) {

//		In3 in3=(int num1)->{
//			System.out.println(num1);
//		};
//		In3 in3=(int num1)->System.out.println(num1);
		In3 in3 = num1 -> System.out.println(num1);

		in3.m3(1000);

		System.out.println("람다식");
		// 익명 클래스 -> 하나의 역할 -> 인터페이스 구현객체
		In1 in1 = new In1() {
			@Override
			public void m1() {
				System.out.println("익명클래스 오버라이딩");
			}
		};
		in1.m1();
		// //익명 클래스 -> interface In2매서드 구현
		In2 in2 = new In2() {
			@Override
			public void m2(int num1, int num2) {
				System.out.println("익명클래스 m2 : " + (num1 + num2));
			}
		};
		in2.m2(100, 200);

		// 람다식
		// 1. 구현 명령문이 하나면 {}생략 가능
		In1 in11 = () -> System.out.println("람다식 구현(익명 매서드)");
		in11.m1();

		In2 in22 = (int num1, int num2) -> {
			System.out.println("람다식 구현(익명 매서드)");
			System.out.println(num1 + num2);
		};
		in22.m2(100, 200);

	}
}
