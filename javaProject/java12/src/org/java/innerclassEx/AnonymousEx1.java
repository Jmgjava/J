
package org.java.innerclassEx;

interface In1 {
	void m1();
}

interface In2 {
	void m2();
}

interface In3 extends In1, In2 {
	void m3();
}

class InterMain implements In3 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}

}

class In1Sub implements In1 {
	@Override
	public void m1() {
		System.out.println("In1 오버라이드");

	}
}

public class AnonymousEx1 {

	public static void main(String[] args) {
		// annoymous class -> 익명(무명) 클래스(이름이 없는 클래스)
		// 하나의 일만 한다. -> 구현객체 대신 사용

		In1 in1 = new InterMain();
		In2 in2 = new InterMain();
		In3 in3 = new InterMain();

		In1Sub sub1 = new In1Sub();

//		new 구현할부모타입(인터페이스, 클래스, 추상클래스);
		In1 in12 = new In1() {
			// 오버라이딩(인터페이스)
			@Override
			public void m1() {
				System.out.println("anonymous클래스(익명클래스) 구현,");
			}
		};
		in12.m1();

		// In2 구현
		In2 i22 = new In2() {

			@Override
			public void m2() {
				System.out.println("anonymous클래스 m1 구현,");

			}
		};
		i22.m2();

		System.out.println("익명 클래스 구현");
		// In3 구현
		In3 i33 = new In3() {

			@Override
			public void m1() {
				System.out.println("m1");

			}

			@Override
			public void m2() {
				System.out.println("m2");

			}

			@Override
			public void m3() {
				System.out.println("m3");

			}
		};
		i33.m1();
		i33.m2();
		i33.m3();

	}

}
