package org.java.inheritanceEx;

//테스트용 클래서
class A1 {
	int a;

	// 다형성(polymorphism)-> 오버로링
	public A1() {
		super();// 부모클래스(Object)의 생성자(기본생성자)
		System.out.println("A1기본생성자");
	}

	public A1(int a) {
//		this();//다른 생성자
//		this.a=10;//맴버 -> 필드
//		this.m1();//맴버 ->  매서드
		this.a = a;
	}

	void m1() {
		System.out.println("A1 m1()");
	}
}

class B1 extends A1 {
	int b;

	public B1() {
		super();// 부모클래스 -> A1클래스 기본생성자
	}

	void m2() {
		System.out.println("B1 m2()");
	}

	// 다형성(polymorphism)
	@Override
	void m1() {
		System.out.println("m1() 매서드, 오버라이딩");
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {

		A1 a1 = new A1(10);
		B1 b1 = new B1();
		// 다형성(polymorphism)
		A1 a2 = new B1();

	}

}
