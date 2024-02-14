package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {

		// 2. 객체를 생성하지 못함
//		new InterfaceEx1();

		InterfaceEx1Sub1 in1 = new InterfaceEx1Sub1();
		in1.ab1();
		in1.defaultmethod();
		in1.inter2();
		in1.inter2(1, "b");

		System.out.println();

		// 인터페이스는 객체를 생성X -> 반드시 구현객체를 통해서 실행
		InterfaceEx1 in02 = new InterfaceEx1Sub1();
		in02.ab1();
		in02.defaultmethod();

		System.out.println();

		InterfaceEx2 in2 = new InterfaceEx1Sub1();
		in2.inter2();
		in2.inter2(10, "bb");
	}

}
