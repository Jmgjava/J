package org.java.oopEx;

public class Calculator3Main {

	public static void main(String[] args) {
		
		Calculator3 c1= new Calculator3();
		c1.setNum1(100);
		int num1=c1.getNum1();
		System.out.println(num1);
		
		c1.setNum2(200);
		int num2=c1.getNum2();
		System.out.println(num2);
		
		c1.setOp("+");
		String op=c1.getOp();
		System.out.println(op);
		
	}
}
