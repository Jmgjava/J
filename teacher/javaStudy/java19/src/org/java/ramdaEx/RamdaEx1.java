package org.java.ramdaEx;

interface In1 {
	void m1();
}

class In1Sub implements In1 {
	@Override
	public void m1() {
		System.out.println("m1오버라이딩");
	}
}

public class RamdaEx1 {

	public static void main(String[] args) {
		// 구현객체 이용해서 m1매서드 구현
		In1Sub i1 = new In1Sub();
		i1.m1();

		// 무명클래스 인터페이스 구현
		In1 i2 = new In1() {
			@Override
			public void m1() {
				System.out.println("익명클래스 이용(m1오버라이딩)");
				
			}
		};
		i2.m1();

		// 람다식
		// new 인터페이스()
		In1 i3 = () -> {
			// 무명함수식-> 람다식 , 화살표(arrow)
			System.out.println("람다식으로 m1매서드를 구현");
		};
		i3.m1();

	}

}
