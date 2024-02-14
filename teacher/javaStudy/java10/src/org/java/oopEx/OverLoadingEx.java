package org.java.oopEx;

public class OverLoadingEx {

	//오버로딩 -> 매서드, 생성
	public void m1() {
		System.out.println("m1 매서드");
	}
	//반환타입 X
//	public int m1() {}
	public void m1(int num1) {
		System.out.println("m1() 오버로딩, 매개변수갯수");
	}
	public void m1(String num1) {
		System.out.println("m1() 오버로딩, 매개변수 타입");
	}
	//매개변수 이름X
//	public void m1(String num2) {}
	
	
}
