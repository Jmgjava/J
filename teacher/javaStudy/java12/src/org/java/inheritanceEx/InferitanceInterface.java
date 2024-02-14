package org.java.inheritanceEx;

interface In1 {
//	public static final int NUM=100;
	int NUM = 100;

//	abstract void in1();
	void in1();
}

interface In2 { // extends In1
	void in2();
}

// 다중 상속 가능
interface In3 extends In1, In2 {
	void in3();
}

// 구현 클래스 -> 구현 객체 
// -> 인터페이스는 반드시 구현객체를 통해 구현
class InMain implements In3 {

	@Override
	public void in1() {
		System.out.println("in1");
	}

	@Override
	public void in2() {
		System.out.println("in2");
	}

	@Override
	public void in3() {
		System.out.println("in3");
	}
}

public class InferitanceInterface {

	public static void main(String[] args) {
		
		In1 in1 = new InMain();
		in1.in1();

		In2 in2 = new InMain();
		in2.in2();
//		in2.in2();

		In3 in3 = new InMain();
		in3.in1();
		in3.in2();
		in3.in3();

	}

}
