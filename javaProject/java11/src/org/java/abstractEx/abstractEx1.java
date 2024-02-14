package org.java.abstractEx;

// 추상클래스 -> 추상메소드가 있는 클래스 -> abstract class
public abstract class abstractEx1 {

	public int num1;
	public int num2;

	public void m1() {
		System.out.println("m1 메소드");
	}

	// 추상 메소드 -> 선언부만 있고 구현부가 없는 메소드(미완성 메소드)
	public abstract void abmethod1();
	public abstract void abmethod2();

}
