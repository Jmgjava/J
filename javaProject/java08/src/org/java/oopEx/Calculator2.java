package org.java.oopEx;

public class Calculator2 {
	
	// 필드 X
	// 메소드 0
	
	public void opMethod(int num1, int num2, String op) {
		System.out.println(op + "연산 실행");

		if (op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		} else if (op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		} else if (op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		} else if (op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		} else {
			System.out.println("연산자 입력 오류");
		}

	}

}
