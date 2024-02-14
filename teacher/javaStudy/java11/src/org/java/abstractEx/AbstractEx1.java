package org.java.abstractEx;

// 추상클래스 -> 추상매서드가 있는 클래스 -> abstract class 
public abstract class AbstractEx1 {

	public int num1;
	public int num2;
	
	public void m1() {
		System.out.println("m1 매서드");
	}
	// 추상매서드->  선언부만 있고 구현부가 없는 매서드(미완성 매서드)
	public abstract void abstractMethod();
	
}
