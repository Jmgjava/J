package org.java.InheritanceEx;

abstract class Ab1 {
	int a;

	// 추상메소드 (미완성) -> 반드시 오버라이딩 구현
	abstract void ab();

	void m1() {
		System.out.println("m1 일반메소드");
	}
}

class Ab1Sub1 extends Ab1 {
	@Override
	void ab() {
		System.out.println("부모 선택 메소드 m1");
	}

	@Override
	void m1() {
		System.out.println("추상메소드 반드시 구현");
	}
}

public class InheritanceAbstract {

	public static void main(String[] args) {

//		new Ab1();

		Ab1 ab1 = new Ab1Sub1();
		ab1.a = 10;
		ab1.ab();
		ab1.m1();

	}
}
