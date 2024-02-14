package org.java.oopEx;

public class Calculator1 {

	public int num1;
	public int num2;
	public String op;

	// +
	public void sum() {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

	// -
	public void sub() {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}

	// *
	public void mult() {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	}

	// /
	public void div() {
		System.out.println(num1 + "/" + num2 + "=" + ((double) (num1 / num2)));
	}

	public void opMethod() {

		System.out.println(op + "연산 실행");

		if (op.equals("+")) {
//			System.out.println(num1+"+"+num2+"="+(num1+num2));
			this.sum();
		} else if (op.equals("-")) {
			this.sub();
		} else if (op.equals("*")) {
			this.mult();
		} else if (op.equals("/")) {
			this.div();
		} else {
			System.out.println("연산자 입력 오류");
		}

	}

	
	

}
