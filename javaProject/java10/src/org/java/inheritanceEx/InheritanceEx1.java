package org.java.inheritanceEx;

// 자식클래스 extends 부모클래스
public class InheritanceEx1 extends Object {

	// Object 멤버
	public int num1;
	int num2;
	protected int num3;
	private int num4;

	public static final String PROJECT = "WEB2024";
	
	public void superM1() {
		System.out.println("부모클래스 메소드(super)");
	}

}
