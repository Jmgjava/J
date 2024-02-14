package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {

		// 2. 객체를 생성 못한다.
//		new InterfaceEx1();

		InterfaceEx1Sub1 in0 = new InterfaceEx1Sub1();
		in0.ab1();
		in0.defaultMethod();
		in0.inter2();
		in0.inter2(100, 200);

		System.out.println();
		// 인터페이스는 객체를 생성 X -> 반드시 구현객체를 통해서 실행
		InterfaceEx1 in1 = new InterfaceEx1Sub1();
		in1.ab1();
		in1.defaultMethod();

		System.out.println();

		InterfaceEx2 in2 = new InterfaceEx1Sub1();
		in2.inter2();
		in2.inter2(200, 300);

	}
}
