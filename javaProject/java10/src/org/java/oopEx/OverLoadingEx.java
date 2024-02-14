package org.java.oopEx;

public class OverLoadingEx {

	// 오버로딩 -> 메소드, 생성
	public void m1() {
		System.out.println("m1 메소드");
	}
	// 반환타입 X
//	public int m1() {}

	public void m1(int num1) {
		System.out.println("m1(int num1) 오버로딩, 매개변수 개수");
	}
	
	public void m1(String num1) {
		System.out.println("m1(String num1) 오버로딩, 매개변수 타입");
	}
	
	//매개변수 이름 X
//	public void m1(String num2) {}
	
	

}
