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

class In1Sub implements In1 {
	@Override
	public void m1() {
		System.out.println("m1구현");
	}
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

public class AnnoymousEx1 {

	public static void main(String[] args) {
		// annoymouse class -> 익명(무명) 클래스(이름이없는 클래스)
		// 하나의 일만 한다. -> 구현객체 대신 사용

		In1 in1 = new InterMain();
		In2 in2 = new InterMain();
		In3 in3 = new InterMain();

		In1Sub insub1 = new In1Sub();
		insub1.m1();

//		new  구현할부모타입(인터페이스,클래스,추상클래스);

		In1 in12 = new In1() {
			// 오버라이딩(인터페이스)
			@Override
			public void m1() {
				System.out.println("anomymous클리스(익명클래스) 구현");
			}
		};
		in12.m1();

		// In2구현
		In2 i22 = new In2() {
			@Override
			public void m2() {
				System.out.println("anomymous클리스 m1구현");
			}
		};
		i22.m2();

		System.out.println("익명클래스 이용");
		// In3
		In3 in33 = new In3() {

			@Override
			public void m2() {
				System.out.println("m2");
			}

			@Override
			public void m1() {
				System.out.println("m1");
			}

			@Override
			public void m3() {
				System.out.println("m3");

			}
		};
		in33.m1();
		in33.m2();
		in33.m3();

	}
}
